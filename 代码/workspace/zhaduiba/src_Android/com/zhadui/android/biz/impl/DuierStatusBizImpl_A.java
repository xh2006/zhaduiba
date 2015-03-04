package com.zhadui.android.biz.impl;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.DuierStatusBiz_A;
import com.zhadui.android.dao.DuierInfoDao_A;
import com.zhadui.android.dao.DuierStatusDao_A;
import com.zhadui.android.dao.UserInfoDao_A;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.UserInfo;

public class DuierStatusBizImpl_A implements DuierStatusBiz_A {

	private DuierStatusDao_A duierStatusDaoA;
	private DuierInfoDao_A duierInfoDaoA;
	private UserInfoDao_A userInfoDaoA;

	public void setUserInfoDaoA(UserInfoDao_A userInfoDaoA) {
		this.userInfoDaoA = userInfoDaoA;
	}

	public void setDuierInfoDaoA(DuierInfoDao_A duierInfoDaoA) {
		this.duierInfoDaoA = duierInfoDaoA;
	}

	public void setDuierStatusDaoA(DuierStatusDao_A duierStatusDaoA) {
		this.duierStatusDaoA = duierStatusDaoA;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public JSONObject userIfInWithUserIdAndDuierId(int userId,
			BigInteger duierId) {
		JSONObject json = new JSONObject();

		Map map = new HashMap();
		map.put("userId", userId);
		map.put("duierId", duierId);
		try {
			boolean flag = duierStatusDaoA.userIfInDuier(map);
			JSONObject json1 = new JSONObject();
			if (flag) {
				json1.put("isTakepart", "true");
			} else {
				json1.put("isTakepart", "false");
			}
			json.put("result", "check_ok");
			json.put("content", json1);
		} catch (Exception e) {
			json.put("result", "check_error");
			json.put("content", "查询出错");
		}
		return json;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public JSONObject userJoinDuier(int userId, BigInteger duierId) {
		JSONObject json = new JSONObject();
		DuierInfo duierStatusDuier = duierInfoDaoA.getDuierInfoById(duierId);
		UserInfo userInfo = userInfoDaoA.getUserInfoById(userId);
		DuierStatus duierStatus = new DuierStatus();
		duierStatus.setDuierStatusDuier(duierStatusDuier);
		duierStatus.setDuierStatusParticipant(userInfo);
		Map map=new HashMap();
		map.put("duierInfoId",duierId);
		map.put("updateTime",new Date());
		duierInfoDaoA.renewUpdateTime(map);
		try {
			boolean flag = duierStatusDaoA.addDuierStatus(duierStatus);
			JSONObject json1 = new JSONObject();
			if (flag) {
				json1.put("isTakepart", "true");
			} else {
				json1.put("isTakepart", "false");
			}
			json.put("result", "check_ok");
			json.put("content", json1);
		} catch (Exception e) {
			json.put("result", "check_error");
			json.put("content", "查询出错");
		}
		return json;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public JSONObject userQuitDuier(int userId, BigInteger duierId) {
		JSONObject json = new JSONObject();
		try {
			DuierStatus duierStatus=duierStatusDaoA.getDuierStatusByUIdAndDId(userId, duierId);
			Map map=new HashMap();
			map.put("duierInfoId",duierId);
			map.put("updateTime",new Date());
			duierInfoDaoA.renewUpdateTime(map);
			boolean flag = duierStatusDaoA.deleteDuierStatusById(duierStatus.getDuierStatusId());
			JSONObject json1 = new JSONObject();
			if (flag) {
				json1.put("isTakepart", "true");
			} else {
				json1.put("isTakepart", "false");
			}
			json.put("result", "check_ok");
			json.put("content", json1);
		} catch (Exception e) {
			json.put("result", "check_error");
			json.put("content", "查询出错");
		}
		return json;
	}

}
