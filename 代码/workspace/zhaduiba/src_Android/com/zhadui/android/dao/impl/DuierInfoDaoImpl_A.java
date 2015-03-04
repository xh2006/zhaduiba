package com.zhadui.android.dao.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.DuierInfoDao_A;
import com.zhadui.common.entity.DuierInfo;

public class DuierInfoDaoImpl_A extends SqlSessionDaoSupport implements
		DuierInfoDao_A {

	@Override
	public List<DuierInfo> getDuierListByClassIdForLimit(Map<String,Integer> paramMap) {
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierInfoManage.getDListByCId",paramMap);
	}

	@Override
	public DuierInfo getDuierInfoById(BigInteger duierInfoId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierInfoManage.getDuierInfoById", duierInfoId);
	}

	@Override
	public int countDuierNumByUserId(int userId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierInfoManage.countDuierNumByUserId",userId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<DuierInfo> searchDuierInfoByKeyWords(Map map) {
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierInfoManage.searchDuierInfoByKeyWords",map);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean updateDuierStatus(Map map) {
		boolean flag=false;
		int n=this.getSqlSession().update("com.zhadui.android.dao.impl.A_duierInfoManage.updateDuierStatus",map);
		if(n>0)
			flag=true;
		return flag;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void renewUpdateTime(Map map) {
		
		this.getSqlSession().update("com.zhadui.android.dao.impl.A_duierInfoManage.renewUpdateTime",map);
	}

}