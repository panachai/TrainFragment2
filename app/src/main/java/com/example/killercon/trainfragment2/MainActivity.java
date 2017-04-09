package com.example.killercon.trainfragment2;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
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

    }
}
