
package com.zhadui.front.action;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.common.entity.DuierChatInfo;
import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierShowInfoBlock;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserProfile;
import com.zhadui.front.biz.DuierInfoManageBiz;
import com.zhadui.front.biz.UserInfoManageBiz;


@SuppressWarnings("serial")
public class DuierInfoManage_frontAction extends ActionSupport {
	
	private int nNum = 20;
	private int start;
	private int items;
	private int id;
	
	// 评论相关参数
	private BigInteger duierId;
	private int c_type;
	private String content;
	
	private DuierInfoManageBiz duierInfoManageBiz;
	private UserInfoManageBiz userInfoManageBiz;
	List<DuierShowInfoBlock> duierShowInfoBlocks;
	
	private List<DuierClass> duierClassList;
	
	// duierDetail.jsp相关数据
	private DuierInfo duierInfo;
	private DuierInfo duier;
	private List<DuierChatInfo> duierChatInfo_list;
	private UserProfile userShowInfo;
	
	/**
	 * 获得指定数目的堆儿展示信息
	 * @return
	 */
	public String getDuierShowInfo(){
		duierShowInfoBlocks = duierInfoManageBiz.getDuierShowInfos(0, nNum);
		return "indexPage";
	}
	
	/**
	 * 获得更多的堆儿展示信息块，以Json方式发送数据
	 */
	public void getMoreDuierShowInfos(){
		// 请求过滤！！！！！！！！！！！！！！！！！
		String duierInfos_json = "";
		List<DuierShowInfoBlock> list_duierShowInfos = duierInfoManageBiz.getDuierShowInfos(start, items);
		duierInfos_json = "{\"duierInfos\":[";
		for(int i = 0; i < list_duierShowInfos.size(); i++)
		{
			DuierShowInfoBlock duierShowInfo = list_duierShowInfos.get(i);
			duierInfos_json += duierShowInfo.toJsonString();
			duierInfos_json += ",";
		}
//		JSONObject json = new JSONObject();
//		json.put(key, value);
		duierInfos_json = duierInfos_json.substring(0, duierInfos_json.length() - 1);
		duierInfos_json += "]}";
		System.out.println("#####" + duierInfos_json);
		HttpServletResponse response = ServletActionContext.getResponse();/*tab_id, list_startnum, list_getcount*/

		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(duierInfos_json);
		} catch (IOException e) {
		}
	}
	
	/**
	 * 根据堆儿类型获得相应的堆儿信息
	 * @return
	 */
	public String getDuierShowInfosByClassId(){
		start = 0;
		items = 20;
		duierShowInfoBlocks = duierInfoManageBiz.getDuierShowInfos(id, start, items);
		return "categoryPage";
	}
	
	/**
	 * 根据堆儿类型获得相应的堆儿信息
	 */
	public void getMoreDuierShowInfosByClassId(){
		if(items < 4 || items > 30){// 若请求参数items小于4或大于30，则请求不被处理。
			return;			
		}
		String duierInfos_json = "";
		List<DuierShowInfoBlock> list_duierShowInfos = duierInfoManageBiz.getDuierShowInfos(id, start, items);
		duierInfos_json = "{\"duierInfos\":[";
		for(int i = 0; i < list_duierShowInfos.size(); i++)
		{
			DuierShowInfoBlock duierShowInfo = list_duierShowInfos.get(i);
			duierInfos_json += duierShowInfo.toJsonString();
			duierInfos_json += ",";
		}
		duierInfos_json = duierInfos_json.substring(0, duierInfos_json.length() - 1);
		duierInfos_json += "]}";
		System.out.println("#####" + duierInfos_json);
		HttpServletResponse response = ServletActionContext.getResponse();/*tab_id, list_startnum, list_getcount*/

		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(duierInfos_json);
		} catch (IOException e) {
		}
	}
	
	/**
	 * 获得堆儿的详细信息
	 */
	public String getDuierDetail(){
		// 获得指定堆儿的详细展示信息
		duierInfo = duierInfoManageBiz.getDuierInfoByDuierId(id);
		duierChatInfo_list = duierInfoManageBiz.getDuierChatInfoByDuierId(id);
		userShowInfo = userInfoManageBiz.getUserShowInfoByUserId(duierInfo.getDuierInfoCreator().getUserInfoId());
		return "duierDetailPage";
	}
	
	public void comment(){

		DuierChatInfo duierChatInfo = new DuierChatInfo();
		DuierInfo duier = new DuierInfo();
		duier.setDuierInfoId(duierId);
		UserInfo talker = new UserInfo();
		UserInfo toTalker = new UserInfo();
		LoginStatus loginStatus = (LoginStatus)ActionContext.getContext().getSession().get("zhadui_loginStatus");		
		int userId = loginStatus.getUserId();
		talker.setUserInfoId(userId);

		duierChatInfo.setDuierChatInfoDuier(duier);
		duierChatInfo.setDuierChatInfoTalker(talker);
		duierChatInfo.setDuierChatInfoToTalker(toTalker);
		duierChatInfo.setDuierChatInfoPublishTime(new Date());
		duierChatInfo.setDuierChatInfoPublishType(1);
		duierChatInfo.setDuierChatInfoPublishContentType(c_type);
		duierChatInfo.setDuierChatInfoPublishContent(content);
		duierInfoManageBiz.insertDuierChatInfo(duierChatInfo);
	}
	
	public String toCreateDuierPage(){
		duierClassList = duierInfoManageBiz.getDuierClass();
		return "toCreateDuierPage";
	}
	
	public String createDuier(){
		UserInfo creator = new UserInfo();
		LoginStatus loginStatus = (LoginStatus)ActionContext.getContext().getSession().get("zhadui_loginStatus");		
		int userId = loginStatus.getUserId();
		creator.setUserInfoId(userId);

		duier.setDuierInfoCreator(creator);
		duier.setDuierInfoCreateTime(new Date());
		duier.setDuierInfoUpdateTime(new Date());
		duier.setDuierInfoActivityStatus(1);
		
		duierInfoManageBiz.createDuier(duier);
		return "toIndexPage";
	}
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}
	
	public DuierInfoManageBiz getDuierInfoManageBiz() {
		return duierInfoManageBiz;
	}

	public void setDuierInfoManageBiz(DuierInfoManageBiz duierInfoManageBiz) {
		this.duierInfoManageBiz = duierInfoManageBiz;
	}

	public List<DuierShowInfoBlock> getDuierShowInfoBlocks() {
		return duierShowInfoBlocks;
	}

	public void setDuierShowInfoBlocks(List<DuierShowInfoBlock> duierShowInfoBlocks) {
		this.duierShowInfoBlocks = duierShowInfoBlocks;
	}
	
	public int getnNum() {
		return nNum;
	}

	public void setnNum(int nNum) {
		this.nNum = nNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserInfoManageBiz getUserInfoManageBiz() {
		return userInfoManageBiz;
	}

	public void setUserInfoManageBiz(UserInfoManageBiz userInfoManageBiz) {
		this.userInfoManageBiz = userInfoManageBiz;
	}

	public DuierInfo getDuierInfo() {
		return duierInfo;
	}

	public void setDuierInfo(DuierInfo duierInfo) {
		this.duierInfo = duierInfo;
	}

	public List<DuierChatInfo> getDuierChatInfo_list() {
		return duierChatInfo_list;
	}

	public void setDuierChatInfo_list(List<DuierChatInfo> duierChatInfo_list) {
		this.duierChatInfo_list = duierChatInfo_list;
	}

	public UserProfile getUserShowInfo() {
		return userShowInfo;
	}

	public void setUserShowInfo(UserProfile userShowInfo) {
		this.userShowInfo = userShowInfo;
	}

	public BigInteger getDuierId() {
		return duierId;
	}

	public void setDuierId(BigInteger duierId) {
		this.duierId = duierId;
	}
	
	public int getC_type() {
		return c_type;
	}

	public void setC_type(int c_type) {
		this.c_type = c_type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<DuierClass> getDuierClassList() {
		return duierClassList;
	}

	public void setDuierClassList(List<DuierClass> duierClassList) {
		this.duierClassList = duierClassList;
	}

	public DuierInfo getDuier() {
		return duier;
	}

	public void setDuier(DuierInfo duier) {
		this.duier = duier;
	}
}
