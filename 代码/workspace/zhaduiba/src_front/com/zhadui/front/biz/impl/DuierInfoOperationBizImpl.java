package com.zhadui.front.biz.impl;

import java.util.List;
import java.util.ArrayList;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.front.biz.DuierInfoOperationBiz;
import com.zhadui.front.dao.impl.DuierInfoDaoImpl;

public class DuierInfoOperationBizImpl implements DuierInfoOperationBiz {

	private DuierInfoDaoImpl duierInfoDaoImpl;
	
	public DuierInfoDaoImpl getDuierInfoDaoImpl() {
		return duierInfoDaoImpl;
	}
	public void setDuierInfoDaoImpl(DuierInfoDaoImpl duierInfoDaoImpl) {
		this.duierInfoDaoImpl = duierInfoDaoImpl;
	}
	
	@Override
	public List<DuierInfo> getMoreDuierInfo(int nStart, int nItems) {
		List<DuierInfo> list_duierInfo = new ArrayList<DuierInfo>();
		list_duierInfo = duierInfoDaoImpl.getDuierInfo(nStart, nItems);
		return list_duierInfo;
	}

}
