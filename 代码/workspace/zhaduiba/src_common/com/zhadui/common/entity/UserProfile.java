package com.zhadui.common.entity;

import java.util.Date;

public class UserProfile {
	//**************** userInfo±í **********************
	private int userInfoId;
	private String userInfoName;
	private Integer userInfoAge;
	private Integer userInfoSex;
	private String userInfoHeadImage;
	private UserDesignation userInfoDesignation;
	//private String userInfoAccount;
	//private String userInfoPassword;
	private String userInfoEmail;
	private String userInfoPhoneNumber;
	private Date userInfoLastLoginTime;
	private Integer userInfoExperiencePoints;
	private Integer userInfoCredits;
	//private double userInfoLocationLong;
	//private double userInfoLocationLat;
	private String userInfoSrcIp;
	//private Integer userInfoExt1;
	//private String userInfoExt2;
	// *********************userInfoDetail±í*************************
	private Date userInfoDetailBornTime;
	private String userInfoDetailHomeTown;
	private String userInfoDetailEducationStatus;
	private Integer userInfoDetailSchool;
	private String userInfoDetailVocation;
	private String userInfoDetailConstellation;
	private Integer userInfoDetailMarriageStatus;
	private String userInfoDetailSignal;
	private String userInfoDetailHobby;
	private String userInfoDetailSelfIntroduction;
	private String userInfoDetailFriends;
	private Integer userInfoDetailLocationArea;
	private Date userInfoDetailCreateTime;
	//private Integer userInfoDetailExt1;
	//private String userInfoDetailExt2;
	
	public UserProfile(int userInfoId, String userInfoName,
			Integer userInfoAge, Integer userInfoSex, String userInfoHeadImage,
			UserDesignation userInfoDesignation, String userInfoAccount,
			String userInfoPassword, String userInfoEmail,
			String userInfoPhoneNumber, Date userInfoLastLoginTime,
			Integer userInfoExperiencePoints, Integer userInfoCredits,
			double userInfoLocationLong, double userInfoLocationLat,
			String userInfoSrcIp, Integer userInfoExt1, String userInfoExt2,
			Date userInfoDetailBornTime, String userInfoDetailHomeTown,
			String userInfoDetailEducationStatus, Integer userInfoDetailSchool,
			String userInfoDetailVocation, String userInfoDetailConstellation,
			int userInfoDetailMarriageStatus, String userInfoDetailSignal,
			String userInfoDetailHobby, String userInfoDetailSelfIntroduction,
			String userInfoDetailFriends, Integer userInfoDetailLocationArea,
			Date userInfoDetailCreateTime, Integer userInfoDetailExt1,
			String userInfoDetailExt2) {
		super();
		this.userInfoId = userInfoId;
		this.userInfoName = userInfoName;
		this.userInfoAge = userInfoAge;
		this.userInfoSex = userInfoSex;
		this.userInfoHeadImage = userInfoHeadImage;
		this.userInfoDesignation = userInfoDesignation;
		this.userInfoEmail = userInfoEmail;
		this.userInfoPhoneNumber = userInfoPhoneNumber;
		this.userInfoLastLoginTime = userInfoLastLoginTime;
		this.userInfoExperiencePoints = userInfoExperiencePoints;
		this.userInfoCredits = userInfoCredits;
		this.userInfoSrcIp = userInfoSrcIp;
		this.userInfoDetailBornTime = userInfoDetailBornTime;
		this.userInfoDetailHomeTown = userInfoDetailHomeTown;
		this.userInfoDetailEducationStatus = userInfoDetailEducationStatus;
		this.userInfoDetailSchool = userInfoDetailSchool;
		this.userInfoDetailVocation = userInfoDetailVocation;
		this.userInfoDetailConstellation = userInfoDetailConstellation;
		this.userInfoDetailMarriageStatus = userInfoDetailMarriageStatus;
		this.userInfoDetailSignal = userInfoDetailSignal;
		this.userInfoDetailHobby = userInfoDetailHobby;
		this.userInfoDetailSelfIntroduction = userInfoDetailSelfIntroduction;
		this.userInfoDetailFriends = userInfoDetailFriends;
		this.userInfoDetailLocationArea = userInfoDetailLocationArea;
		this.userInfoDetailCreateTime = userInfoDetailCreateTime;
	}

