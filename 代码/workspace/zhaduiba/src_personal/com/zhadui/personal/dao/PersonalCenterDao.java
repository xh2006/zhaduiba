package com.zhadui.personal.dao;

import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;

public interface PersonalCenterDao {

	/**
	 * 根据住建局获取一条用户信息
	 * @param userInfoId 用户主键
	 * @return UserInfo对象
	 * @author wang.xr
	 */
	public UserInfo getUserInfoById(int userInfoId);
	/**
	 * 根据主键获取用户详细信息
	 * @param UserinfoId 用户主键
	 * @return UserInfoDetail
	 * @author wang.xr
	 */
	public UserInfoDetail getUserInfoDetailById(int UserinfoId);
	/**
	 * 根据用户主键查询用户已扎的堆
	 * @param userId 用户主键
	 * @return List<DuierStatus>
	 * @author wang.xr
	 */
	public List<DuierStatus> getDuierStatusListByUserId(int userId);
	/**
	 * 统计已扎堆数量
	 * @param userId 用户主键
	 * @return 数量
	 * @author wang.xr
	 */
	public int countJoinedDuierByUserId(int userId);
	/**
	 * 根据用户主键获取以创建的堆
	 * @param userId 用户主键
	 * @return List<DuierInfo>
	 * @author wang.xr
	 */
	public List<DuierInfo> getCreatedDuierListByUserId(int userId);
	/**
	 * 统计已垒堆数量
	 * @param userId 用户主键
	 * @return 数量
	 * @author wang.xr
	 */
	public int countCreatedDuierByUserId(int userId);
	/**
	 * 根据用户主键查找用户承接的堆信息列表
	 * @param userId 用户主键
	 * @return List<DuierUndertakeInfo>
	 * @author wang.xr
	 */
	public List<DuierUndertakeInfo> getUndertakedDuierListByUserId(int userId);
	/**
	 * 统计已承接堆数量
	 * @param userId 用户主键
	 * @return 数量
	 * @author wang.xr
	 */
	public int countUndertakeredDuierByUserId(int userId);
	/**
	 * 修改用户基本信息
	 * @param userInfo
	 * @author wang.xr
	 */
	public void updateUserInfo(UserInfo userInfo);
	/**
	 * 修改用户详细信息
	 * @param userInfoDetail
	 * @author wang.xr
	 */
	public void updateUserInfoDetail(UserInfoDetail userInfoDetail);
	/**
	 * 修改密码
	 * @param map 
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void updatePassword(Map map);
	/**
	 * 修改邮箱
	 * @param map
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void updateEmail(Map map);
	/**
	 * 判断手机号码是否存在
	 * @param phone
	 * @return
	 * @author wang.xr
	 */
	public int isExitPhone(String phone);
	/**
	 * 修改手机
	 * @param map
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void updatePhone(Map map);
	/**
	 * 修改用户头像
	 * @param map
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void updateHeadImage(Map map);
}
