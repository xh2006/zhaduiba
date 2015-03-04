package com.zhadui.android.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.DuierClassDao_A;
import com.zhadui.common.entity.DuierClass;
@SuppressWarnings("rawtypes")
public class DuierClassDaoImpl_A extends SqlSessionDaoSupport implements DuierClassDao_A {

	@Override
	public List<DuierClass> getAllTopDuierClass() {
		return getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierClassManage.getAllTopDuierClass");
	}
	
	@Override
	public String getDCNameById(int DCId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierClassManage.getDCNameById",DCId);
	}

	@Override
	public List queryPage(int startRow, int endRow) {
		List duierClassList=new ArrayList();
		Map<String,Integer> params=new HashMap<String ,Integer>();
		params.put("startRow",startRow);
		params.put("endRow",endRow);
		duierClassList=this.getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierClassManage.queryDuierClassForPage",params);
		return duierClassList;
	}

	@Override
	public int getTotalRecord() {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.A_duierClassManage.queryTotalPage");
	}

	

}
