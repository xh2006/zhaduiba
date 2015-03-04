package com.zhadui.bg.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.bg.dao.DuierClassDao_bg;
import com.zhadui.common.entity.DuierClass;

public class DuierClassDaoImpl_bg extends SqlSessionDaoSupport implements DuierClassDao_bg {

	@Override
	public List<DuierClass> getDuierClassList() {
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.WB_duierclassManage.getAllThemes");
	}

	@Override
	public void addDuierClass(DuierClass duierClass) {
		this.getSqlSession().insert("com.zhadui.android.dao.impl.WB_duierclassManage.addDuierClass",duierClass);
	}

	@Override
	public int getDuierClassCount() {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.WB_duierclassManage.getDuierClassCount");
	}

	@Override
	public DuierClass getDuierClassById(int duierClassId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.WB_duierclassManage.getDuierClassById",duierClassId);
	}

	@Override
	public void updateDuierClass(DuierClass duierClass) {
		this.getSqlSession().update("com.zhadui.android.dao.impl.WB_duierclassManage.updateDuierClass",duierClass);
	}

	@Override
	public void deleteDuierClassById(int duierClassId) {
		this.getSqlSession().delete("com.zhadui.android.dao.impl.WB_duierclassManage.deleteDuierClassById", duierClassId);
	}

	@Override
	public void updateDuierClassLayer(int duierClassId, int layer) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("duierClassId",duierClassId);
		map.put("layer",layer);
		this.getSqlSession().update("com.zhadui.android.dao.impl.WB_duierclassManage.updateDuierClassLayer",map);
		
	}

}
