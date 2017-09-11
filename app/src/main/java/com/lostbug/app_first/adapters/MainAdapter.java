package com.lostbug.app_first.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lostbug.app_first.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rocka on 2017/9/10.
 */

public class MainAdapter extends FragmentPagerAdapter {
    private ArrayList<BaseFragment> fragmentList;

    public MainAdapter(FragmentManager fm,ArrayList<BaseFragment> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
