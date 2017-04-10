package com.example.killercon.trainfragment2;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class OneFragment extends Fragment {
    //private static final String KEY_STRING = "key_string";
    TextView textView1;


    public static OneFragment newInstance() {
        OneFragment fragment = new OneFragment();
/*
        Bundle bundle = new Bundle();
        bundle.putString(KEY_STRING, str);
        fragment.setArgument(bundle);
*/
        return fragment;
    }

    public OneFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        textView1 = (TextView)rootView.findViewById(R.id.textView1);

        return rootView;
    }

    public String getMyText() {
        return textView1.getText().toString();
    }


}
