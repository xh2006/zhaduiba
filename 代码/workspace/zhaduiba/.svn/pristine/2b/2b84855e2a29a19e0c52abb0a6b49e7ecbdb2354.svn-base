package com.zhadui.android.biz.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.DuierInfoBiz_A;
import com.zhadui.android.dao.DuierClassDao_A;
import com.zhadui.android.dao.DuierInfoDao_A;
import com.zhadui.android.dao.DuierStatusDao_A;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.util.MyDateFormat;
import com.zhadui.common.util.URLTools;

public class DuierInfoBizImpl implements DuierInfoBiz_A {

	private DuierInfoDao_A duierInfoDaoA;
	private DuierStatusDao_A duierStatusDaoA;
	private DuierClassDao_A duierClassDaoA;

	public void setDuierInfoDaoA(DuierInfoDao_A duierInfoDaoA) {
		this.duierInfoDaoA = duierInfoDaoA;
	}

	public void setDuierStatusDaoA(DuierStatusDao_A duierStatusDaoA) {
		this.duierStatusDaoA = duierStatusDaoA;
	}

	public void setDuierClassDaoA(DuierClassDao_A duierClassDaoA) {
		this.duierClassDaoA = duierClassDaoA;
	}

	@Override
	public JSONObject getDuierListByClassIdA(int classId, int startNum,
			int countNum, int dstatus) {
		JSONObject json = new JSONObject();
		try {
			// 根据主题id获取主体名称Tab_name
			String className = duierClassDaoA.getDCNameById(classId);

			// 根据主题查询堆列表信息List_id,List_name

			Map<String, Integer> paramMap = new HashMap<String, Integer>();
			paramMap.put("classId", classId);
			paramMap.put("startNum", startNum);
			paramMap.put("endNum", startNum + countNum);
			paramMap.put("status", dstatus);

			List<DuierInfo> duierInfoList = duierInfoDaoA
					.getDuierListByClassIdForLimit(paramMap);
			if (duierInfoList.size() > 0) {
				List<JSONObject> list = new ArrayList<JSONObject>();
				for (int i = 0; i < duierInfoList.size(); i++) {
					JSONObject json1 = new JSONObject();
					// 根据堆主键统计参加人数 count
					DuierInfo duierInfo = duierInfoList.get(i);
					int count = duierStatusDaoA.countParticipantByDId(duierInfo
							.getDuierInfoId());
					json1.put("list_id", duierInfo.getDuierInfoId());
					json1.put("list_name", duierInfo.getDuierInfoName());
					json1.put("time", MyDateFormat.getFormatDateToString(duierInfo.getDuierInfoUpdateTime()));
					json1.put("tab_name", className);
					json1.put("numbers", count);
					if(duierInfo.getDuierInfoNeedUndertaker()==1){
						json1.put("is_needtaken", true);
					}else{
						json1.put("is_needtaken", false);
					}
					list.add(json1);
				}
				JSONObject json2 = new JSONObject();
				json2.put("list", list);
				json2.put("list_startnum", startNum);
				if (countNum > list.size()) {
					json2.put("list_getcount", list.size());
				} else {
					json2.put("list_getcount", countNum);
				}
				json.put("result", "check_ok");
				json.put("content", json2);
			} else {
				json.put("result", "check_fail");
				json.put("content", "没有相关信息");
			}
		} catch (Exception e) {
			json.put("result", "check_error");
			json.put("content", "查询出错");
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public JSONObject getDuierInfoById(BigInteger duierInfoId) {
		JSONObject json = new JSONObject();
		try {
			DuierInfo duierInfo = duierInfoDaoA.getDuierInfoById(duierInfoId);
			if(duierInfo!=null){
			JSONObject json1 = new JSONObject();
			json1.put("promoterName",duierInfo.getDuierInfoCreator().getUserInfoName());
			String userImage=duierInfo.getDuierInfoCreator().getUserInfoHeadImage();
			json1.put("promoterImgURl",userImage);//头像URL
			json1.put("list_Name",duierInfo.getDuierInfoName());
			json1.put("list_StartTime",MyDateFormat.getFormatDateToString(duierInfo.getDuierInfoCreateTime()));
			if(duierInfo.getDuierInfoLocationLat()!=0 && duierInfo.getDuierInfoLocationLong()!=0){
				String address=URLTools.getAddressByLatAndLng(Double.toString(duierInfo.getDuierInfoLocationLat()),Double.toString(duierInfo.getDuierInfoLocationLong()));
				json1.put("list_StartAddress",address);
			}else{
				json1.put("list_StartAddress","未知地点");
			}
			json1.put("list_content",duierInfo.getDuierInfoActivityIntroduction());
			json1.put("list_ require_Time",MyDateFormat.getFormatDateToString(duierInfo.getDuierInfoStartTime())+"-"+MyDateFormat.getFormatDate(duierInfo.getDuierInfoEndTime()));
			json1.put("list_ require_nums",duierInfo.getDuierInfoLowlimitPerson()+"-"+duierInfo.getDuierInfouplimitPerson());
			json1.put("list_ require_address",duierInfo.getDuierInfoLocation());
			json1.put("list_ require_pay",duierInfo.getDuierInfoActivityFee());
			int count = duierStatusDaoA.countParticipantByDId(duierInfo.getDuierInfoId());
			json1.put("list_ takepart_num",count);
			
			if(duierInfo.getDuierInfoNeedUndertaker()==1){
				json1.put("is_need_undertaker", true);
			}else{
				json1.put("is_need_undertaker", false);
			}
			
			json.put("result","check_ok");
			json.put("content", json1);
			}else{
				json.put("result","check_fail");
				json.put("content", "没有相关信息");
			}
		} catch (Exception e) {
			json.put("result","check_error");
			json.put("content", "查询出错");
		}
		return json;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public JSONObject searchDuierListByKey(String keyWords, int startNum,
			int count) {
		JSONObject json=new JSONObject();
		try{
			Map map=new HashMap();
			map.put("keyWords", "%"+keyWords+"%");
			map.put("startNum",startNum);
			map.put("endNum",startNum+count);
			List<DuierInfo> list=duierInfoDaoA.searchDuierInfoByKeyWords(map);
			if(list.size()>0){
				List<JSONObject> jsonList=new ArrayList<JSONObject>();
				for(int i=0;i<list.size();i++){
					JSONObject json1=new JSONObject();
					json1.put("list_id",list.get(i).getDuierInfoId());
					json1.put("list_name",list.get(i).getDuierInfoName());
					json1.put("tab_name",list.get(i).getDuierInfoClass().getDuierClassId());
					int number = duierStatusDaoA.countParticipantByDId(list.get(i).getDuierInfoId());
					json1.put("number",number);
					if(list.get(i).getDuierInfoNeedUndertaker()==1){
						json1.put("is_needtaken", true);
					}else{
						json1.put("is_needtaken", false);
					}
					json1.put("time",MyDateFormat.getFormatDateToString(list.get(i).getDuierInfoUpdateTime()));
					jsonList.add(json1);
				}
				JSONObject json2=new JSONObject();
				json2.put("list",jsonList);
				json2.put("list_startNum",startNum);
				if (count > list.size()) {
					json2.put("list_getcount", list.size());
				} else {
					json2.put("list_getcount", count);
				}
				
				json.put("result","check_ok");
				json.put("content", json2);
			}else{
				json.put("result","check_fail");
				json.put("content", "没有相关信息");
			}
		}catch(Exception e){
			e.printStackTrace();
			json.put("result","check_error");
			json.put("content", "查询出错");
		}
		return json;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public JSONObject updateDuierStatus(BigInteger duierId, boolean duierStatus) {
		JSONObject json=new JSONObject();
		Map map1=new HashMap();
		map1.put("duierInfoId",duierId);
		map1.put("updateTime",new Date());
		duierInfoDaoA.renewUpdateTime(map1);
		Map map=new HashMap();
		if(duierStatus){//1,等待参与2.堆活动正在进行
			map.put("duierStatus",1);
		}else{
			map.put("duierStatus",2);
		}
		map.put("duierInfoId",duierId);
		try{
			boolean flag=duierInfoDaoA.updateDuierStatus(map);
			if(flag){
				json.put("result","check_ok");
			}else{
				json.put("result","check_fail");
				json.put("content", "没有相关信息");
			}
		}catch(Exception e){
			json.put("result", "check_error");
			json.put("content", "服务器问题");
		}
		return json;
	}

}
