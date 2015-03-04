package com.zhadui.common.filter;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zhadui.common.entity.User;

public class AdminLoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		User adminUser=(User)ActionContext.getContext().getSession().get("ZHADUI8ADMINUSER");
		if(adminUser==null){
			return "adminLogin";
		}else{
			return arg0.invoke();
		}
	}

}
