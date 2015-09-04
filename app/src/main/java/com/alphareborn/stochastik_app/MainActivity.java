package com.alphareborn.stochastik_app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;


public class MainActivity extends FragmentActivity {


    PagerAdapter mAdapter;
    ViewPager mPager;
    CirclePageIndicator mIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new PagerAdapter(getSupportFragmentManager());


        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);


        // Farbe und Größe der ViewPagerIndicator - Punkte
        final float density=getResources().getDisplayMetrics().density;

        mIndicator.setRadius(6 * density);
        mIndicator.setFillColor(0xFF888888);


    }

}
