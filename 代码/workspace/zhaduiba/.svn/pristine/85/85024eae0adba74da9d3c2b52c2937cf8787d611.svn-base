package com.zhadui.android.action;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.DuierChatInfoBiz_A;

@SuppressWarnings("serial")
public class DuierChatInfoAction_A extends ActionSupport {

	private BigInteger list_id;
	private int startnum;
	private int count;
	private int user_id;
	private String message;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BigInteger getList_id() {
		return list_id;
	}
	public void setList_id(BigInteger list_id) {
		this.list_id = list_id;
	}
	public int getStartnum() {
		return startnum;
	}
	public void setStartnum(int startnum) {
		this.startnum = startnum;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private DuierChatInfoBiz_A duierChatInfoBizA;
	
	public void setDuierChatInfoBizA(DuierChatInfoBiz_A duierChatInfoBizA) {
		this.duierChatInfoBizA = duierChatInfoBizA;
	}
	
	public void android_getDuierMessageList(){
		HttpServletResponse response =ServletActionContext.getResponse();//list_id, startnum, count
		JSONObject json=duierChatInfoBizA.getDuierChatInfoListByDuierId(list_id,startnum,count);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	public void android_addMessage(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierChatInfoBizA.addMessage(list_id, user_id, message);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
}
