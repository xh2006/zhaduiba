package com.zhadui.bg.biz.impl;

import java.util.List;

import com.zhadui.bg.biz.ThemeBiz_bg;
import com.zhadui.bg.dao.DuierClassDao_bg;
import com.zhadui.common.entity.DuierClass;

public class ThemeBizImpl_bg implements ThemeBiz_bg {

	private DuierClassDao_bg duierClassDaoBg;
	
	public void setDuierClassDaoBg(DuierClassDao_bg duierClassDaoBg) {
		this.duierClassDaoBg = duierClassDaoBg;
	}

	@Override
	public List<DuierClass> getAllThemes() {
		return duierClassDaoBg.getDuierClassList();
	}

	@Override
	public void addTheme(DuierClass duierClass) {
		duierClass.setDuierClassHotLevel(0);
		duierClass.setDuierClassFatherId(0);
		int sortNum=duierClassDaoBg.getDuierClassCount();
		duierClass.setDuierClassLayer(sortNum+1);
		duierClassDaoBg.addDuierClass(duierClass);
	}

	@Override
	public DuierClass getDuierClassById(int duierClassId) {
		return duierClassDaoBg.getDuierClassById(duierClassId);
	}

	@Override
	public void updateDuierClass(DuierClass duierClass) {
		duierClassDaoBg.updateDuierClass(duierClass);
	}

	@Override
	public void deleteThemeByThemeId(int themeId) {
		duierClassDaoBg.deleteDuierClassById(themeId);
	}

	@Override
	public void updateThemeSort(int[] sortArray) {
		for(int i=0;i<sortArray.length;i++){
			duierClassDaoBg.updateDuierClassLayer(sortArray[i],i+1);
		}
	}

}
