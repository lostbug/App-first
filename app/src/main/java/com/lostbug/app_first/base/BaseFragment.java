package com.lostbug.app_first.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rocka on 2017/9/10.
 */

public abstract class BaseFragment extends Fragment {
    public abstract int getFragmentViewId();
    public abstract void setViewClick(View v);
    public abstract  BaseFragment getFragmentInstance();
    private static BaseFragment fragment;
    public  BaseFragment newInstance(){
        if(fragment==null){
            fragment=getFragmentInstance() ;
        }
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(getFragmentViewId(),container,false);
        setViewClick(v);
        return v;
    }

}
