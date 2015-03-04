package com.zhadui.front.biz.impl;


//import java.text.SimpleDateFormat;
import java.util.Date;

import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.common.entity.UserProfile;
import com.zhadui.front.biz.UserInfoManageBiz;
import com.zhadui.front.dao.UserInfoDao;

public class UserInfoManageBizImpl implements UserInfoManageBiz {

	private UserInfoDao userInfoDao;
		
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public String isExisted(String type, String value) {
		String result = null;
		
		if(type.equals("pn")){
			// search this phone number
			if(0 == userInfoDao.isExisted("userInfo_phone_number", value)){
				result = "{\"status\":\"y\"}";
			}
			else{
				result = "{\"info\":\"手机号已被注册过,如忘记密码，请使用密码找回找回密码。\",\"status\":\"n\"}";
				// 手机号已被注册过，如忘记密码，请使用密码找回找回密码。
				//result = "y";
			}
		}
		else if(type.equals("email")){
			
		}
		else{
			// to do...
		}

		// 在用户信息表中查看指定类型值是否存在。
		return result;
	}
	
	@Override
	public UserInfo login(String phoneNumber, String password) {		
		return userInfoDao.login(phoneNumber, password);
	}
	
	@Override
	public int register(String phoneNumber, String password) {
		int nRet = 0;
		UserInfo userInfo = new UserInfo();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		userInfo.setUserInfoName(phoneNumber);
		userInfo.setUserInfoAccount(phoneNumber);
		userInfo.setUserInfoPassword(password);
		userInfo.setUserInfoPhoneNumber(phoneNumber);
		userInfo.setUserInfoLastLoginTime(new Date());
		userInfo.setUserInfoExperiencePoints(0);
		userInfo.setUserInfoCredits(0);
		// userInfo.setUserInfoSrcIp(userInfoSrcIp);
		try{		
			nRet = userInfoDao.register(userInfo);
		}
		catch(Exception ex){
			// 
			ex.printStackTrace();
			nRet = 0;
		}	
		return nRet;
	}
	
	@Override
	public int completeProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		UserInfo userInfo = new UserInfo();
		UserInfoDetail userInfoDetail = new UserInfoDetail();
		
		userInfo.setUserInfoId(userProfile.getUserInfoId());
		userInfo.setUserInfoName(userProfile.getUserInfoName());
		userInfo.setUserInfoSex(userProfile.getUserInfoSex());
		userInfo.setUserInfoEmail(userProfile.getUserInfoEmail());
		userInfoDao.updateUserInfo(userInfo);
		
		userInfoDetail.setUserInfoDetailId(userProfile.getUserInfoId());
		userInfoDetail.setUserInfoDetailBornTime(userProfile.getUserInfoDetailBornTime());
		userInfoDetail.setUserInfoDetailEducationStatus(userProfile.getUserInfoDetailEducationStatus());
		userInfoDetail.setUserInfoDetailHobby(userProfile.getUserInfoDetailHobby());
		userInfoDetail.setUserInfoDetailHometown(userProfile.getUserInfoDetailHomeTown());
		userInfoDetail.setUserInfoDetailMarriageStatus(userProfile.getUserInfoDetailMarriageStatus());
		//userInfoDetail.setUserInfoDetailSchool(userProfile.getUserInfoDetailSchool());
		userInfoDetail.setUserInfoDetailSelfIntroduction(userProfile.getUserInfoDetailSelfIntroduction());
		userInfoDetail.setUserInfoDetailSignal(userProfile.getUserInfoDetailSignal());
		userInfoDetail.setUserInfoDetailVocation(userProfile.getUserInfoDetailVocation());
		userInfoDao.updateUserInfoDetail(userInfoDetail);
		
		return 0;
	}
	
	@Override
	public int modifyProfile() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void getProfile(int nId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserProfile getUserShowInfoByUserId(int id) {
		return userInfoDao.getUserShowInfoByUserId(id);
	}

	@Override
	public void updateUserHeader(int nId, String headerImgUrl) {
		userInfoDao.updateUserHeader(nId, headerImgUrl);	
	}

}
