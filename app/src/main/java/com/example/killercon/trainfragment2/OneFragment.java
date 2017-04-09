package com.example.killercon.trainfragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class OneFragment extends Fragment {
    String str;

    public OneFragment(String str) {
        this.str = str;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.i("Check", "OnCreateView");
        String[] text = str.split(",");
        Log.i("Check", text[0]);


        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        Button btn_close = (Button) rootView.findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                getFragmentManager().popBackStack();
            }
        });
        return rootView;
    }

    public void onDestroyView() {
        Log.i("Check", "OnDestroyView");
    }

}
