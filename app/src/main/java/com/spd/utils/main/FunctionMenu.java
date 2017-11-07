package com.spd.utils.main;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import com.spd.utils.ActivityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :Reginer in  2017/11/6 15:02.
 *         联系方式:QQ:282921012
 *         功能描述:功能菜单
 */
class FunctionMenu {
    static final String MODULE_CATEGORY = "spd.intent.category.MODULE";
    static final String OVERALL_CATEGORY = "spd.intent.category.OVERALL";
    static final String UTILS_CATEGORY = "spd.intent.category.CATEGORY";

    /**
     * 获取Activity列表.
     *
     * @param context  context
     * @param category 过滤
     * @return Activity列表
     */
    static List<ResolveInfo> getActList(Context context, String category) {
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(category);
        PackageManager pm = context.getPackageManager();
        return pm.queryIntentActivities(intent, 0);
    }

    /**
     * 获取label列表.
     *
     * @param context  context
     * @param category 过滤
     * @return label列表
     */
    static List<String> getTitleList(Context context, String category) {
        List<String> labelList = new ArrayList<>();
        for (ResolveInfo resolveInfo : getActList(context, category)) {
            labelList.add(ActivityUtils.getActivityLabel(context, new
                    ComponentName(resolveInfo.activityInfo.applicationInfo.packageName,
                    resolveInfo.activityInfo.name)));
        }
        return labelList;
    }
}
