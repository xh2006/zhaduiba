package com.zhadui.android.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.UserInfoBiz_A;
import com.zhadui.common.util.GeneratRandomCode;

public class RegisterAction_A extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private String phoneNum;
	private String password;
	private String validCode;
	private UserInfoBiz_A userInfoBizA;
	public void setUserInfoBizA(UserInfoBiz_A userInfoBizA) {
		this.userInfoBizA = userInfoBizA;
	}

	public String getValidCode() {
		return validCode;
	}

	public void setValidCode(String validCode) {
		this.validCode = validCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	// 获取注册验证码
	public void android_loadValidCode() {
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = new JSONObject();
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		Element element1 = cache.get(phoneNum);
		if (element1 == null) {
			String code = GeneratRandomCode.random(4);
			System.out.println("---------------随机生成的手机验证码:"+code);
			boolean flag=true;
			/*boolean flag = SendMessages.send(
					"此验证码只用于注册账号，验证码提供给他人会导致信息泄露。"+code+"[扎堆吧验证码]。再次提醒，请勿转发", phoneNum);*/
			if (flag) {
				Element element = new Element(phoneNum, code);
				cache.put(element);
				json.put("result", "check_ok");
				json.put("content", "验证码已成功发送，请注意查收");
			} else {
				json.put("result", "check_error");
				json.put("content", "验证码发送失败，请稍后重试");
			}
		}else{
			json.put("result", "check_error");
			json.put("content", "验证码已发送，请不要重复发送验证码");
		}
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//注册
	public void android_register(){
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = new JSONObject();
		CacheManager cacheManager = CacheManager.create("ehcache.xml");
		Cache cache = cacheManager.getCache("RegisterValidCodeCache");
		Element element=cache.get(phoneNum);
		if(element!=null){
			String code=element.getValue().toString();
			System.out.println("-----------------------------code:"+element);
			System.out.println("-----------------------------code:"+element.getValue());
			if(validCode.equals(code)){
				cache.remove(phoneNum);
				json=userInfoBizA.registerUser(phoneNum, password);
			}else{
				json.put("result","check_fail");
				json.put("content","手机验证码输入有误，请重新输入");
			}
		}else{
			json.put("result","check_fail");
			json.put("content","手机验证码输入有误，请重新输入");
		}
		
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			
		}
		
	}
}
