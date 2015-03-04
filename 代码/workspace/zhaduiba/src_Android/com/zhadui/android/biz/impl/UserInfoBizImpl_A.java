package com.zhadui.android.biz.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.UserInfoBiz_A;
import com.zhadui.android.dao.DuierInfoDao_A;
import com.zhadui.android.dao.DuierStatusDao_A;
import com.zhadui.android.dao.UserInfoDao_A;
import com.zhadui.android.dao.UserInfoDetailDao_A;
import com.zhadui.common.encrypt.MD5Util;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.common.util.LevelUtil;

public class UserInfoBizImpl_A implements UserInfoBiz_A {

	private UserInfoDao_A userInfoDaoA;
	private UserInfoDetailDao_A userInfoDetailDaoA;
	private DuierStatusDao_A duierStatusDaoA;
	private DuierInfoDao_A duierInfoDaoA;

	public void setDuierInfoDaoA(DuierInfoDao_A duierInfoDaoA) {
		this.duierInfoDaoA = duierInfoDaoA;
	}

	public void setDuierStatusDaoA(DuierStatusDao_A duierStatusDaoA) {
		this.duierStatusDaoA = duierStatusDaoA;
	}

	public void setUserInfoDetailDaoA(UserInfoDetailDao_A userInfoDetailDaoA) {
		this.userInfoDetailDaoA = userInfoDetailDaoA;
	}

	public void setUserInfoDaoA(UserInfoDao_A userInfoDaoA) {
		this.userInfoDaoA = userInfoDaoA;
	}

	@Override
	public UserInfo loginByPhoneAndPwd(String phoneNum, String password) {
		// TODO Auto-generated method stub
		UserInfo userInfo = new UserInfo();
		userInfo.setUserInfoPhoneNumber(phoneNum);
		userInfo.setUserInfoPassword(password);
		return userInfoDaoA.getUserByPhoneAndPwd(userInfo);
	}

	@Override
	public UserInfo loginByAcountAndPwd(String acount, String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserInfoAccount(acount);
		userInfo.setUserInfoPassword(password);
		return userInfoDaoA.getUserByAcountAndPwd(userInfo);
	}

	@Override
	public JSONObject getUserInfoById(int userId) {
		JSONObject json = new JSONObject();
		try {
			UserInfo userInfo = userInfoDaoA.getUserInfoById(userId);
			UserInfoDetail userInfoDetail = userInfoDetailDaoA
					.getUserInfoDetailById(userId);
			if (userInfo != null && userInfoDetail != null) {
				JSONObject json1 = new JSONObject();
				json1.put("user_name", userInfo.getUserInfoName());
				json1.put("user_lv",LevelUtil.getLevelByExperiencePoints(userInfo.getUserInfoExperiencePoints()));
				json1.put("user_ integral", userInfo.getUserInfoCredits());
				json1.put("user_imgurl",userInfo.getUserInfoHeadImage());
				json1.put("user_ designation", userInfo.getUserInfoDesignation().getUserDesignationContent());
				int zhaduiNum = duierStatusDaoA.countDuierNumByUId(userId);
				json1.put("zhadui_num", zhaduiNum);
				int leiduiNum = duierInfoDaoA.countDuierNumByUserId(userId);
				json1.put("leidui_num", leiduiNum);
				json1.put("signal", userInfoDetail.getUserInfoDetailSignal());
				json.put("result", "check_ok");
				json.put("content", json1);
			} else {
				json.put("result", "check_fail");
				json.put("content", "没有相关信息");
			}
		} catch (Exception e) {
			json.put("result", "check_error");
			json.put("content", "查询出错");
			e.printStackTrace();
		}
		return json;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public JSONObject updateFriendsByUserIdAndJson(int userId, String friendsStr) {
		JSONObject json=new JSONObject();
		try{
			Map map=new HashMap();
			map.put("friends",friendsStr);
			map.put("userId",userId);
			boolean flag=userInfoDetailDaoA.updateUserInfoDetailFriends(map);
			if(flag){
				json.put("result","check_ok");
			}else{
				json.put("result","check_fail");
				json.put("content","插入数据错误");
			}
		}catch(Exception e){
			json.put("result","check_error");
			json.put("content","查询错误");
		}
		return json;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public JSONObject registerUser(String phoneNum, String password) {
		JSONObject json=new JSONObject();
		try{
			UserInfo userInfo=new UserInfo();
			userInfo.setUserInfoAccount(phoneNum);
			userInfo.setUserInfoCredits(0);
			userInfo.setUserInfoExperiencePoints(0);
			userInfo.setUserInfoLastLoginTime(new Date());
			userInfo.setUserInfoPassword(MD5Util.MD5(password));
			userInfo.setUserInfoPhoneNumber(phoneNum);
			int insertId=userInfoDaoA.insertUserAndGetUserId(userInfo);
			Map mapD=new HashMap();
			mapD.put("userDetailsId",insertId);
			mapD.put("creatTime",new Date());
			userInfoDetailDaoA.insertUserInfoDetails(mapD);
			json.put("result","check_ok");
			json.put("content","注册成功");
		}catch(Exception e){
			json.put("result","check_error");
			json.put("content","注册发生错误");
		}
		return json;
	}
	
}
