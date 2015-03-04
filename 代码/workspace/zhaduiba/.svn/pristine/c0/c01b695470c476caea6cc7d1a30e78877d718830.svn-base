package com.zhadui.android.biz.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.DuierClassImageBiz_A;
import com.zhadui.android.dao.DuierClassImageDao_A;
import com.zhadui.common.entity.DuierClassImage;

public class DuierClassImageBizImpl_A implements DuierClassImageBiz_A {

	private DuierClassImageDao_A duierClassImageDaoA;
	
	public void setDuierClassImageDaoA(DuierClassImageDao_A duierClassImageDaoA) {
		this.duierClassImageDaoA = duierClassImageDaoA;
	}



	@Override
	public JSONObject getADListByClassId(int classId) {
		JSONObject json=new JSONObject();
		try{
			List<DuierClassImage> list=duierClassImageDaoA.getADListByCId(classId);
			if(list.size()>0){
				List<JSONObject> listResult=new ArrayList<JSONObject>();
				for(int i=0;i<list.size();i++){
					JSONObject json1=new JSONObject();
					json1.put("bimg_id",list.get(i).getDuierClassImageId());
					json1.put("bimg_title",list.get(i).getDuierClassImageSummary());
					json1.put("bimg_url",list.get(i).getDuierClassImageUrl());
					listResult.add(json1);
				}
				json.put("result","check_ok");
				json.put("content",listResult);
			}else{
				json.put("result","check_fail");
				json.put("content","没有相关信息");
			}
		}catch(Exception e){
			json.put("result","check_error");
			json.put("content","查询出错");
		}
		return json;
	}

	
}
