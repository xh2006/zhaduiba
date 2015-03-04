package com.zhadui.front.dao;

import java.util.List;

import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.entity.DuierShowInfoBlock;

public interface DuierShowInfoDao {
	public List<DuierShowInfoBlock> getMoreDuierShowInfo(int nStartId, int nItems);
	public List<DuierShowInfoBlock> getDuierShowInfoByClassId(int nClassId, int nStartId, int nItems);
	
	// 获得堆儿的分类信息
	public List<DuierClass> getDuierClass();
}
