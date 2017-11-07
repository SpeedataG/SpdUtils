package com.spd.utils.main;


import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.spd.base.BaseFragment;
import com.spd.utils.R;

import java.util.List;

/**
 * @author :Reginer in  2017/11/2 12:26.
 *         联系方式:QQ:282921012
 *         功能描述:工具类页面
 */
public class UtilsFragment extends BaseFragment implements BaseQuickAdapter.OnItemClickListener {


    public UtilsFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_menu;
    }

    @Override
    protected void initView(View view, @Nullable Bundle savedInstanceState) {
        ContentAdapter mAdapter = new ContentAdapter(FunctionMenu.getTitleList(mContext, FunctionMenu.UTILS_CATEGORY));
        RecyclerView mRecyclerView = view.findViewById(R.id.rv_content);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(mContext, LinearLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        List<ResolveInfo> resolveInfoList = FunctionMenu.getActList(mContext, FunctionMenu.UTILS_CATEGORY);
        Intent intent = new Intent();
        intent.setClassName(resolveInfoList.get(position).activityInfo.applicationInfo.packageName,
                resolveInfoList.get(position).activityInfo.name);
        startActivity(intent);
    }
}
