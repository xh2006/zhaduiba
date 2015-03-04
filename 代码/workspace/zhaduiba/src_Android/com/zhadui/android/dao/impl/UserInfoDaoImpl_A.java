package com.zhadui.android.dao.impl;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.UserInfoDao_A;
import com.zhadui.common.entity.UserInfo;

public class UserInfoDaoImpl_A extends SqlSessionDaoSupport implements UserInfoDao_A {

	@Override
	public UserInfo getUserByPhoneAndPwd(UserInfo userInfo) {
		return getSqlSession().selectOne("com.zhadui.android.dao.impl.A_userInfoManage.getUserByPhoneAndPwd",userInfo);
	}
	@Override
	public UserInfo getUserByAcountAndPwd(UserInfo userInfo) {
		return getSqlSession().selectOne("com.zhadui.android.dao.impl.A_userInfoManage.getUserByAcountAndPwd",userInfo);
	}
	@Override
	public UserInfo getUserInfoById(int Id) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_userInfoManage.getUserById",Id);
	}
	public int insertUserAndGetUserId(UserInfo userInfo) {
		this.getSqlSession().insert("com.zhadui.android.dao.impl.A_userInfoManage.insertUser",userInfo);
		int userId=userInfo.getUserInfoId();
		return userId;
	}

	
}
