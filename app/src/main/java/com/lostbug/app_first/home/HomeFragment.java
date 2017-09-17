package com.lostbug.app_first.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    public void setViewClick(View v) {

    }


    @Override
    public void setMenu() {
        menuId=R.menu.menu_message;
        hasMenu=true;
    }
}
