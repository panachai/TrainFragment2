package com.example.killercon.trainfragment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    MyPagerAdapter adapter;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager = (ViewPager) findViewById(R.id.pager);//ทำ view pager
        pager.setAdapter(adapter);

        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });

        Button btn_prev = (Button)findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() - 1);
            }
        });

//request button
        Button btn_request = (Button)findViewById(R.id.btn_request);
        btn_request.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Fragment fragment = getActiveFragment(pager, 2);
                ThreeFragment threeFragment = (ThreeFragment)fragment;
                if(threeFragment != null) {
                    String message = threeFragment.getMyText();
                    Log.i("Check", message);
                }
            }
        });

    }

    //ดึงข้อมูลว่า fragment อะไรกำลังแสดงอย่างบนหน้า activity
    public Fragment getActiveFragment(ViewPager container, int position) {
        String name = "android:switcher:" + container.getId() + ":" + position;
        return getSupportFragmentManager().findFragmentByTag(name);
    }
}
