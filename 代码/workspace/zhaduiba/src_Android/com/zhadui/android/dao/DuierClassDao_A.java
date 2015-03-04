package com.zhadui.android.dao;

import java.util.List;

import com.zhadui.common.entity.DuierClass;

@SuppressWarnings("rawtypes")
public interface DuierClassDao_A {

	public List<DuierClass> getAllTopDuierClass();
	public String getDCNameById(int DCId);
	public List queryPage(int startRow,int endRow);
	public int getTotalRecord();
	
}
