package com.zhadui.front.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.entity.DuierShowInfoBlock;
import com.zhadui.front.dao.DuierShowInfoDao;

public class DuierShowInfoDaoImpl extends SqlSessionDaoSupport implements DuierShowInfoDao{

	@Override
	public List<DuierShowInfoBlock> getMoreDuierShowInfo(int nStartId, int nItems) {
		Map<String, Object>param = new HashMap<String, Object>();
		param.put("nStartId", nStartId);
		param.put("nItems", nItems);  
		return getSqlSession().selectList("com.zhadui.front.dao.impl.DuierShowInfoManage.getDuierShowInfos", param);
	}

	@Override
	public List<DuierShowInfoBlock> getDuierShowInfoByClassId(int nClassId,
			int nStartId, int nItems) {
		Map<String, Object>param = new HashMap<String, Object>();
		param.put("nClassId", nClassId);
		param.put("nStartId", nStartId);
		param.put("nItems", nItems);  
		return getSqlSession().selectList("com.zhadui.front.dao.impl.DuierShowInfoManage.getDuierShowInfosByClassId", param);
	}

	@Override
	public List<DuierClass> getDuierClass() {
		return getSqlSession().selectList("com.zhadui.front.dao.impl.DuierShowInfoManage.getDuierClass");
	}
}
