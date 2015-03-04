package com.zhadui.bg.dao;

import java.util.List;

import com.zhadui.common.entity.AppInfo;

public interface AppInfoDao_bg {

	/**
	 * 查找应用列表
	 * @return
	 * @author wang.xr
	 */
	public List<AppInfo> loadAppInfoList();
	/**
	 * 根据主键删除应用信息
	 * @param appId
	 * @author wang.xr
	 */
	public void deleteAppById(int appId);
	/**
	 * 添加应用信息
	 * @param appInfo 应用信息对象
	 * @author wang.xr
	 */
	public void addAppInfo(AppInfo appInfo);
}
