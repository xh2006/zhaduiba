package com.zhadui.bg.biz;

import java.util.List;

import com.zhadui.common.entity.AppInfo;

public interface AppBiz_bg {

	/**
	 * 获取应用历史信息
	 * @return List<AppInfo>
	 * @author wang.xr
	 */
	public List<AppInfo> loadAppList();
	/**
	 * 删除应用信息
	 * @param appId 主键
	 * @author wang.xr
	 */
	public void deleteAppById(int appId);
	/**
	 * 添加应用信息
	 * @param appInfo 应用对象
	 * @author wang.xr
	 */
	public void addApp(AppInfo appInfo);
}
