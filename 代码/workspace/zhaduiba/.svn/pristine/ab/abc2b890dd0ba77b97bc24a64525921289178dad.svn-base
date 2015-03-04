package com.zhadui.android.dao.impl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.DuierStatusDao_A;
import com.zhadui.common.entity.DuierStatus;

public class DuierStatusDaoImpl_A extends SqlSessionDaoSupport implements
		DuierStatusDao_A {

	@Override
	public int countParticipantByDId(BigInteger DId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierStatusManage.countParticipantByDId",DId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean userIfInDuier(Map paramMap) {
		boolean flag=false;
		int id=this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierStatusManage.userIfInDuier",paramMap);
		if(id>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean addDuierStatus(DuierStatus duierStatus) {
		boolean flag=false;
		int id=this.getSqlSession().insert("com.zhadui.android.dao.impl.A_duierStatusManage.addDuierStatus", duierStatus);
		if(id>0){
			flag=true;
		}
		return flag;
	}

	
	@Override
	public boolean updateDuierStatus(DuierStatus duierStatus) {
		boolean flag=false;
		int id=this.getSqlSession().insert("com.zhadui.android.dao.impl.A_duierStatusManage.updateDuierStatus", duierStatus);
		if(id>0){
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean deleteDuierStatusById(int duierStatusId) {
		boolean flag=false;
		int id=this.getSqlSession().delete("com.zhadui.android.dao.impl.A_duierStatusManage.deleteDuierStatusById", duierStatusId);
		if(id>0){
			flag=true;
		}
		return flag;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public DuierStatus getDuierStatusByUIdAndDId(int userId, BigInteger duierId) {
		Map map=new HashMap();
		map.put("userId",userId);
		map.put("duierId",duierId);
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierStatusManage.getDuierStatusByUIdAndDId", map);
	}

	@Override
	public int countDuierNumByUId(int userId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierStatusManage.countZhaduiNumByUId",userId);
	}

}
