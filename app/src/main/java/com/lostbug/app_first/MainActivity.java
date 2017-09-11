package com.lostbug.app_first;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.lostbug.app_first.adapters.MainAdapter;
import com.lostbug.app_first.base.BaseFragment;
import com.lostbug.app_first.client.ClientFragment;
import com.lostbug.app_first.home.HomeFragment;
import com.lostbug.app_first.mine.MineFragment;
import com.lostbug.app_first.orders.OrdersFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener,NavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView navigation;
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.navigation_home:
//                    return true;
//                case R.id.navigation_client:
//
//                    return true;
//                case R.id.navigation_orders:
//
//                    return true;
//                case R.id.navigation_mine:
//                    return true;
//            }
//            return false;
//        }
//
//    };
//
//    public MainActivity(BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener) {
//        this.mOnNavigationItemSelectedListener = mOnNavigationItemSelectedListener;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        ArrayList<BaseFragment> fragments=new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new ClientFragment());
        fragments.add(new OrdersFragment());
        fragments.add(new MineFragment());
        ViewPager mViewPage=(ViewPager)findViewById(R.id.main_viewPager);
        MainAdapter mainAdapter=new MainAdapter(getSupportFragmentManager(),fragments);
        mViewPage.setAdapter(mainAdapter);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.e("当前界面",position+"");
        int id;
        switch (position){
            case 0:
                id=R.id.navigation_home;
                break;
            case 1:
                id=R.id.navigation_client;
                break;
            case 2:
                id=R.id.navigation_orders;
                break;
            case 3:
                id=R.id.navigation_mine;
                break;
            default:
                id=R.id.navigation_home;
                break;
        }
        navigation.setSelectedItemId(id);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_client:

                    return true;
                case R.id.navigation_orders:

                    return true;
                case R.id.navigation_mine:
                    return true;
            }
            return false;
        }

}
