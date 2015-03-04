package com.zhadui.android.dao.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.DuierUndertakeInfoDao_A;
import com.zhadui.common.entity.DuierUndertakeInfo;

public class DuierUndertakeInfoDaoImpl_A extends SqlSessionDaoSupport implements
		DuierUndertakeInfoDao_A {

	@Override
	public DuierUndertakeInfo getDuierUnderTakeInfoByDuierId(BigInteger duierId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierUndertakerInfoManage.getDuierUndertakerByDuierId",duierId);
	}

	@Override
	public List<DuierUndertakeInfo> getDuierUndertakeListByDuierId(
			BigInteger duierId) {
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierUndertakerInfoManage.getDuierUndertakeListByDuierId",duierId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean updateDuierUndertakeForAppoint(Map map) {
		boolean flag=false;
		int n=this.getSqlSession().update("com.zhadui.android.dao.impl.A_duierUndertakerInfoManage.updateDuierUndertakeForAppoint",map);
		if(n>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean addDuierUndertake(DuierUndertakeInfo duierUndertakeInfo) {
		int n=this.getSqlSession().insert("com.zhadui.android.dao.impl.A_duierUndertakerInfoManage.addDuierUndertakeInfo",duierUndertakeInfo);
		boolean flag=false;
		if(n>0){
			flag=true;
		}
		return flag;
	}

}
