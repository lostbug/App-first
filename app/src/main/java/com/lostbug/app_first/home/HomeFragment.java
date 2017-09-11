package com.lostbug.app_first.home;

import android.view.View;

import com.lostbug.app_first.R;
import com.lostbug.app_first.base.BaseFragment;

/**
 * Created by rocka on 2017/9/10.
 */

public class HomeFragment extends BaseFragment {
    @Override
    public int getFragmentViewId() {
        return R.layout.fragment_home;
    }

    @Override
    public BaseFragment getFragmentInstance() {
        return new HomeFragment();
    }

    @Override
    public void setViewClick(View v) {

    }
}
