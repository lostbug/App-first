package com.lostbug.app_first.client;

import android.view.View;

import com.lostbug.app_first.R;
import com.lostbug.app_first.base.BaseFragment;

/**
 * Created by rocka on 2017/9/10.
 */

public class ClientFragment extends BaseFragment {
    @Override
    public int getFragmentViewId() {
        return R.layout.fragment_client;
    }

    @Override
    public BaseFragment getFragmentInstance() {
        return new ClientFragment();
    }

    @Override
    public void setViewClick(View v) {

    }
}
