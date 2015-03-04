package com.zhadui.bg.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zhadui.bg.biz.DuierBiz_bg;
import com.zhadui.bg.dao.DuierInfoDao_bg;
import com.zhadui.common.entity.DuierInfo;

public class DuierBizImpl_bg implements DuierBiz_bg {

	private DuierInfoDao_bg duierInfoDaoBg;
	

	public void setDuierInfoDaoBg(DuierInfoDao_bg duierInfoDaoBg) {
		this.duierInfoDaoBg = duierInfoDaoBg;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<DuierInfo> loadDuierList(int offset,int endNum,String duierName,int duierStatus,int duierNum){
		Map map=new HashMap();
		//map.put("currentPage", currentPage);
		//select * from duierInfo limit startNum,endNum		
		map.put("startNum",offset);
		map.put("endNum",endNum);
		map.put("duierName",duierName);
		map.put("duierStatus",duierStatus);
		map.put("duierNum", duierNum);
		return duierInfoDaoBg.loadDuierList(map);
	}

	@Override
	public int countTotalRecord() {
		return duierInfoDaoBg.countTotalRecord();
	}

}
