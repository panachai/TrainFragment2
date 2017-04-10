package com.example.killercon.trainfragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class ThreeFragment extends Fragment {
    TextView textView1;

    public static ThreeFragment newInstance() {
        ThreeFragment fragment = new ThreeFragment();
        return fragment;
    }

    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        textView1 = (TextView)rootView.findViewById(R.id.textView1);

        return rootView;
    }

    public String getMyText() {
        return textView1.getText().toString();
    }


}
