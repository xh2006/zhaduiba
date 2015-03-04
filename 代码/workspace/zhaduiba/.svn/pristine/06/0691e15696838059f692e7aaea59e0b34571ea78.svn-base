package com.zhadui.bg.biz;

import java.util.Date;

import com.zhadui.common.entity.User;

public interface UserBiz_bg {

	/**
	 * 根据用户名和密码查找用户信息
	 * @param account 用户账户
	 * @param pwd 用户密码
	 * @return User
	 * @author wang.xr
	 */
	public User getAdminUserByAccountAndPwd(String account,String pwd);
	/**
	 * 更新用户登录Ip和登录时间
	 * @param loginIp 登录ip地址
	 * @param loginTime 登录时间
	 * @param userId 用户主键
	 * @author wang.xr
	 */
	public void updateLoginIpAndTime(String loginIp,Date loginTime,int userId);
	/**
	 * 根据用户主键获取用户对应原密码
	 * @param userId 用户主键
	 * @return 用户原密码
	 * @author wang.xr
	 */
	public String getOldPasswordByUserId(int userId);
	/**
	 * 根据用户主键修改用户登录密码
	 * @param userId 用户主键
	 * @param password 要修改的密码
	 * @author wang.xr
	 */
	public void updatePasswordByUserId(int userId,String password);
	/**
	 * 根据主键获取用户
	 * @param userId 用户主键
	 * @return USer对象
	 * @author wang.xr
	 */
	public User getUserById(int userId);
}
