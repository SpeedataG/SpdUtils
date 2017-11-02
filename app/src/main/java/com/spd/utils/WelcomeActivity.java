package com.spd.utils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.spd.utils.main.MainActivity;

/**
 * @author :Reginer in  2017/11/1 11:34.
 *         联系方式:QQ:282921012
 *         功能描述:欢迎页
 */
public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
