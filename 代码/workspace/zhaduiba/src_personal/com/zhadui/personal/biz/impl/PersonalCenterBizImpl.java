package com.zhadui.personal.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.personal.biz.PersonalCenterBiz;
import com.zhadui.personal.dao.PersonalCenterDao;

public class PersonalCenterBizImpl implements PersonalCenterBiz {

	private PersonalCenterDao personalCenterDao;
	
	public void setPersonalCenterDao(PersonalCenterDao personalCenterDao) {
		this.personalCenterDao = personalCenterDao;
	}

	@Override
	public UserInfo getUserInfoById(int userInfoId) {
		// TODO Auto-generated method stub
		return personalCenterDao.getUserInfoById(userInfoId);
	}

	@Override
	public UserInfoDetail getUserInfoDetailById(int UserinfoId) {
		// TODO Auto-generated method stub
		return personalCenterDao.getUserInfoDetailById(UserinfoId);
	}

	@Override
	public List<DuierStatus> getDuierStatusListByUserId(int userId) {
		// TODO Auto-generated method stub
		return personalCenterDao.getDuierStatusListByUserId(userId);
	}

	@Override
	public int countJoinedDuierByUserId(int userId) {
		// TODO Auto-generated method stub
		return personalCenterDao.countJoinedDuierByUserId(userId);
	}

	@Override
	public List<DuierInfo> getCreatedDuierListByUserId(int userId) {
		// TODO Auto-generated method stub
		return personalCenterDao.getCreatedDuierListByUserId(userId);
	}

	@Override
	public int countCreatedDuierByUserId(int userId) {
		// TODO Auto-generated method stub
		return personalCenterDao.countCreatedDuierByUserId(userId);
	}

	@Override
	public List<DuierUndertakeInfo> getUndertakedDuierListByUserId(int userId) {
		// TODO Auto-generated method stub
		return personalCenterDao.getUndertakedDuierListByUserId(userId);
	}

	@Override
	public int countUndertakeredDuierByUserId(int userId) {
		// TODO Auto-generated method stub
		return personalCenterDao.countUndertakeredDuierByUserId(userId);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo, UserInfoDetail userInfoDetail) {
		// TODO Auto-generated method stub
		personalCenterDao.updateUserInfo(userInfo);
		personalCenterDao.updateUserInfoDetail(userInfoDetail);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void updatePassword(String password, int userInfoId) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("password",password);
		map.put("userInfoId",userInfoId);
		personalCenterDao.updatePassword(map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void updateEmail(String email, int userInfoId) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("email",email);
		map.put("userInfoId",userInfoId);
		personalCenterDao.updateEmail(map);
	}

	@Override
	public boolean isExitPhone(String phone) {
		boolean flag=false;
		int n=personalCenterDao.isExitPhone(phone);
		if(n>=1){
			flag=true;
		}
		return flag;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void updatePhone(String phone, int userInfoId) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("phone",phone);
		map.put("userInfoId",userInfoId);
		personalCenterDao.updatePhone(map);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void updateHeadImage(String imagePath,int userInfoId) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("headImage",imagePath);
		map.put("userInfoId",userInfoId);
		personalCenterDao.updateHeadImage(map);
	}

}
