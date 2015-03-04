package com.zhadui.android.biz.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.DuierChatInfoBiz_A;
import com.zhadui.android.dao.DuierChatInfoDao_A;
import com.zhadui.android.dao.DuierInfoDao_A;
import com.zhadui.android.dao.UserInfoDao_A;
import com.zhadui.common.entity.DuierChatInfo;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.util.MyDateFormat;

public class DuierChatInfoBizImpl_A implements DuierChatInfoBiz_A {

	private DuierChatInfoDao_A duierChatInfoDaoA;
	private UserInfoDao_A userInfoDaoA;
	private DuierInfoDao_A duierInfoDaoA;

	public void setDuierInfoDaoA(DuierInfoDao_A duierInfoDaoA) {
		this.duierInfoDaoA = duierInfoDaoA;
	}

	public void setUserInfoDaoA(UserInfoDao_A userInfoDaoA) {
		this.userInfoDaoA = userInfoDaoA;
	}

	public void setDuierChatInfoDaoA(DuierChatInfoDao_A duierChatInfoDaoA) {
		this.duierChatInfoDaoA = duierChatInfoDaoA;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public JSONObject getDuierChatInfoListByDuierId(BigInteger duierId,
			int startNum, int count) {
		JSONObject json = new JSONObject();
		try {
			Map map = new HashMap();
			map.put("duierId", duierId);
			map.put("startNum", startNum);
			map.put("endNum", startNum + count);
			List<DuierChatInfo> list = duierChatInfoDaoA
					.getDuierMessageListByDuierId(map);
			if (list.size() > 0) {
				List list2 = new ArrayList();
				for (int i = 0; i < list.size(); i++) {
					DuierChatInfo duierChatInfo = list.get(i);
					JSONObject json1 = new JSONObject();
					json1.put("user_id", duierChatInfo.getDuierChatInfoTalker()
							.getUserInfoId());
					json1.put("user_name", duierChatInfo
							.getDuierChatInfoTalker().getUserInfoName());
					String userImage =duierChatInfo.getDuierChatInfoTalker().getUserInfoHeadImage();
					json1.put("user_imgurl", userImage);
					json1.put("user_message",
							duierChatInfo.getDuierChatInfoPublishContent());
					json1.put("time", MyDateFormat
							.getFormatDateToString(duierChatInfo
									.getDuierChatInfoPublishTime()));
					list2.add(json1);
				}
				int returnCount = 0;
				if (list.size() < count) {
					returnCount = list.size();
				} else {
					returnCount = count;
				}
				JSONObject json3 = new JSONObject();
				json3.put("list", list2);
				json3.put("startnum", startNum);
				json3.put("count", returnCount);
				json.put("result", "check_ok");
				json.put("content", json3);
			} else {
				json.put("result", "check_fail");
				json.put("content", "没有相关信息");
			}
		} catch (Exception e) {
			json.put("result", "check_error");
			json.put("content", "查询出错");
		}
		return json;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public JSONObject addMessage(BigInteger duierId, int userId, String message) {
		JSONObject json = new JSONObject();
		try {
			UserInfo userInfo = userInfoDaoA.getUserInfoById(userId);
			DuierInfo duierInfo = duierInfoDaoA.getDuierInfoById(duierId);
			DuierChatInfo duierChatInfo = new DuierChatInfo();
			duierChatInfo.setDuierChatInfoDuier(duierInfo);
			duierChatInfo.setDuierChatInfoPublishContent(message);
			duierChatInfo.setDuierChatInfoPublishType(1);
			duierChatInfo.setDuierChatInfoPublishTime(new Date());
			duierChatInfo.setDuierChatInfoTalker(userInfo);
			Map map=new HashMap();
			map.put("duierInfoId",duierId);
			map.put("updateTime",new Date());
			duierInfoDaoA.renewUpdateTime(map);
			int mark=duierChatInfoDaoA.addDuierChatInfo(duierChatInfo);
			if(mark>0){
				JSONObject json1=new JSONObject();
				json1.put("insertResult ", "true");
				json.put("result","check_ok");
				json.put("content",json1);
			}else{
				json.put("result","check_fail");
				json.put("content","插入信息失败");
			}
		} catch (Exception e) {
			json.put("result", "check_erro");
			json.put("content", "操作错误");
			e.printStackTrace();
		}
		return json;
	}

}
