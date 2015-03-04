package com.zhadui.common.filter;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zhadui.common.entity.LoginStatus;


@SuppressWarnings("serial")
public class LoginInterceptor_webFront extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		LoginStatus loginStatus = (LoginStatus)ActionContext.getContext().getSession().get("zhadui_loginStatus");
		if(loginStatus == null){
			return "loginPage";
		}else{
			return arg0.invoke();
		}
	}
}
