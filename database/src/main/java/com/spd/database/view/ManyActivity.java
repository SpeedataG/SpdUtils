package com.spd.database.view;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.spd.base.BaseMvpActivity;
import com.spd.database.R;
import com.spd.database.view.presenter.DatabasePresenter;

/**
 * @author :Reginer in  2017/11/6 14:34.
 *         联系方式:QQ:282921012
 *         功能描述:多表操作
 */
public class ManyActivity extends BaseMvpActivity<DatabasePresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_many);
    }

    @Override
    protected int getActLayoutId() {
        return R.layout.activity_many;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {

    }

    @Override
    protected DatabasePresenter createPresenter() {
        return new DatabasePresenter();
    }
}
