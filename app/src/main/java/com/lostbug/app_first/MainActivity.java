package com.lostbug.app_first;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.lostbug.app_first.adapters.MainAdapter;
import com.lostbug.app_first.base.BaseActivity;
import com.lostbug.app_first.base.BaseFragment;
import com.lostbug.app_first.client.ClientFragment;
import com.lostbug.app_first.home.HomeFragment;
import com.lostbug.app_first.mine.MineFragment;
import com.lostbug.app_first.orders.OrdersFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements ViewPager.OnPageChangeListener,BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView navigation;
    ViewPager mViewPage;
    final static String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setItemIconTintList(null);
        navigation.setOnNavigationItemSelectedListener(this);
        ArrayList<BaseFragment> fragments=new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new ClientFragment());
        fragments.add(new OrdersFragment());
        fragments.add(new MineFragment());
         mViewPage=(ViewPager)findViewById(R.id.main_viewPager);
        MainAdapter mainAdapter=new MainAdapter(getSupportFragmentManager(),fragments);
        mViewPage.setAdapter(mainAdapter);
        mViewPage.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.e(TAG,"当前界面"+position);
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
        Log.d(TAG,"当前id:"+item.getItemId());
        switch (item.getItemId()) {
                case R.id.navigation_home:
                    mViewPage.setCurrentItem(0);
                    return true;
                case R.id.navigation_client:
                    mViewPage.setCurrentItem(1);
                    return true;
                case R.id.navigation_orders:
                    mViewPage.setCurrentItem(2);
                    return true;
                case R.id.navigation_mine:
                    mViewPage.setCurrentItem(3);
                    return true;
                default:
                    return false;
            }
        }

}
