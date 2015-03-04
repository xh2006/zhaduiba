package com.zhadui.android.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.AppInfoBiz_A;

public class AppInfoAction_A extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private int version_code;
	private AppInfoBiz_A appInfoBizA;
	
	public void setAppInfoBizA(AppInfoBiz_A appInfoBizA) {
		this.appInfoBizA = appInfoBizA;
	}
	public int getVersion_code() {
		return version_code;
	}
	public void setVersion_code(int version_code) {
		this.version_code = version_code;
	}

	/**
	 * 查询App版本并且下载
	 * @author wang.xrn
	 */
	public void android_getAppVersionAndDownload(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=appInfoBizA.getAppVersionAndDownload(version_code);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
		
	}
}
