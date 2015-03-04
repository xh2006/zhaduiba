package com.zhadui.front.biz.impl;

import java.util.ArrayList;
import java.util.List;

import com.zhadui.common.entity.DuierChatInfo;
import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierShowInfoBlock;
import com.zhadui.front.biz.DuierInfoManageBiz;
import com.zhadui.front.dao.impl.DuierInfoDaoImpl;
import com.zhadui.front.dao.impl.DuierShowInfoDaoImpl;

public class DuierInfoManageBizImpl implements DuierInfoManageBiz {

	private DuierInfoDaoImpl duierInfoDaoImpl;
	private DuierShowInfoDaoImpl duierShowInfoDaoImpl;
	
	@Override
	public List<DuierShowInfoBlock> getDuierShowInfos(int nStart, int nItems) {
		List<DuierShowInfoBlock> duierShowInfoBlocks = new ArrayList<DuierShowInfoBlock>();
		duierShowInfoBlocks = duierShowInfoDaoImpl.getMoreDuierShowInfo(nStart, nItems);
		return duierShowInfoBlocks;
	}

	@Override
	public List<DuierShowInfoBlock> getDuierShowInfos(int nClassId, int nStart,
			int nItems) {
		List<DuierShowInfoBlock> duierShowInfoBlocks = new ArrayList<DuierShowInfoBlock>();
		duierShowInfoBlocks = duierShowInfoDaoImpl.getDuierShowInfoByClassId(nClassId, nStart, nItems);
		return duierShowInfoBlocks;
	}

	@Override
	public DuierInfo getDuierInfoByDuierId(int nId) {
		return duierInfoDaoImpl.getDuierInfoByDuierId(nId);
	}

	@Override
	public List<DuierChatInfo> getDuierChatInfoByDuierId(int nId) {
		return duierInfoDaoImpl.getDuierChatInfoByDuierId(nId);
	}

	@Override
	public void insertDuierChatInfo(DuierChatInfo duierChatInfo) {
		duierInfoDaoImpl.insertDuierChatInfo(duierChatInfo);	
	}
	
	@Override
	public void createDuier(DuierInfo duierInfo) {
		duierInfoDaoImpl.insertDuierInfo(duierInfo);	
	}
	
	@Override
	public List<DuierClass> getDuierClass() {
		return duierShowInfoDaoImpl.getDuierClass();
	}
	
	// get and set
	public DuierInfoDaoImpl getDuierInfoDaoImpl() {
		return duierInfoDaoImpl;
	}

	public void setDuierInfoDaoImpl(DuierInfoDaoImpl duierInfoDaoImpl) {
		this.duierInfoDaoImpl = duierInfoDaoImpl;
	}

	public DuierShowInfoDaoImpl getDuierShowInfoDaoImpl() {
		return duierShowInfoDaoImpl;
	}

	public void setDuierShowInfoDaoImpl(DuierShowInfoDaoImpl duierShowInfoDaoImpl) {
		this.duierShowInfoDaoImpl = duierShowInfoDaoImpl;
	}
}
