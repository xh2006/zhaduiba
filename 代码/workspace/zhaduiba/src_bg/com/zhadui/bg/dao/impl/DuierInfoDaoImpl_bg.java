package com.zhadui.bg.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.bg.dao.DuierInfoDao_bg;
import com.zhadui.common.entity.DuierInfo;

public class DuierInfoDaoImpl_bg extends SqlSessionDaoSupport implements DuierInfoDao_bg {

	@Override
	public int countTotalRecord() {
		
		return this.getSqlSession().selectOne("com.zhadui.bg.dao.impl.WB_duierinfoManage.countTotalRecord");
	}

	@Override
	public List<DuierInfo> loadDuierList(@SuppressWarnings("rawtypes") Map map) {
		return this.getSqlSession().selectList("com.zhadui.bg.dao.impl.WB_duierinfoManage.loadDuierInfoList",map);
	}

}
