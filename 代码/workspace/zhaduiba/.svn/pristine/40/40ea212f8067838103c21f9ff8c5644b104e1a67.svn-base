package com.zhadui.android.biz.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.DuierClassBiz_A;
import com.zhadui.android.dao.DuierClassDao_A;
import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.util.PageModel;

public class DuierClassBizImpl_A implements DuierClassBiz_A {

	private DuierClassDao_A duierClassDaoA;
	
	public void setDuierClassDaoA(DuierClassDao_A duierClassDaoA) {
		this.duierClassDaoA = duierClassDaoA;
	}

	@Override
	public JSONObject getThemes() {
		JSONObject json = new JSONObject();
		List<JSONObject> jsonList = new ArrayList<JSONObject>();
		try {
			List<DuierClass> list = duierClassDaoA.getAllTopDuierClass();
			if (list.size() > 0) {
				for (int i = 0; i < list.size(); i++) {
					JSONObject jsonContent = new JSONObject();
					jsonContent.put("tab_id", list.get(i).getDuierClassId());
					jsonContent
							.put("tab_name", list.get(i).getDuierClassName());
					jsonList.add(jsonContent);
				}
				json.put("result", "check_ok");
				json.put("content", jsonList);
			} else {
				json.put("result", "check_fail");
				json.put("content", "没有相关信息");
			}
		} catch (Exception e) {
			e.printStackTrace();
			json.put("result", "check_error");
			json.put("content", "查询出错");
		}
		return json;
	}
	
	@Override
	public String getDCNameById(int DCId) {
		return duierClassDaoA.getDCNameById(DCId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DuierClass> queryForPage(PageModel pagemodel) {
		List<DuierClass> list=new ArrayList<DuierClass>();
		System.out.println("---------------"+pagemodel.getStartRow()+"-----------"+pagemodel.getEndRow()+"-----------------------------");
		list=duierClassDaoA.queryPage(pagemodel.getStartRow(), pagemodel.getEndRow());
		return list;
	}

	@Override
	public int getTotalRecord() {
		return duierClassDaoA.getTotalRecord();
	}

	

}
