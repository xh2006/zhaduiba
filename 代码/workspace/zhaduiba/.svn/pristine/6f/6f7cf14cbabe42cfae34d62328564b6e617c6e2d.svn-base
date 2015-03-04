/**
 * FileName: 	UserInfoDao.java
 * FileDes:  	管理用户信息的接口申明。
 * FileAuthors: XuHua
 */
package com.zhadui.front.dao;

import java.util.Date;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.common.entity.UserProfile;
 
public interface UserInfoDao {
	public int isExisted(String name, String value);
	public UserInfo login(String phoneNumber, String password);
	public int register(UserInfo userInfo);
	public UserInfo getUserById(int id);
	public UserInfo getUserByPhoneNumber(String phoneNumber);
	public void insertUserInfo(UserInfo userInfo);
	
	public void updateUserlastLoginTime(int id, Date loginTime);
	public void updateUserHeader(int id, String headerImgPath);
	
	public void updateUserInfo(UserInfo userInfo);
	public void updateUserInfoDetail(UserInfoDetail userInfoDetail);
	
	public UserProfile getUserShowInfoByUserId(int id);
}
