package com.spd.utils.main;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.spd.utils.R;

import java.util.List;


/**
 * @author :Reginer in  2017/11/6 15:21.
 *         联系方式:QQ:282921012
 *         功能描述:功能列表
 */
public class ContentAdapter extends BaseQuickAdapter<String, BaseViewHolder> {


    ContentAdapter(@Nullable List<String> data) {
        super(R.layout.view_item_main_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_title, item);
    }
}
