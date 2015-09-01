package com.alphareborn.stochastik_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class FragmentFour extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.fragment_four_layout,container,false); // "final View view = ..." ermöglicht view.findViewById


        RelativeLayout layout = (RelativeLayout) view.findViewById(R.id.layout4);
        layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FragmentFour.this.getActivity(), BaumMenu.class);
                FragmentFour.this.startActivity(myIntent);

            }

        });
        return view;
    }
}