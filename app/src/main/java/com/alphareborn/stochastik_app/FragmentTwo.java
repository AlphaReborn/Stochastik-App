package com.alphareborn.stochastik_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FragmentTwo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.fragment_two_layout,container,false); // "final View view = ..." ermöglicht view.findViewById


        RelativeLayout layout = (RelativeLayout) view.findViewById(R.id.layout2);
        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView text = (TextView) view.findViewById(R.id.text2);
                text.setText("Wuhuuu!!!!");

            }

        });
        return view;
    }
}
