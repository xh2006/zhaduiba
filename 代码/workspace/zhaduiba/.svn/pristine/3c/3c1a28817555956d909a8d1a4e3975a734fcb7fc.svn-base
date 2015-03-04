package com.zhadui.android.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.UserInfoBiz_A;

public class UserInfoAction_A extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private int user_id;
	private String friend_json;
	public String getFriend_json() {
		return friend_json;
	}
	public void setFriend_json(String friend_json) {
		this.friend_json = friend_json;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	private UserInfoBiz_A userInfoBizA;
	public void setUserInfoBizA(UserInfoBiz_A userInfoBizA) {
		this.userInfoBizA = userInfoBizA;
	}
	public void android_getUserInfo(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=userInfoBizA.getUserInfoById(user_id);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	/**
	 * 跟新服务器好友信息
	 * @author wang.xr
	 */
	public void android_updateFriends(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=userInfoBizA.updateFriendsByUserIdAndJson(user_id, friend_json);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
}
