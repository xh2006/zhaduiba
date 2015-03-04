package com.zhadui.common.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userAccount;
	private String userPwd;
	private int privilege;
	private String userLoginIp;
	private Date userLoginTime;
	private int userExt1;
	private String userExt2;
	public User() {
		super();
	}
	public User(int userId, String userAccount, String userPwd, int privilege,
			String userLoginIp, Date userLoginTime, int userExt1,
			String userExt2) {
		super();
		this.userId = userId;
		this.userAccount = userAccount;
		this.userPwd = userPwd;
		this.privilege = privilege;
		this.userLoginIp = userLoginIp;
		this.userLoginTime = userLoginTime;
		this.userExt1 = userExt1;
		this.userExt2 = userExt2;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public String getUserLoginIp() {
		return userLoginIp;
	}
	public void setUserLoginIp(String userLoginIp) {
		this.userLoginIp = userLoginIp;
	}
	public Date getUserLoginTime() {
		return userLoginTime;
	}
	public void setUserLoginTime(Date userLoginTime) {
		this.userLoginTime = userLoginTime;
	}
	public int getUserExt1() {
		return userExt1;
	}
	public void setUserExt1(int userExt1) {
		this.userExt1 = userExt1;
	}
	public String getUserExt2() {
		return userExt2;
	}
	public void setUserExt2(String userExt2) {
		this.userExt2 = userExt2;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccount=" + userAccount
				+ ", userPwd=" + userPwd + ", privilege=" + privilege
				+ ", userLoginIp=" + userLoginIp + ", userLoginTime="
				+ userLoginTime + ", userExt1=" + userExt1 + ", userExt2="
				+ userExt2 + "]";
	}
	
}
