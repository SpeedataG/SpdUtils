package com.spd.database.view.presenter;

import com.spd.base.BaseActivity;
import com.spd.base.BasePresenter;
import com.spd.database.view.contract.DatabaseContract;
import com.spd.database.view.model.DatabaseModel;

/**
 * @author :Reginer in  2017/11/6 14:35.
 *         联系方式:QQ:282921012
 *         功能描述:
 */
public class DatabasePresenter extends BasePresenter<BaseActivity,DatabaseModel>implements DatabaseContract.Presenter {
    @Override
    protected DatabaseModel createModel() {
        return new DatabaseModel();
    }
}
