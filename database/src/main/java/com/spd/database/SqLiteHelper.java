package com.spd.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * @author :Reginer in  2017/9/10 13:37.
 *         联系方式:QQ:282921012
 *         功能描述:数据库帮助类
 */
public class SqLiteHelper extends DaoMaster.OpenHelper {
    SqLiteHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
