package com.xun.corepagedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenba.bangbang.corepage.CorePageFragment;

public class Fragment1 extends CorePageFragment {
	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View rootView = LayoutInflater.from(getContext()).inflate(R.layout.fragment1_layout, null);
		return rootView;
	}
}
