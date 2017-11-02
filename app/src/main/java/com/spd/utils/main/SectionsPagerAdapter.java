package com.spd.utils.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author :Reginer in  2017/11/2 13:58.
 *         联系方式:QQ:282921012
 *         功能描述:页卡
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragmentList;

    SectionsPagerAdapter(FragmentManager fm, List<Fragment> mFragmentList) {
        super(fm);
        this.mFragmentList = mFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
