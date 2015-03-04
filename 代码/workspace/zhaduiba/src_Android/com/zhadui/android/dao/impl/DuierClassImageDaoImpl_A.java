package com.zhadui.android.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.zhadui.android.dao.DuierClassImageDao_A;
import com.zhadui.common.entity.DuierClassImage;

public class DuierClassImageDaoImpl_A extends SqlSessionDaoSupport implements DuierClassImageDao_A {

	@Override
	public List<DuierClassImage> getADListByCId(int cId) {
		return this.getSqlSession().selectList("com.zhadui.android.dao.impl.A_duierClassImageManage.getADListByCId",cId);
	}

}
