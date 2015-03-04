package com.zhadui.bg.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.bg.biz.UserBiz_bg;
import com.zhadui.common.encrypt.MD5Util;
import com.zhadui.common.entity.User;

public class PasswordAction_bg extends ActionSupport {

	private UserBiz_bg userBizBg;
	private String oldPassword;
	private String newPassword;
	private String reNewPassword;
	private String updateRemark;
	public String getUpdateRemark() {
		return updateRemark;
	}
	public void setUpdateRemark(String updateRemark) {
		this.updateRemark = updateRemark;
	}
	public UserBiz_bg getUserBizBg() {
		return userBizBg;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getReNewPassword() {
		return reNewPassword;
	}
	public void setReNewPassword(String reNewPassword) {
		this.reNewPassword = reNewPassword;
	}
	public void setUserBizBg(UserBiz_bg userBizBg) {
		this.userBizBg = userBizBg;
	}

	public String toUpdatePassword() {
		if(updateRemark!=null){
			updateRemark="updateOk";
		}
		return "toUpdatePassword";
	}

	public String updatePassword() {
		User adminUser=(User)ActionContext.getContext().getSession().get("ZHADUI8ADMINUSER");
		userBizBg.updatePasswordByUserId(adminUser.getUserId(),newPassword);
		Map<String,Object> session=ActionContext.getContext().getSession();
		session.remove("ZHADUI8ADMINUSER");
		session.put("ZHADUI8ADMINUSER",userBizBg.getUserById(adminUser.getUserId()));
		return "updatePassword";
	}

	public void validateUpdatePassword() {
		super.clearFieldErrors();
		if (oldPassword == null) {
			super.addFieldError("oldError", "请输入原密码");
			return;
		}
		if(newPassword==null){
			super.addFieldError("newError","请输入新密码");
			return;
		}
		if(reNewPassword==null){
			super.addFieldError("reNewError","请输入确认密码");
			return;
		}
		if(!newPassword.equals(reNewPassword)){
			super.addFieldError("reNewError","两次密码输入不一致");
			return;
		}
		User adminUser=(User)ActionContext.getContext().getSession().get("ZHADUI8ADMINUSER");
		if(!adminUser.getUserPwd().equals(oldPassword)){
			super.addFieldError("oldError","输入原密码不匹配");
			return;
		}
	}
}
