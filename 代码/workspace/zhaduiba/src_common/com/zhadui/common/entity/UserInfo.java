package com.zhadui.common.entity;

import java.util.Date;

public class UserInfo {

	private int userInfoId;
	private String userInfoName;
	private Integer userInfoAge;
	private Integer userInfoSex;
	private String userInfoHeadImage;
	private UserDesignation userInfoDesignation;
	private String userInfoAccount;
	private String userInfoPassword;
	private String userInfoEmail;
	private String userInfoPhoneNumber;
	private Date userInfoLastLoginTime;
	private int userInfoExperiencePoints;
	private int userInfoCredits;
	private double userInfoLocationLong;
	private double userInfoLocationLat;
	private String userInfoSrcIp;
	private int userInfoExt1;
	private String userInfoExt2;
	
	public UserInfo() {
		super();
	}

	public UserInfo(int userInfoId, String userInfoName, Integer userInfoAge,
			Integer userInfoSex, String userInfoHeadImage,
			UserDesignation userInfoDesignation, String userInfoAccount,
			String userInfoPassword, String userInfoEmail,
			String userInfoPhoneNumber, Date userInfoLastLoginTime,
			int userInfoExperiencePoints, int userInfoCredits,
			double userInfoLocationLong, double userInfoLocationLat,
			String userInfoSrcIp, int userInfoExt1, String userInfoExt2) {
		super();
		this.userInfoId = userInfoId;
		this.userInfoName = userInfoName;
		this.userInfoAge = userInfoAge;
		this.userInfoSex = userInfoSex;
		this.userInfoHeadImage = userInfoHeadImage;
		this.userInfoDesignation = userInfoDesignation;
		this.userInfoAccount = userInfoAccount;
		this.userInfoPassword = userInfoPassword;
		this.userInfoEmail = userInfoEmail;
		this.userInfoPhoneNumber = userInfoPhoneNumber;
		this.userInfoLastLoginTime = userInfoLastLoginTime;
		this.userInfoExperiencePoints = userInfoExperiencePoints;
		this.userInfoCredits = userInfoCredits;
		this.userInfoLocationLong = userInfoLocationLong;
		this.userInfoLocationLat = userInfoLocationLat;
		this.userInfoSrcIp = userInfoSrcIp;
		this.userInfoExt1 = userInfoExt1;
		this.userInfoExt2 = userInfoExt2;
	}

	public int getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(int userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getUserInfoName() {
		return userInfoName;
	}

	public void setUserInfoName(String userInfoName) {
		this.userInfoName = userInfoName;
	}

	public Integer getUserInfoAge() {
		return userInfoAge;
	}

	public void setUserInfoAge(Integer userInfoAge) {
		this.userInfoAge = userInfoAge;
	}

	public Integer getUserInfoSex() {
		return userInfoSex;
	}

	public void setUserInfoSex(Integer userInfoSex) {
		this.userInfoSex = userInfoSex;
	}

	public String getUserInfoHeadImage() {
		return userInfoHeadImage;
	}

	public void setUserInfoHeadImage(String userInfoHeadImage) {
		this.userInfoHeadImage = userInfoHeadImage;
	}

	public UserDesignation getUserInfoDesignation() {
		return userInfoDesignation;
	}

	public void setUserInfoDesignation(UserDesignation userInfoDesignation) {
		this.userInfoDesignation = userInfoDesignation;
	}

	public String getUserInfoAccount() {
		return userInfoAccount;
	}

	public void setUserInfoAccount(String userInfoAccount) {
		this.userInfoAccount = userInfoAccount;
	}

	public String getUserInfoPassword() {
		return userInfoPassword;
	}

	public void setUserInfoPassword(String userInfoPassword) {
		this.userInfoPassword = userInfoPassword;
	}

	public String getUserInfoEmail() {
		return userInfoEmail;
	}

	public void setUserInfoEmail(String userInfoEmail) {
		this.userInfoEmail = userInfoEmail;
	}

	public String getUserInfoPhoneNumber() {
		return userInfoPhoneNumber;
	}

	public void setUserInfoPhoneNumber(String userInfoPhoneNumber) {
		this.userInfoPhoneNumber = userInfoPhoneNumber;
	}

	public Date getUserInfoLastLoginTime() {
		return userInfoLastLoginTime;
	}

	public void setUserInfoLastLoginTime(Date userInfoLastLoginTime) {
		this.userInfoLastLoginTime = userInfoLastLoginTime;
	}

	public int getUserInfoExperiencePoints() {
		return userInfoExperiencePoints;
	}

	public void setUserInfoExperiencePoints(int userInfoExperiencePoints) {
		this.userInfoExperiencePoints = userInfoExperiencePoints;
	}

	public int getUserInfoCredits() {
		return userInfoCredits;
	}

	public void setUserInfoCredits(int userInfoCredits) {
		this.userInfoCredits = userInfoCredits;
	}

	public double getUserInfoLocationLong() {
		return userInfoLocationLong;
	}

	public void setUserInfoLocationLong(double userInfoLocationLong) {
		this.userInfoLocationLong = userInfoLocationLong;
	}

	public double getUserInfoLocationLat() {
		return userInfoLocationLat;
	}

	public void setUserInfoLocationLat(double userInfoLocationLat) {
		this.userInfoLocationLat = userInfoLocationLat;
	}

	public String getUserInfoSrcIp() {
		return userInfoSrcIp;
	}

	public void setUserInfoSrcIp(String userInfoSrcIp) {
		this.userInfoSrcIp = userInfoSrcIp;
	}

	public int getUserInfoExt1() {
		return userInfoExt1;
	}

	public void setUserInfoExt1(int userInfoExt1) {
		this.userInfoExt1 = userInfoExt1;
	}

	public String getUserInfoExt2() {
		return userInfoExt2;
	}

	public void setUserInfoExt2(String userInfoExt2) {
		this.userInfoExt2 = userInfoExt2;
	}

	@Override
	public String toString() {
		return "UserInfo [userInfoId=" + userInfoId + ", userInfoName="
				+ userInfoName + ", userInfoAge=" + userInfoAge
				+ ", userInfoSex=" + userInfoSex + ", userInfoHeadImage="
				+ userInfoHeadImage + ", userInfoDesignation="
				+ userInfoDesignation + ", userInfoAccount=" + userInfoAccount
				+ ", userInfoPassword=" + userInfoPassword + ", userInfoEmail="
				+ userInfoEmail + ", userInfoPhoneNumber="
				+ userInfoPhoneNumber + ", userInfoLastLoginTime="
				+ userInfoLastLoginTime + ", userInfoExperiencePoints="
				+ userInfoExperiencePoints + ", userInfoCredits="
				+ userInfoCredits + ", userInfoLocationLong="
				+ userInfoLocationLong + ", userInfoLocationLat="
				+ userInfoLocationLat + ", userInfoSrcIp=" + userInfoSrcIp
				+ ", userInfoExt1=" + userInfoExt1 + ", userInfoExt2="
				+ userInfoExt2 + "]";
	}
	
}
