/**
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wenba.bangbang.corepage.core;

import android.content.Context;

/**
 * 全局配置类
 */
public class CoreConfig {
	/**
	 * Atlas支持 start
	 */
	private static boolean isOpenAtlas = false;
	private static ClassLoader mBundleClassLoader = null;

	public static boolean isOpenAtlas() {
		return isOpenAtlas;
	}

	public static void setIsOpenAtlas(boolean isOpenAtlasFlag) {
		isOpenAtlas = isOpenAtlasFlag;
	}

	public static ClassLoader getBundleClassLoader() {
		return mBundleClassLoader;
	}

	public static void setBundleClassLoader(ClassLoader classLoader) {
		mBundleClassLoader = classLoader;
	}

	/**
	 * Atlas支持 end
	 */
	public final static String ACTION_EXIT_APP = "cn.edu.zafu.library.exit";
	// 本地广播退出

	private static Context mContext;

	/**
	 * 默认初始化，配置文件在assets/page.json
	 * 
	 * @param context
	 *            上下文
	 */
	public static void init(Context context) {
		mContext = context.getApplicationContext();
		CorePageManager.getInstance().init(mContext);
	}

	/**
	 * 自定义初始化，配置文件信息由外部传入。
	 * 
	 * @param context
	 *            上下文
	 * @param pageJson
	 *            配置的json
	 */
	public static void init(Context context, String pageJson) {
		mContext = context.getApplicationContext();
		CorePageManager.getInstance().init(mContext, pageJson);
	}

	public static void readConfig(String pageJson) {
		CorePageManager.getInstance().readConfig(pageJson);
	}

}
