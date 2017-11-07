package com.spd.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.ArrayMap;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;


/**
 * @author :Reginer in  2017/5/9 10:23.
 *         联系方式:QQ:282921012
 *         功能描述:Activity相关工具类
 */
public final class ActivityUtils {

    private ActivityUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 判断是否存在Activity
     *
     * @param packageName 包名
     * @param className   activity全路径类名
     * @return {@code true}: 是<br>{@code false}: 否
     */
    public static boolean isActivityExists(Context context, String packageName, String className) {
        Intent intent = new Intent();
        intent.setClassName(packageName, className);
        return !(context.getPackageManager().resolveActivity(intent, 0) == null ||
                intent.resolveActivity(context.getPackageManager()) == null ||
                context.getPackageManager().queryIntentActivities(intent, 0).size() == 0);
    }

    /**
     * 获取Activity的Label.
     *
     * @param context       context
     * @param componentName ComponentName
     * @return Label
     */
    public static String getActivityLabel(Context context, ComponentName componentName) {
        PackageManager pm = context.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(componentName, 0);
            return activityInfo.loadLabel(pm).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 打开Activity
     *
     * @param context     context
     * @param packageName 包名
     * @param className   全类名
     */
    public static void launchActivity(Context context, String packageName, String className) {
        launchActivity(context, packageName, className, null);
    }

    /**
     * 打开Activity
     *
     * @param packageName 包名
     * @param className   全类名
     * @param bundle      bundle
     */
    public static void launchActivity(Context context, String packageName, String className, Bundle bundle) {
        context.startActivity(getComponentIntent(packageName, className, bundle));
    }

    /**
     * 获取launcher activity
     *
     * @param packageName 包名
     * @return launcher activity
     */
    public static String getLauncherActivity(Context context, String packageName) {
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PackageManager pm = context.getPackageManager();
        List<ResolveInfo> infos = pm.queryIntentActivities(intent, 0);
        for (ResolveInfo info : infos) {
            if (info.activityInfo.packageName.equals(packageName)) {
                return info.activityInfo.name;
            }
        }
        return "no " + packageName;
    }


    /**
     * 获取栈顶Activity
     *
     * @return 栈顶Activity
     */
    public static Activity getTopActivity() {
        try {
            @SuppressLint("PrivateApi") Class activityThreadClass = Class.forName("android.app.ActivityThread");
            @SuppressWarnings("unchecked")
            Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
            Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
            activitiesField.setAccessible(true);
            Map activities;
            activities = (ArrayMap) activitiesField.get(activityThread);
            for (Object activityRecord : activities.values()) {
                Class activityRecordClass = activityRecord.getClass();
                Field pausedField = activityRecordClass.getDeclaredField("paused");
                pausedField.setAccessible(true);
                if (!pausedField.getBoolean(activityRecord)) {
                    Field activityField = activityRecordClass.getDeclaredField("activity");
                    activityField.setAccessible(true);
                    return (Activity) activityField.get(activityRecord);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Intent getComponentIntent(String packageName, String className, Bundle bundle) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        ComponentName cn = new ComponentName(packageName, className);
        intent.setComponent(cn);
        return intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    }
}
