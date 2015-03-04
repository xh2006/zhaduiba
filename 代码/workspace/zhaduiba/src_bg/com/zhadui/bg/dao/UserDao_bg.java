package com.zhadui.bg.dao;

import java.util.Map;

import com.zhadui.common.entity.User;

public interface UserDao_bg {

	/**
	 * 更具用户帐号的密码获取用户对象
	 * @param map 存储用户帐号和密码
	 * @return User对象
	 * @author wang.xr
	 */
	public User getUserByAccountAndPwd(Map<String,String> map);
	/**
	 * 更新用户登录IP和时间
	 * @param map 
	 * @author wang.xr
	 */
	public void updateLoginIpAndTime(Map<String,String> map);
	/**
	 * 根据用户主键获取用户登录密码
	 * @param userId 用户主键
	 * @return String用户密码
	 * @author wang.xr
	 */
	public String getUserPasswordById(int userId);
	/**
	 * 修改用户登录密码
	 * @param map
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void updatePasswordById(Map map);
	/**
	 * 根据主键获取用户对象
	 * @param userId 用户主键
	 * @return User
	 * @author wang.xr
	 */
	public User getUserbyId(int userId);
}