	public UserProfile() {
		super();
	}
	
	public int getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
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

	public Date getUserInfoDetailBornTime() {
		return userInfoDetailBornTime;
	}

	public void setUserInfoDetailBornTime(Date userInfoDetailBornTime) {
		this.userInfoDetailBornTime = userInfoDetailBornTime;
	}

	public String getUserInfoDetailHomeTown() {
		return userInfoDetailHomeTown;
	}

	public void setUserInfoDetailHomeTown(String userInfoDetailHomeTown) {
		this.userInfoDetailHomeTown = userInfoDetailHomeTown;
	}

	public String getUserInfoDetailEducationStatus() {
		return userInfoDetailEducationStatus;
	}

	public void setUserInfoDetailEducationStatus(
			String userInfoDetailEducationStatus) {
		this.userInfoDetailEducationStatus = userInfoDetailEducationStatus;
	}

	public int getUserInfoDetailSchool() {
		return userInfoDetailSchool;
	}

	public void setUserInfoDetailSchool(Integer userInfoDetailSchool) {
		this.userInfoDetailSchool = userInfoDetailSchool;
	}

	public String getUserInfoDetailVocation() {
		return userInfoDetailVocation;
	}

	public void setUserInfoDetailVocation(String userInfoDetailVocation) {
		this.userInfoDetailVocation = userInfoDetailVocation;
	}

	public String getUserInfoDetailConstellation() {
		return userInfoDetailConstellation;
	}

	public void setUserInfoDetailConstellation(String userInfoDetailConstellation) {
		this.userInfoDetailConstellation = userInfoDetailConstellation;
	}

	public int getUserInfoDetailMarriageStatus() {
		return userInfoDetailMarriageStatus;
	}

	public void setUserInfoDetailMarriageStatus(Integer userInfoDetailMarriageStatus) {
		this.userInfoDetailMarriageStatus = userInfoDetailMarriageStatus;
	}

	public String getUserInfoDetailSignal() {
		return userInfoDetailSignal;
	}

	public void setUserInfoDetailSignal(String userInfoDetailSignal) {
		this.userInfoDetailSignal = userInfoDetailSignal;
	}

	public String getUserInfoDetailHobby() {
		return userInfoDetailHobby;
	}

	public void setUserInfoDetailHobby(String userInfoDetailHobby) {
		this.userInfoDetailHobby = userInfoDetailHobby;
	}

	public String getUserInfoDetailSelfIntroduction() {
		return userInfoDetailSelfIntroduction;
	}

	public void setUserInfoDetailSelfIntroduction(
			String userInfoDetailSelfIntroduction) {
		this.userInfoDetailSelfIntroduction = userInfoDetailSelfIntroduction;
	}

	public String getUserInfoDetailFriends() {
		return userInfoDetailFriends;
	}

	public void setUserInfoDetailFriends(String userInfoDetailFriends) {
		this.userInfoDetailFriends = userInfoDetailFriends;
	}

	public int getUserInfoDetailLocationArea() {
		return userInfoDetailLocationArea;
	}

	public void setUserInfoDetailLocationArea(Integer userInfoDetailLocationArea) {
		this.userInfoDetailLocationArea = userInfoDetailLocationArea;
	}

	public Date getUserInfoDetailCreateTime() {
		return userInfoDetailCreateTime;
	}

	public void setUserInfoDetailCreateTime(Date userInfoDetailCreateTime) {
		this.userInfoDetailCreateTime = userInfoDetailCreateTime;
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

	public void setUserInfoExperiencePoints(Integer userInfoExperiencePoints) {
		this.userInfoExperiencePoints = userInfoExperiencePoints;
	}

	public int getUserInfoCredits() {
		return userInfoCredits;
	}

	public void setUserInfoCredits(Integer userInfoCredits) {
		this.userInfoCredits = userInfoCredits;
	}

	public String getUserInfoSrcIp() {
		return userInfoSrcIp;
	}

	public void setUserInfoSrcIp(String userInfoSrcIp) {
		this.userInfoSrcIp = userInfoSrcIp;
	}

}
