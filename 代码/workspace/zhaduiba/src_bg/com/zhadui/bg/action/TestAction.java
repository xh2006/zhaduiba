package com.zhadui.bg.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	public void testJson(){
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		JSONObject json =new JSONObject();
		json.put("name","111111");
		json.put("sex","222222");
		json.put("age","333333");
		json.put("born","444444");
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
