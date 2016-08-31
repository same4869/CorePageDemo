package com.xun.corepagedemo;

import android.os.Bundle;

import com.wenba.bangbang.corepage.CorePageActivity;
import com.wenba.bangbang.corepage.core.CoreAnim;
import com.wenba.bangbang.corepage.core.CoreConfig;

//http://blog.csdn.net/sbsujjbcy/article/details/47060211
public class CorePageMainActivity extends CorePageActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CoreConfig.init(this);
		openPage(Fragment0.class.getSimpleName(), null, CoreAnim.none, true);
	}

}
