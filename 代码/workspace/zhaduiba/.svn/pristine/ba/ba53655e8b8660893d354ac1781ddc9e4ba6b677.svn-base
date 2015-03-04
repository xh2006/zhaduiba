package com.zhadui.android.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.AppInfoDao_A;
import com.zhadui.common.entity.AppInfo;

public class AppInfoDaoImpl_A extends SqlSessionDaoSupport implements AppInfoDao_A {

	@Override
	public AppInfo getMaxCodeVersionAppInfo() {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_appInfoManage.getMaxCodeVersionAppInfo");
	}

}
