package com.zhadui.personal.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.util.GeneratRandomCode;
import com.zhadui.common.util.SendMessages;
import com.zhadui.personal.biz.PersonalCenterBiz;

public class SafeCenterAction extends ActionSupport {

	private PersonalCenterBiz personalCenterBiz;
	private String oldPwd;
	private String newPwd;
	private String oldEmail;
	private String newEmail;
	private String loginPwd;
	private int updateRemark;
	private String newPhone;
	private String validCode;
	public String getValidCode() {
		return validCode;
	}
	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}
	public String getNewPhone() {
		return newPhone;
	}
	public void setNewPhone(String newPhone) {
		this.newPhone = newPhone;
	}
	public int getUpdateRemark() {
		return updateRemark;
	}
	public void setUpdateRemark(int updateRemark) {
		this.updateRemark = updateRemark;
	}
	public String getOldEmail() {
		return oldEmail;
	}
	public void setOldEmail(String oldEmail) {
		this.oldEmail = oldEmail;
	}
	public String getNewEmail() {
		return newEmail;
	}
	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getOldPwd() {
		return oldPwd;
	}
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	public void setPersonalCenterBiz(PersonalCenterBiz personalCenterBiz) {
		this.personalCenterBiz = personalCenterBiz;
	}
	
	/**
	 * 修改密码
	 * @return
	 * @author wang.xr
	 */
	public String updatePassword(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		personalCenterBiz.updatePassword(newPwd, userInfoId);
		return "updatePassword";
	}
	public void validateUpdatePassword(){
		super.clearFieldErrors();
		if(oldPwd==null){
			super.addFieldError("oldPwdError","原密码不能为空");
			return;
		}
		if(newPwd==null){
			super.addFieldError("newPwdError","原密码不能为空");
			return;
		}
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		UserInfo userInfo=personalCenterBiz.getUserInfoById(userInfoId);
		if(!userInfo.getUserInfoPassword().equals(oldPwd)){
			super.addFieldError("oldPwdError","原密码不匹配");
			return;
		}		
	}
	/***
	 * 修改邮箱
	 * @return
	 * @author wang.xr
	 */
	public String updateEmail(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		personalCenterBiz.updateEmail(newEmail, userInfoId);
		return "updateEmail";
	}
	public void validateUpdateEmail(){
		super.clearFieldErrors();
		if(oldEmail==null){
			super.addFieldError("oldEmailError","原邮箱不能为空");
			return;
		}
		if(newEmail==null){
			super.addFieldError("newEmailError","新邮箱不能为空");
			return;
		}
		if(loginPwd==null){
			super.addFieldError("loginPwdError","登录密码不能为空");
			return;
		}
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		UserInfo userInfo=personalCenterBiz.getUserInfoById(userInfoId);
		if(!oldEmail.equals(userInfo.getUserInfoEmail())){
			super.addFieldError("oldEmailError","原邮箱输入有误");
			return;
		}
		
		if(!loginPwd.equals(userInfo.getUserInfoPassword())){
			super.addFieldError("loginPwdError","登陆密码不正确");
			return;
		}
	}
	public String toUpdatePhone(){
		updateRemark=1;
		return "toUpdatePhone";
	}
	/**
	 * 修改手机号码
	 * @return
	 * @author wang.xr
	 */
	public String updatePhone(){
		return "updatePhone";
	}
	/**
	 * 发送短信验证码
	 * @return
	 * @author wang.xr
	 */
	public String sendUpdateValidMsg(){
		updateRemark=2;
		return "sendUpdateValidMsg";
	}
	public void validateSendUpdateValidMsg(){
		super.clearFieldErrors();
		if(loginPwd==null){
			super.addFieldError("pwdError","登陆密码不能为空");
			updateRemark=1;
			return;
		}
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		UserInfo userInfo=personalCenterBiz.getUserInfoById(userInfoId);
		if(!loginPwd.equals(userInfo.getUserInfoPassword())){
			super.addFieldError("pwdError","登陆密码输入有误");
			updateRemark=1;
			return;
		}
		if(newPhone==null){
			super.addFieldError("phoneError","手机号码不能为空");
			updateRemark=1;
			return;
		}
		Pattern p =Pattern.compile("^1[3,4,5,7,8][0-9]{9}$");
		Matcher m=p.matcher(newPhone);
		if(!m.matches()){
			super.addFieldError("phoneError","手机号码格式不正确");
			updateRemark=1;
			return;
		}
		if(personalCenterBiz.isExitPhone(newPhone)){
			super.addFieldError("phoneError","手机号码已被注册");
			updateRemark=1;
			return;
		}
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		Element element1 = cache.get(newPhone);
		if (element1 != null) {
			super.addFieldError("validCodeError","验证码已发送");
			updateRemark=2;
			return;
		}else{
			String code = GeneratRandomCode.random(4);
			System.out.println("---------------随机生成的手机验证码:"+code);
			//发送短信验证码
			/*SendMessages.send(
					"此验证码只用于注册账号，验证码提供给他人会导致信息泄露。"+code+"[扎堆吧验证码]。再次提醒，请勿转发", newPhone);*/
			Element element = new Element(newPhone, code);
			cache.put(element);
		}
	}
	
	public String checkValidCode(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		personalCenterBiz.updatePhone(newPhone, userInfoId);
		cache.remove(newPhone);
		updateRemark=3;
		return "checkValidCode";
	}
	public void validateCheckValidCode(){
		super.clearFieldErrors();
		if(validCode==null){
			super.addFieldError("validCodeError","验证码不能为空");
			updateRemark=2;
			return;
		}
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		Element element = cache.get(newPhone);
		if(element==null){
			super.addFieldError("phoneError","请先获取手机验证码");
			updateRemark=1;
			return;
		}else{
			String code=element.getValue().toString();
			if(!validCode.equals(code)){
				super.addFieldError("validCodeError","验证码输入有误");
				updateRemark=2;
				return;
			}
		}
		
	}
}
