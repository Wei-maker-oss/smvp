package com.example.lx01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;

public class MainActivity extends AppCompatActivity {

    private Banner homeBanner;
    private TabLayout homeTab;
    private ViewPager homeVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        homeBanner = (Banner) findViewById(R.id.home_banner);
        homeTab = (TabLayout) findViewById(R.id.home_tab);
        homeVp = (ViewPager) findViewById(R.id.home_vp);
    }
}