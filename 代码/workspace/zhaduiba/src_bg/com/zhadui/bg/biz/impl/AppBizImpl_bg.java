package com.zhadui.bg.biz.impl;

import java.util.List;

import com.zhadui.bg.biz.AppBiz_bg;
import com.zhadui.bg.dao.AppInfoDao_bg;
import com.zhadui.common.entity.AppInfo;

public class AppBizImpl_bg implements AppBiz_bg {

	private AppInfoDao_bg appInfoDaoBg;
	
	public void setAppInfoDaoBg(AppInfoDao_bg appInfoDaoBg) {
		this.appInfoDaoBg = appInfoDaoBg;
	}

	@Override
	public List<AppInfo> loadAppList() {
		// TODO Auto-generated method stub
		return appInfoDaoBg.loadAppInfoList();
	}

	@Override
	public void deleteAppById(int appId) {
		appInfoDaoBg.deleteAppById(appId);
	}

	@Override
	public void addApp(AppInfo appInfo) {
		appInfoDaoBg.addAppInfo(appInfo);
	}

}
