package com.spd.database.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.spd.base.BaseActivity;
import com.spd.database.R;

/**
 * @author :Reginer in  2017/11/6 14:18.
 *         联系方式:QQ:282921012
 *         功能描述:菜单
 */
public class MenuActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_menu);
    }

    @Override
    protected int getActLayoutId() {
        return R.layout.activity_menu;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {

        findViewById(R.id.one).setOnClickListener(this);
        findViewById(R.id.many).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.one) {
            startActivity(new Intent(this, OneActivity.class));
        } else if (v.getId() == R.id.many) {
            startActivity(new Intent(this, ManyActivity.class));
        }
    }
}
