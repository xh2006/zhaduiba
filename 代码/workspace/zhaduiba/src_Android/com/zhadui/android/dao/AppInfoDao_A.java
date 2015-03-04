package com.zhadui.android.dao;

import com.zhadui.common.entity.AppInfo;

public interface AppInfoDao_A {

	/**
	 * 查询代码版本最新的appInfo
	 * @return AppInfo
	 * @author wang.xr
	 */
	public AppInfo getMaxCodeVersionAppInfo();
}
