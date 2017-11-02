package com.spd.utils.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.spd.base.BaseActivity;
import com.spd.utils.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :Reginer in  2017/11/1 11:03.
 *         联系方式:QQ:282921012
 *         功能描述:主页
 */
public class MainActivity extends BaseActivity implements TabLayout.OnTabSelectedListener {
    private ViewPager mVpContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getActLayoutId() {
        return R.layout.activity_main;
    }

    @SuppressWarnings("ConstantConditions")
    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
        mToolBar.setNavigationIcon(null);
        List<Fragment> mFragmentList = new ArrayList<>();
        mFragmentList.add(new UtilsFragment());
        mFragmentList.add(new ModuleFragment());
        mFragmentList.add(new OverallFragment());
        SectionsPagerAdapter mAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), mFragmentList);
        mVpContainer = findViewById(R.id.vp_container);
        TabLayout mTabMain = findViewById(R.id.tab_main);
        mTabMain.setupWithViewPager(mVpContainer);
        mVpContainer.setAdapter(mAdapter);
        mTabMain.getTabAt(0).setText(R.string.utils).setIcon(R.drawable.tab_utils);
        mTabMain.getTabAt(1).setText(R.string.module).setIcon(R.drawable.tab_module);
        mTabMain.getTabAt(2).setText(R.string.overall).setIcon(R.drawable.tab_overall);
        mTabMain.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mVpContainer.setCurrentItem(tab.getPosition(), false);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
