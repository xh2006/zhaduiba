package com.zhadui.front.action;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.common.entity.UserProfile;
import com.zhadui.front.biz.UserInfoManageBiz;

@SuppressWarnings("serial")
public class Register_frontAction extends ActionSupport {
	// 表单验证
	private String param;
	private String name;
	private UserInfoManageBiz userInfoManager;
	private String result;
	// 注册用的手机号、密码
	private String pn;
	private String pwd;
	
	// 注册个人信息填写
	private String nickname;
	private int sex;
	private Date bornDate;
	private String eb;	// educational background
	private String vocation;
	private int marital;
	private String email;
	private String hometown;
	private String sign;
	private String hobby;
	private String si;
		
	// 判断手机号、邮箱等是否被使用
	public void isUsed(){
		result = userInfoManager.isExisted(name, param);	
		sendResult();
	}

	public String toRegisterPage(){
		return "registerPage";
	}
	
	public void register(){
		int userInfoId = userInfoManager.register(pn, pwd);
		if(0 != userInfoId){
			// 注册成功后，默认登录，设置登录信息
			LoginStatus loginStatus = new LoginStatus();
			loginStatus.setUserId(userInfoId);
			ActionContext.getContext().getSession().put("zhadui_loginStatus",loginStatus);
		}
		else{
			// 注册失败提示。
		}
	}

	public String toFillingInfoPage(){
		
		return "fillingInfoPage";
	}
	
	public String saveProfile(){
		UserProfile userProfile = new UserProfile();
		
		LoginStatus loginStatus = (LoginStatus)ActionContext.getContext().getSession().get("zhadui_loginStatus");
		userProfile.setUserInfoId(loginStatus.getUserId());
		userProfile.setUserInfoName(nickname);
		userProfile.setUserInfoSex(sex);
		userProfile.setUserInfoDetailBornTime(bornDate);
		userProfile.setUserInfoDetailEducationStatus(eb);
		userProfile.setUserInfoDetailVocation(vocation);
		userProfile.setUserInfoDetailMarriageStatus(marital);
		userProfile.setUserInfoEmail(email);
		userProfile.setUserInfoDetailHomeTown(hometown);
		userProfile.setUserInfoDetailHobby(hobby);
		userProfile.setUserInfoDetailSignal(sign);
		userProfile.setUserInfoDetailSelfIntroduction(si);
		
		userInfoManager.completeProfile(userProfile);
		return "toIndexPage";
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserInfoManageBiz getUserInfoManager() {
		return userInfoManager;
	}

	public void setUserInfoManager(UserInfoManageBiz userInfoManager) {
		this.userInfoManager = userInfoManager;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	// 回送结果
	private void sendResult(){
		HttpServletResponse response = ServletActionContext.getResponse();
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(result);
		} catch (IOException e) {
		}
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getMarital() {
		return marital;
	}

	public void setMarital(int marital) {
		this.marital = marital;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getEb() {
		return eb;
	}

	public void setEb(String eb) {
		this.eb = eb;
	}
}
