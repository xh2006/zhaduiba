package com.zhadui.front.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.front.biz.UserInfoManageBiz;


@SuppressWarnings("serial")
public class Login_frontAction extends ActionSupport {
	
	private String phoneNumber;
	private String pwd;
	private String verifyCode;
	UserInfoManageBiz userInfoManager;
	
	public String loginPage(){
		return "loginPage";
	}
	
	public void validateLogin(){
		super.clearFieldErrors();
		
		String code=ActionContext.getContext().getSession().get("RANDOMVALIDATECODEKEY").toString();
		if(!verifyCode.toUpperCase().equals(code)){
			super.addFieldError("vcError", "验证码输入错误。");
			return;
		}
		
		UserInfo user = userInfoManager.login(phoneNumber, pwd);
		
		if(user != null){
			LoginStatus loginStatus = new LoginStatus();
			loginStatus.setUserId(user.getUserInfoId());
			ActionContext.getContext().getSession().put("zhadui_loginStatus",loginStatus);
		}
		else{
			super.addFieldError("loginError", "验证用户名或密码不正确。");
			return;
		}
		return;
	}
	
	public String login() {	
		return "logined";
	}
	
	public String logout(){
		ActionContext.getContext().getSession().remove("zhadui_loginStatus");
		return "logouted";
	}
	/**
	 * 测试验证码输入是否正确
	 */
	public void verifyCode(){
		String result;
		if(verifyCode.length() > 4){
			result = "{\"status\":\"n\"}";
		}
		
		String code=ActionContext.getContext().getSession().get("RANDOMVALIDATECODEKEY").toString();
		if(verifyCode.toUpperCase().equals(code)){
			result = "{\"status\":\"y\"}";
		}
		else{
			result = "{\"status\":\"n\"}";
		}
		
		HttpServletResponse response = ServletActionContext.getResponse();
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(result);
		} catch (IOException e) {
		}
	}
	
	public UserInfoManageBiz getUserInfoManager() {
		return userInfoManager;
	}

	public void setUserInfoManager(UserInfoManageBiz userInfoManager) {
		this.userInfoManager = userInfoManager;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
}
