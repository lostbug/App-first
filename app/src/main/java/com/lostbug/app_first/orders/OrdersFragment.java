package com.lostbug.app_first.orders;

import android.view.View;

import com.lostbug.app_first.R;
import com.lostbug.app_first.base.BaseFragment;

/**
 * Created by rocka on 2017/9/10.
 */

public class OrdersFragment extends BaseFragment {
    @Override
    public int getFragmentViewId() {
        return R.layout.fragment_orders;
    }

    @Override
    public void setViewClick(View v) {

    }

    @Override
    public BaseFragment getFragmentInstance() {
        return new OrdersFragment();
    }
}

