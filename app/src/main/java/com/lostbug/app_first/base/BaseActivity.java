package com.lostbug.app_first.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.lostbug.app_first.R;

/**
 * Created by rocka on 2017/9/10.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        // 左侧图标点击事件使能
        getSupportActionBar().setHomeButtonEnabled(true);
        // 使左上角图标(系统)是否显示
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        // 显示标题
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        View actionbarLayout = LayoutInflater.from(this).inflate(
                R.layout.actionbar_layout, null);
        getSupportActionBar().setCustomView(actionbarLayout);
    }
}
