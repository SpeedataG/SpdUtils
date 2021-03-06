package com.spd.utils.constant;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author :Reginer in  2017/11/3 10:10.
 *         联系方式:QQ:282921012
 *         功能描述:存储相关常量
 */
public final class MemoryConstants {
    /**
     * 换行符
     */
    public static final String ENTER = "\n";
    /**
     * Byte与Byte的倍数
     */
    public static final int BYTE = 1;
    /**
     * KB与Byte的倍数
     */
    public static final int KB = 1024;
    /**
     * MB与Byte的倍数
     */
    public static final int MB = 1048576;
    /**
     * GB与Byte的倍数
     */
    public static final int GB = 1073741824;

    @IntDef({BYTE, KB, MB, GB})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }
}
