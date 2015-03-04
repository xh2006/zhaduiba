package com.zhadui.bg.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.bg.dao.AdDao_bg;
import com.zhadui.common.entity.DuierClassImage;

public class AdDaoImpl_bg extends SqlSessionDaoSupport implements AdDao_bg {

	@Override
	public List<DuierClassImage> getDuierClassImageList() {
		
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.WB_duierclassimageManage.getDuierClassImageList");
	}

	@Override
	public void addDuierClassImage(DuierClassImage duierClassImage) {
		this.getSqlSession().insert("com.zhadui.android.dao.impl.WB_duierclassimageManage.addDuierClassImage", duierClassImage);
	}

	@Override
	public DuierClassImage getDuierClassImageById(int duierClassImageId) {
		return this.getSqlSession().selectOne("com.zhadui.android.dao.impl.WB_duierclassimageManage.getDuierClassImageById",duierClassImageId);
	}

	@Override
	public void deleteDuierClassImageById(int duierClassImageId) {
		this.getSqlSession().delete("com.zhadui.android.dao.impl.WB_duierclassimageManage.deleteDuierClassImageById",duierClassImageId);
	}

}
