package com.zhadui.front.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.common.entity.UserProfile;
import com.zhadui.front.dao.UserInfoDao;

public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {

	@Override
	public UserInfo getUserById(int id) {
		return getSqlSession().selectOne("com.zhadui.front.dao.impl.UserInfoManage.getUserInfoById",id);
	}

	@Override
	public UserInfo getUserByPhoneNumber(String phoneNumber) {
		return getSqlSession().selectOne("com.zhadui.front.dao.impl.UserInfoManage.getUserInfoByPhoneNumber", phoneNumber);
	}
	
	@Override
	public int isExisted(String name, String value) {
		Map<String, String>param = new HashMap<String, String>();
		param.put("item_name", name);
		param.put("item_value", value);
		int n = getSqlSession().selectOne("com.zhadui.front.dao.impl.UserInfoManage.isExisted", param);
	
		if(n > 1){
			// 记录日志
		}
		return n;
	}

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		getSqlSession().insert("com.zhadui.front.dao.impl.UserInfoManage.insertUserInfo", userInfo);		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		getSqlSession().update("com.zhadui.front.dao.impl.UserInfoManage.updateUserInfo", userInfo);		
	}
	
	@Override
	public void updateUserInfoDetail(UserInfoDetail userInfoDetail) {
		getSqlSession().update("com.zhadui.front.dao.impl.UserInfoManage.updateUserInfoDetail", userInfoDetail);	
	}
	
	@Override
	public void updateUserHeader(int id, String headerImgPath) {
		Map<String, Object>param = new HashMap<String, Object>();
		param.put("id", id);
		param.put("headerImgPath", headerImgPath);
		getSqlSession().update("com.zhadui.front.dao.impl.UserInfoManage.updateUserHeaderImgById", param);			
	}

	@Override
	public void updateUserlastLoginTime(int id, Date loginTime) {
		Map<String, Object>param = new HashMap<String, Object>();
		param.put("id", id);
		param.put("userLastLoginTime", loginTime);
		getSqlSession().update("com.zhadui.front.dao.impl.UserInfoManage.updateUserLastLoginTimeById", param);		
	}

	@Override
	public int register(UserInfo userInfo) {
		Map<String, Object>param = new HashMap<String, Object>();

		getSqlSession().insert("com.zhadui.front.dao.impl.UserInfoManage.register", userInfo);
		int userInfoId = userInfo.getUserInfoId();
		// 给用户插入userInfoDetail记录
		param.put("id", userInfoId);
		param.put("createTime", userInfo.getUserInfoLastLoginTime());
		getSqlSession().insert("com.zhadui.front.dao.impl.UserInfoManage.insertDuierInfoDetail", param);
		return userInfoId;
	}

	@Override
	public UserInfo login(String phoneNumber, String password) {
		Map<String, String>param = new HashMap<String, String>();
		param.put("phoneNumber", phoneNumber);
		param.put("password", password);

		return getSqlSession().selectOne("com.zhadui.front.dao.impl.UserInfoManage.login", param);
	}

	@Override
	public UserProfile getUserShowInfoByUserId(int id) {
		return getSqlSession().selectOne("com.zhadui.front.dao.impl.UserInfoManage.getUserShowInfoByUserId",id);
	}



}
