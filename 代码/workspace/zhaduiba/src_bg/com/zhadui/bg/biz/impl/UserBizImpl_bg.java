package com.zhadui.bg.biz.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.zhadui.bg.biz.UserBiz_bg;
import com.zhadui.bg.dao.UserDao_bg;
import com.zhadui.common.encrypt.MD5Util;
import com.zhadui.common.entity.User;

public class UserBizImpl_bg implements UserBiz_bg {

	private UserDao_bg userDaoBg;
	
	public void setUserDaoBg(UserDao_bg userDaoBg) {
		this.userDaoBg = userDaoBg;
	}

	@Override
	public User getAdminUserByAccountAndPwd(String account, String pwd) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("account",account);
		map.put("pwd",pwd);
		return userDaoBg.getUserByAccountAndPwd(map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void updateLoginIpAndTime(String loginIp, Date loginTime,int userId) {
		Map map=new HashMap();
		map.put("loginIp",loginIp);
		map.put("loginTime",loginTime);
		map.put("userId",userId);
		userDaoBg.updateLoginIpAndTime(map);
	}

	@Override
	public String getOldPasswordByUserId(int userId) {
		// TODO Auto-generated method stub
		return userDaoBg.getUserPasswordById(userId);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void updatePasswordByUserId(int userId, String password) {
		Map map=new HashMap();
		map.put("password",password);
		map.put("userId",userId);
		userDaoBg.updatePasswordById(map);
	}

	@Override
	public User getUserById(int userId) {
		return userDaoBg.getUserbyId(userId);
	}

}
