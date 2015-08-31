package com.alphareborn.stochastik_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDummyOne extends Fragment {
	
	ViewPager viewPager;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		// Set the title view to show the page number.
		return inflater.inflate(R.layout.fragmen_dummy_two,container,false);
	}
	
	public void onPageScrollStateChanged (int state) {
	    if (state == ViewPager.SCROLL_STATE_IDLE) {
	        int curr = viewPager.getCurrentItem();
	        int lastReal = viewPager.getAdapter().getCount() - 2;
	        if (curr == 0) {
	            viewPager.setCurrentItem(lastReal, false);
	        } else if (curr > lastReal) {
	            viewPager.setCurrentItem(1, false);
	        }
	    }
	}

}
