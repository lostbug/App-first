package com.lostbug.app_first.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.lostbug.app_first.R;

/**
 * Created by rocka on 2017/9/10.
 */

public abstract class BaseFragment extends Fragment {
    public abstract int getFragmentViewId();

    public abstract void setViewClick(View v);
    public boolean hasMenu = false;
    public int menuId = 0;

    public abstract void setMenu();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(getFragmentViewId(), container, false);
        setViewClick(v);
        setMenu();
        setHasOptionsMenu(hasMenu);
        return v;
    }

    @Override
    public void setHasOptionsMenu(boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(menuId, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_message:
                return true;
            case R.id.menu_new_customer:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
