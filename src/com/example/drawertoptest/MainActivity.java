package com.example.drawertoptest;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

	private ViewPager viewPager;
	private ArrayList<Fragment> list;
	private FragmentAdapter adapter;
	public static final int pics[] = { R.drawable.p2, R.drawable.p3,
			R.drawable.p4, R.drawable.p5 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
		initData();
	}

	private void initView() {
		// TODO Auto-generated method stub
		viewPager = (ViewPager) findViewById(R.id.viewPager1);
		list = new ArrayList<Fragment>();
		adapter = new FragmentAdapter(getSupportFragmentManager(), list);
		viewPager.setAdapter(adapter);
		viewPager.setPageTransformer(true, new ZoomPagerTransform());
	}

	private void initData() {
		// TODO Auto-generated method stub
		for (int i = 0; i < pics.length; i++) {
			ImageFragment imageFragment = new ImageFragment(pics[i]);
			list.add(imageFragment);
		}
		adapter.notifyDataSetChanged();
	}
}
