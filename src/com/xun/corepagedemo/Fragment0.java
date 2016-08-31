package com.xun.corepagedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.wenba.bangbang.corepage.CorePageFragment;
import com.wenba.bangbang.corepage.core.CoreAnim;

public class Fragment0 extends CorePageFragment implements OnClickListener {
	private Button openPageBtn;

	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View rootView = (ViewGroup) inflater.inflate(R.layout.activity_core_page_main, null);
		openPageBtn = (Button) rootView.findViewById(R.id.open_new_page_btn);
		openPageBtn.setOnClickListener(this);
		return rootView;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.open_new_page_btn:
			openPage(Fragment1.class.getSimpleName(), null, CoreAnim.slide);
			break;

		default:
			break;
		}
	}
}
