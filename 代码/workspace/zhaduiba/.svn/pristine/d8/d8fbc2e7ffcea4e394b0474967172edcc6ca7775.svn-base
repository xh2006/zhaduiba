package com.zhadui.personal.biz;

import java.util.List;

import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;

public interface PersonalCenterBiz {
	
	/**
	 * 根据主键获取一条用户信息，显示到个人中心
	 * @param userInfoId 用户主键
	 * @return UserInfo
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
	 * 修改用户信息
	 * @param userInfo
	 * @param userInfoDetail
	 * @author wang.xr
	 */
	public void updateUserInfo(UserInfo userInfo,UserInfoDetail userInfoDetail);
	/**
	 * 修改密码
	 * @param password 密码
	 * @param userInfoId 用户主键
	 * @author wang.xr
	 */
	public void updatePassword(String password,int userInfoId);
	/**
	 * 修改邮箱
	 * @param email 邮箱
	 * @param userInfoId 用户主键
	 * @author wang.xr
	 */
	public void updateEmail(String email,int userInfoId);
	/**
	 * 判断手机号码是否已被使用
	 * @param phone 手机号码
	 * @return
	 * @author wang.xr
	 */
	public boolean isExitPhone(String phone);
	/**
	 * 修改手机
	 * @param phone
	 * @param userInfoId
	 * @author wang.xr
	 */
	public void updatePhone(String phone,int userInfoId);
	/**
	 * 修改用户头像
	 * @param imagePath 头像存储路径
	 * @author wang.xr
	 */
	public void updateHeadImage(String imagePath,int userInfoId);
}
