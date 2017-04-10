package com.example.killercon.trainfragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TwoFragment extends Fragment {

    public static TwoFragment newInstance() {
        TwoFragment fragment = new TwoFragment();
        return fragment;
    }

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);

        return rootView;
    }

}
