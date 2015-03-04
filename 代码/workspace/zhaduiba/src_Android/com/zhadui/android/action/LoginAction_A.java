package com.zhadui.android.action;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.UserInfoBiz_A;
import com.zhadui.common.entity.UserInfo;

@SuppressWarnings("serial")
public class LoginAction_A extends ActionSupport {

	private String account;
	private String password;
	private String key;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	private UserInfoBiz_A userInfoBizA;

	public void setUserInfoBizA(UserInfoBiz_A userInfoBizA) {
		this.userInfoBizA = userInfoBizA;
	}

	public void android_login() {
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = new JSONObject();
		Pattern p = Pattern.compile("^1[3,4,5,7,8][0-9]{9}$");
		Matcher m = p.matcher(account);
		UserInfo user = null;
		try {
			if(key.equals("1111")){
				if (m.matches()) {
					// 账户是手机号码
					user = userInfoBizA.loginByPhoneAndPwd(account, password);
				} else {
					// 账户不是手机号码
					user = userInfoBizA.loginByAcountAndPwd(account, password);
				}
				if (user != null) {
					json.put("result", "check_ok");
					json.put("content", user.getUserInfoId());
				} else {
					json.put("result", "check_fail");
					json.put("content", "没有相关信息");
				}
			}else{
				json.put("result", "check_fail");
				json.put("content", "非法操作");
			}
		} catch (Exception e) {
			e.printStackTrace();
			json.put("result","check_error");
			json.put("content","查询出错");
		}finally{
			try {
				response.setCharacterEncoding("utf-8");
				response.getWriter().write(json.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}