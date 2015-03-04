package com.zhadui.bg.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.bg.biz.UserBiz_bg;
import com.zhadui.common.entity.User;
import com.zhadui.common.util.IpUtil;

public class AdminLoginAction_bg extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;

	private String adminUser;
	private String password;
	private String validateCode;
	private UserBiz_bg userBizBg;
	public void setUserBizBg(UserBiz_bg userBizBg) {
		this.userBizBg = userBizBg;
	}
	public String getAdminUser() {
		return adminUser;
	}
	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getValidateCode() {
		return validateCode;
	}
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
	/**
	 * 管理员去登录后台页面
	 * @return adminToLogin
	 * @author wang.xr
	 */
	 public String adminToLogin(){
		 super.clearFieldErrors();
		 System.out.println("------adminLogin");
		 return "adminToLogin";
	 }
	 /**
	  * 管理员登录
	  * @return
	  * @author wang.xr
	  */
	 public String adminLogin(){
		 return "adminLogin";
	 }
	 /**
	  * 管理员登录验证
	  * @author wang.xr
	  */
	 public void validateAdminLogin(){
		 super.clearFieldErrors();
		 if(adminUser==null){
			 super.addFieldError("accountError", "用户名不能为空");
			 return;
		 }
		 if(password==null){
			 super.addFieldError("pwdError", "密码不能为空");
			 return;
		 }
		 if(validateCode==null){
			 super.addFieldError("codeError", "验证码不能为空");
			 return;
		 }
		 String code=ActionContext.getContext().getSession().get("RANDOMVALIDATECODEKEY").toString();
		 if(validateCode.toUpperCase().equals(code)){
			 HttpServletRequest request=ServletActionContext.getRequest();
			 String ip=IpUtil.getRealIp(request);
			 //验证码验证成功
			 User adminuser=userBizBg.getAdminUserByAccountAndPwd(adminUser, password);
			 if(adminuser!=null){
				 userBizBg.updateLoginIpAndTime(ip, new Date(),adminuser.getUserId());
				 ActionContext.getContext().getSession().put("ZHADUI8ADMINUSER", adminuser);
			 }else{
				 super.addFieldError("accountError", "用户名或密码不正确");
				 return;
			 }
		 }else{
			 super.addFieldError("codeError", "验证码输入有误");
			 return;
		 }
	 }
	 
	 public String adminToIndex(){
		 return "adminToIndex";
	 }
	 
	 /**
	  * 管理员退出系统
	  * @return adminQuit
	  * @author wang.xr
	  */
	 @SuppressWarnings("rawtypes")
	public String adminQuit(){
		Map session= ActionContext.getContext().getSession();
		session.remove("ZHADUI8ADMINUSER");
		 return "adminQuit";
	 }
}
