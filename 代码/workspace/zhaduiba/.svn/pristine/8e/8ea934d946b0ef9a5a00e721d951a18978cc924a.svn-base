package com.zhadui.front.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.common.entity.DuierChatInfo;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.front.dao.DuierInfoDao;

public class DuierInfoDaoImpl extends SqlSessionDaoSupport implements DuierInfoDao {

	@Override
	public DuierInfo getDuierInfoByDuierId(int id) {
		return getSqlSession().selectOne("com.zhadui.front.dao.impl.DuierInfoManage.getDuierInfoByDuierId",id);
	}
	
	public List<DuierChatInfo> getDuierChatInfoByDuierId(int id){	
		return getSqlSession().selectList("com.zhadui.front.dao.impl.DuierInfoManage.getDuierChatInfoByDuierId",id);
	}
	
	@Override
	public void insertDuierInfo(DuierInfo DuierInfo) {
		getSqlSession().insert("com.zhadui.front.dao.impl.DuierInfoManage.insertDuierInfo", DuierInfo);		
	}

	@Override
	public void updateDuierInfo(DuierInfo duierInfo) {
				
	}

	@Override
	public List<DuierInfo> getDuierInfo(int nStartId, int nItems) {
		Map<String, Object>param = new HashMap<String, Object>();
		param.put("nStartId", nStartId);
		param.put("nItems", nItems);       
		return getSqlSession().selectList("com.zhadui.front.dao.impl.DuierInfoManage.getDuierInfo",param);
	}

	@Override
	public void insertDuierChatInfo(DuierChatInfo duierChatInfo) {
		getSqlSession().insert("com.zhadui.front.dao.impl.DuierInfoManage.insertDuierChatInfo", duierChatInfo);	
	}
}
