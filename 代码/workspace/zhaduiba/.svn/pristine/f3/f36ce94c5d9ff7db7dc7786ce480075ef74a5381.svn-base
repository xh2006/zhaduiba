package com.zhadui.bg.dao.impl;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.bg.dao.UserDao_bg;
import com.zhadui.common.entity.User;

public class UserDaoImpl_bg extends SqlSessionDaoSupport implements UserDao_bg {

	@Override
	public User getUserByAccountAndPwd(Map<String,String> map) {
		return this.getSqlSession().selectOne("com.zhadui.bg.dao.impl.WB_userManage.getUserByAccountAndPwd",map);
	}

	@Override
	public void updateLoginIpAndTime(Map<String, String> map) {
		this.getSqlSession().update("com.zhadui.bg.dao.impl.WB_userManage.updateLoginIpAndTime",map);
	}

	@Override
	public String getUserPasswordById(int userId) {
		return this.getSqlSession().selectOne("com.zhadui.bg.dao.impl.WB_userManage.getUserPasswordById",userId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updatePasswordById(Map map) {
		this.getSqlSession().update("com.zhadui.bg.dao.impl.WB_userManage.updatePasswordById",map);
	}

	@Override
	public User getUserbyId(int userId) {
		return this.getSqlSession().selectOne("com.zhadui.bg.dao.impl.WB_userManage.getUserById",userId);
	}

}
