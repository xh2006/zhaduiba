package com.zhadui.personal.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.personal.dao.PersonalCenterDao;

public class PersonalCenterDaoImpl extends SqlSessionDaoSupport implements PersonalCenterDao {

	@Override
	public UserInfo getUserInfoById(int userInfoId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.personal.dao.impl.personalCenter.getUserInfoById",userInfoId);
	}

	@Override
	public UserInfoDetail getUserInfoDetailById(int UserinfoId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.personal.dao.impl.personalCenter.getUserInfoDetailById",UserinfoId);
	}

	@Override
	public List<DuierStatus> getDuierStatusListByUserId(int userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.zhadui.personal.dao.impl.personalCenter.getDuierStatusListByUserId",userId);
	}

	@Override
	public int countJoinedDuierByUserId(int userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.personal.dao.impl.personalCenter.countJoinedDuierByUserId",userId);
	}

	@Override
	public List<DuierInfo> getCreatedDuierListByUserId(int userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.zhadui.personal.dao.impl.personalCenter.getCreatedDuierListByUserId",userId);
	}

	@Override
	public int countCreatedDuierByUserId(int userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.personal.dao.impl.personalCenter.countCreatedDuierByUserId",userId);
	}

	@Override
	public List<DuierUndertakeInfo> getUndertakedDuierListByUserId(int userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.zhadui.personal.dao.impl.personalCenter.getUndertakeredDuierList",userId);
	}

	@Override
	public int countUndertakeredDuierByUserId(int userId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.personal.dao.impl.personalCenter.countUndertakeredDuierByUserId",userId);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		this.getSqlSession().update("com.zhadui.personal.dao.impl.personalCenter.updateUserInfo",userInfo);
	}

	@Override
	public void updateUserInfoDetail(UserInfoDetail userInfoDetail) {
		// TODO Auto-generated method stub
		this.getSqlSession().update("com.zhadui.personal.dao.impl.personalCenter.updateUserInfoDetail",userInfoDetail);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updatePassword(Map map) {
		// TODO Auto-generated method stub
		this.getSqlSession().update("com.zhadui.personal.dao.impl.personalCenter.updatePassword",map);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updateEmail(Map map) {
		// TODO Auto-generated method stub
		this.getSqlSession().update("com.zhadui.personal.dao.impl.personalCenter.updateEmail",map);
	}

	@Override
	public int isExitPhone(String phone) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.personal.dao.impl.personalCenter.isExitPhone",phone);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updatePhone(Map map) {
		// TODO Auto-generated method stub
		this.getSqlSession().update("com.zhadui.personal.dao.impl.personalCenter.updatePhone",map);
	}

	@Override
	public void updateHeadImage(Map map) {
		// TODO Auto-generated method stub
		this.getSqlSession().update("com.zhadui.personal.dao.impl.personalCenter.updateHeadImage",map);
	}

}
