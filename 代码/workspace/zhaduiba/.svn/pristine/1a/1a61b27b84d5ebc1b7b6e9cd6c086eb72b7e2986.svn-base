package com.zhadui.android.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;


import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.DuierClassImageBiz_A;

public class DuierClassImageAction_A extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int tab_id;
	
	public int getTab_id() {
		return tab_id;
	}
	public void setTab_id(int tab_id) {
		this.tab_id = tab_id;
	}
	private DuierClassImageBiz_A duierClassImageBizA;
	
	public void setDuierClassImageBizA(DuierClassImageBiz_A duierClassImageBizA) {
		this.duierClassImageBizA = duierClassImageBizA;
	}
	
	public void android_getADListByCId(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json= duierClassImageBizA.getADListByClassId(tab_id);//tab_id
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
}
