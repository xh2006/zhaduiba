package com.zhadui.android.action;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.DuierUndertakeInfoBiz_A;

public class DuierUndertakeInfoAction_A extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger list_id;
	private int taker_id;
	private String takeinfo_affair;
	private float takeinfo_fee;
	public String getTakeinfo_affair() {
		return takeinfo_affair;
	}
	public void setTakeinfo_affair(String takeinfo_affair) {
		this.takeinfo_affair = takeinfo_affair;
	}
	public float getTakeinfo_fee() {
		return takeinfo_fee;
	}
	public void setTakeinfo_fee(float takeinfo_fee) {
		this.takeinfo_fee = takeinfo_fee;
	}
	public int getTaker_id() {
		return taker_id;
	}
	public void setTaker_id(int taker_id) {
		this.taker_id = taker_id;
	}
	public BigInteger getList_id() {
		return list_id;
	}
	public void setList_id(BigInteger list_id) {
		this.list_id = list_id;
	}
	private DuierUndertakeInfoBiz_A duierUndertakeInfoBizA;
	
	public void setDuierUndertakeInfoBizA(
			DuierUndertakeInfoBiz_A duierUndertakeInfoBizA) {
		this.duierUndertakeInfoBizA = duierUndertakeInfoBizA;
	}
	
	public void android_getDuierUndertakeInfo(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierUndertakeInfoBizA.getDuierUndertakeInfoByDuierId(list_id);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	
	public void android_getDuierUndertakeList(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierUndertakeInfoBizA.getDuierUndertakeListByDuierId(list_id);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	
	public void android_appointDuierUndertake(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierUndertakeInfoBizA.appointDuierUnertakeByduierIdAndUserId(list_id, taker_id);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	public void android_addDuierUndertake(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierUndertakeInfoBizA.addDuierUndertakeInfo(list_id, taker_id, takeinfo_affair, takeinfo_fee);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
}
