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

import java.util.List;

import android.support.v4.app.Fragment;

import com.wenba.bangbang.corepage.CorePageFragment;

/**
 * 页面跳转接口，用于控制页面跳转或启动新的activity
 */
public interface CoreSwitcher {
	/**
	 * 返回到某一个页面（只有一个fragment时会关闭Activityt）
	 */
	void popPage();

	/**
	 * fragmentTag 是否在当前顶上activity上的最顶上的fragment
	 * 
	 * @param fragmentTag
	 *            fragment的tag
	 * @return 是否位于栈顶
	 */
	boolean isFragmentTop(String fragmentTag);

	/**
	 * 是否查找到某个page
	 * 
	 * @param pageName
	 *            页面名
	 * @return 是否找到
	 */
	boolean findPage(final String pageName);

	/**
	 * 跳转到某一个页面。
	 * 
	 * @param bean
	 *            CoreSwitchBean对象
	 * @return 打开的页面Fragment对象
	 */
	Fragment gotoPage(CoreSwitchBean bean);

	/**
	 * 打开一个新的页面
	 * 
	 * @param bean
	 *            CoreSwitchBean对象
	 * @return 打开的页面Fragment对象
	 */
	Fragment openPage(CoreSwitchBean bean);

	/**
	 * 移除当前Acitivity不需要的fragment
	 * 
	 * @param fragmentLists
	 *            无用fragment列表
	 */
	void removeUnlessFragment(List<String> fragmentLists);

	/**
	 * 结束当前activity
	 */
	void finishActivity();

	/**
	 * 结束当前activity
	 * 
	 * @param showAnimation
	 *            是否显示退场动画
	 */
	void finishActivity(boolean showAnimation);

	/**
	 * 清理所有的activity
	 * 
	 * @param retainTop
	 *            是否保留顶部activity
	 */
	void clearAllActivity(boolean retainTop);

	/**
	 * 页面跳转，支持跨Activity进行传递数据
	 * 
	 * @param page
	 *            CoreSwitchBean对象
	 * @param fragment
	 *            BaseFragment对象
	 * @return 打开的页面Fragment对象
	 */
	public Fragment openPageForResult(final CoreSwitchBean page, final CorePageFragment fragment);

	/**
	 * 根据名字来找到某一个fragment实例
	 * 
	 * @param pageName
	 *            页面名
	 * @return 页面Fragment对象
	 */
	public Fragment findFragmentByName(final String pageName);

}
