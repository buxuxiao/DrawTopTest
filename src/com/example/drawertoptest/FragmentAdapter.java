package com.example.drawertoptest;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
	private ArrayList<Fragment> list;

	public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> list) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.list = list;

	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 100;
	}
}
