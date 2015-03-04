package com.zhadui.bg.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.bg.dao.AppInfoDao_bg;
import com.zhadui.common.entity.AppInfo;

public class AppInfoDaoImpl_bg extends SqlSessionDaoSupport implements AppInfoDao_bg {

	@Override
	public List<AppInfo> loadAppInfoList() {
		return this.getSqlSession().selectList("com.zhadui.bg.dao.impl.WB_appinfoManage.getAppInfoList");
	}

	@Override
	public void deleteAppById(int appId) {
		this.getSqlSession().delete("com.zhadui.bg.dao.impl.WB_appinfoManage.deleteAppInfoById",appId);
	}

	@Override
	public void addAppInfo(AppInfo appInfo) {
		this.getSqlSession().insert("com.zhadui.bg.dao.impl.WB_appinfoManage.addAppInfo",appInfo);
	}

}
