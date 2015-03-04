package com.zhadui.android.dao;

import java.util.Map;

import com.zhadui.common.entity.UserInfo;

public interface UserInfoDao_A {

	/**
	 * 根据电话号码和密码获取用户对象
	 * @param userInfo
	 * @return
	 * @author wang.xr
	 */
	public UserInfo getUserByPhoneAndPwd(UserInfo userInfo);
	/**
	 * 更具账户名和密码获取用户对象
	 * @param userInfo
	 * @return
	 * @author wang.xr
	 */
	public UserInfo getUserByAcountAndPwd(UserInfo userInfo);
	/**
	 * 根据主键获取一个用户对象
	 * @param Id
	 * @return
	 * @author wang.xr
	 */
	public UserInfo getUserInfoById(int Id);
	/**
	 * 插入一条用户信息，并获取插入记录的主键
	 * @param UserInfo
	 * @return
	 * @author wang.xr
	 */
	public int insertUserAndGetUserId(UserInfo userInfo);
}
