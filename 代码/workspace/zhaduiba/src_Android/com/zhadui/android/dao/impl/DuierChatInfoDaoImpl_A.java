package com.zhadui.android.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.DuierChatInfoDao_A;
import com.zhadui.common.entity.DuierChatInfo;

public class DuierChatInfoDaoImpl_A extends SqlSessionDaoSupport implements
		DuierChatInfoDao_A {

	@SuppressWarnings("rawtypes")
	@Override
	public List<DuierChatInfo> getDuierMessageListByDuierId(Map map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierChatInfoManage.getDuierMessageListByDuierId",map);
	}

	@Override
	public int addDuierChatInfo(DuierChatInfo duierChatInfo) {
		int id=this.getSqlSession().insert("com.zhadui.android.dao.impl.A_duierChatInfoManage.addDuierChatInfo", duierChatInfo);
		return id;
	}

}
