package com.example.killercon.trainfragment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;


public class MyPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_NUM = 3;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return PAGE_NUM;
    }

    public Fragment getItem(int position) {
        if (position == 0){
            Log.i("Check", "Get Item 0");
            return new OneFragment("Android,Development");  //test log
        }
        else if (position == 1)
            return new TwoFragment();
        else if (position == 2)
            return new ThreeFragment();
        return null;
    }
}
