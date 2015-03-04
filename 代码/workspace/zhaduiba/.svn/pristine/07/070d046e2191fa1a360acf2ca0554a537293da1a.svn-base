package com.zhadui.android.dao.impl;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.UserInfoDetailDao_A;
import com.zhadui.common.entity.UserInfoDetail;

public class UserInfoDetailDaoImpl_A extends SqlSessionDaoSupport implements
		UserInfoDetailDao_A {

	@Override
	public UserInfoDetail getUserInfoDetailById(int id) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.Android_userInfoDetailManage.getUserInfoDetailById", id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean updateUserInfoDetailFriends(Map map) {
		boolean flag=false;
		int n=this.getSqlSession().update("com.zhadui.android.dao.impl.Android_userInfoDetailManage.updateUserInfoDetailFriends",map);
		if(n>0)
			flag=true;
		return flag;
	}

	@Override
	public void insertUserInfoDetails(Map map) {
		this.getSqlSession().insert("com.zhadui.android.dao.impl.Android_userInfoDetailManage.insertUserInfoDetails",map);		
	}

}
