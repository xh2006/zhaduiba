package com.zhadui.android.biz.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.DuierUndertakeInfoBiz_A;
import com.zhadui.android.dao.DuierInfoDao_A;
import com.zhadui.android.dao.DuierUndertakeInfoDao_A;
import com.zhadui.android.dao.UserInfoDao_A;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.UserInfo;

public class DuierUndertakeInfoBizImpl_A implements DuierUndertakeInfoBiz_A {

	private DuierUndertakeInfoDao_A duierUndertakeInfoDaoA;
	private UserInfoDao_A userInfoDaoA;
	private DuierInfoDao_A duierInfoDaoA;
	public void setDuierInfoDaoA(DuierInfoDao_A duierInfoDaoA) {
		this.duierInfoDaoA = duierInfoDaoA;
	}
	public void setUserInfoDaoA(UserInfoDao_A userInfoDaoA) {
		this.userInfoDaoA = userInfoDaoA;
	}
	public void setDuierUndertakeInfoDaoA(
			DuierUndertakeInfoDao_A duierUndertakeInfoDaoA) {
		this.duierUndertakeInfoDaoA = duierUndertakeInfoDaoA;
	}

	@Override
	public JSONObject getDuierUndertakeInfoByDuierId(BigInteger duierId) {
		JSONObject json=new JSONObject();
		try{
		DuierUndertakeInfo duierUndertakeInfo=duierUndertakeInfoDaoA.getDuierUnderTakeInfoByDuierId(duierId);
		if(duierUndertakeInfo!=null){
			JSONObject json1=new JSONObject();
			json1.put("user_id",duierUndertakeInfo.getDuierUndertakeInfoUser().getUserInfoId());
			json1.put("user_name",duierUndertakeInfo.getDuierUndertakeInfoUser().getUserInfoName());
			json.put("result","check_ok");
			json.put("content",json1);
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

	@Override
	public JSONObject getDuierUndertakeListByDuierId(BigInteger duierId) {
		JSONObject json=new JSONObject();
		try{
			List<DuierUndertakeInfo> list=duierUndertakeInfoDaoA.getDuierUndertakeListByDuierId(duierId);
			if(list.size()>0){
				List<JSONObject> listResult=new ArrayList<JSONObject>();
				for(int i=0;i<list.size();i++){
					JSONObject json1=new JSONObject();
					json1.put("user_id", list.get(i).getDuierUndertakeInfoUser().getUserInfoId());
					json1.put("user_name", list.get(i).getDuierUndertakeInfoUser().getUserInfoName());
					json1.put("takeinfo_affair",list.get(i).getDuierUndertakeInfoAffair());
					json1.put("takeinfo_fee",list.get(i).getDuierUndertakeInfoFee());
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public JSONObject appointDuierUnertakeByduierIdAndUserId(
			BigInteger duierId, int userId) {
		JSONObject json=new JSONObject();
		Map map1=new HashMap();
		map1.put("duierInfoId",duierId);
		map1.put("updateTime",new Date());
		duierInfoDaoA.renewUpdateTime(map1);
		try{
			Map map=new HashMap();
			map.put("duierId",duierId);
			map.put("userId",userId);
			boolean n=duierUndertakeInfoDaoA.updateDuierUndertakeForAppoint(map);
			if(n){
				json.put("result","check_ok");
			}else{
				json.put("result","check_fail");
				json.put("content","指定承接人失败");
			}
		}catch(Exception e){
			json.put("result","check_error");
			json.put("content","查询出错");
		}
		return json;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public JSONObject addDuierUndertakeInfo(BigInteger duierId, int userId,String affair,float fee) {
		JSONObject json=new JSONObject();
		Map map=new HashMap();
		map.put("duierInfoId",duierId);
		map.put("updateTime",new Date());
		duierInfoDaoA.renewUpdateTime(map);
		try{
			DuierUndertakeInfo duierUndertakeInfo=new DuierUndertakeInfo();
			duierUndertakeInfo.setDuierUndertakeInfoAffair(affair);
			duierUndertakeInfo.setDuierUndertakeInfoBeSelected(0);
			duierUndertakeInfo.setDuierUndertakeInfoFee(fee);
			duierUndertakeInfo.setDuierUndertakeInfoTime(new Date());
			UserInfo duierUndertakeInfoUser=userInfoDaoA.getUserInfoById(userId);
			duierUndertakeInfo.setDuierUndertakeInfoUser(duierUndertakeInfoUser);
			DuierInfo duierUndertakeInfoDuier=duierInfoDaoA.getDuierInfoById(duierId);
			duierUndertakeInfo.setDuierUndertakeInfoDuier(duierUndertakeInfoDuier);
			boolean f=duierUndertakeInfoDaoA.addDuierUndertake(duierUndertakeInfo);
			if(f){
				json.put("result","check_ok");
			}else{
				json.put("result","check_fail");
				json.put("content","承接失败");
			}
		}catch(Exception e){
			json.put("result","check_error");
			json.put("content","查询出错");
		}
		return json;
	}

}
