package com.zhadui.android.dao;

import java.util.Map;

import com.zhadui.common.entity.UserInfoDetail;

public interface UserInfoDetailDao_A {

	/**
	 * 根据主键获取某一用户详细信息
	 * @param id 用户主键
	 * @return UserInfoDetail
	 * @author wang.xr
	 */
	public UserInfoDetail getUserInfoDetailById(int id);
	/**
	 * 更新用户朋友信息
	 * @param map
	 * @return
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public boolean updateUserInfoDetailFriends(Map map);
	/**
	 * 添加用户详细信息记录
	 * @param map
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void insertUserInfoDetails(Map map);
}
