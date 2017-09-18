package com.spd.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.spd.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getActLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        mToolBar.setNavigationIcon(null);
    }
}
