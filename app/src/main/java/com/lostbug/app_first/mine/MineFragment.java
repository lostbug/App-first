package com.lostbug.app_first.mine;

import android.view.View;

import com.lostbug.app_first.R;
import com.lostbug.app_first.base.BaseFragment;

/**
 * Created by rocka on 2017/9/10.
 */

public class MineFragment extends BaseFragment {
    @Override
    public int getFragmentViewId() {
        return R.layout.fragment_mine;
    }

    @Override
    public BaseFragment getFragmentInstance() {
        return new MineFragment();
    }

    @Override
    public void setViewClick(View v) {

    }
}
