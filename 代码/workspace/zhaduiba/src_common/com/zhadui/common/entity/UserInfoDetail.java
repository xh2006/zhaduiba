package com.zhadui.common.entity;

import java.util.Date;

public class UserInfoDetail {

	private int userInfoDetailId;
	private Date userInfoDetailBornTime;
	private String userInfoDetailHometown;
	private String userInfoDetailEducationStatus;
	private int userInfoDetailSchool;
	private String userInfoDetailVocation;
	private String userInfoDetailConstellation;
	private Integer userInfoDetailMarriageStatus;
	private String userInfoDetailSignal;
	private String userInfoDetailHobby;
	private String userInfoDetailSelfIntroduction;
	private String userInfoDetailFriends;
	private int userInfoDetailLocationArea;
	private Date userInfoDetailCreateTime;
	private int userInfoDetailExt1;
	private String userInfoDetailExt2;
	
	public UserInfoDetail() {
		super();
	}

	public UserInfoDetail(int userInfoDetailId, Date userInfoDetailBornTime,
			String userInfoDetailHometown,
			String userInfoDetailEducationStatus, int userInfoDetailSchool,
			String userInfoDetailVocation, String userInfoDetailConstellation,
			Integer userInfoDetailMarriageStatus, String userInfoDetailSignal,
			String userInfoDetailHobby, String userInfoDetailSelfIntroduction,
			String userInfoDetailFriends, int userInfoDetailLocationArea,
			Date userInfoDetailCreateTime, int userInfoDetailExt1,
			String userInfoDetailExt2) {
		super();
		this.userInfoDetailId = userInfoDetailId;
		this.userInfoDetailBornTime = userInfoDetailBornTime;
		this.userInfoDetailHometown = userInfoDetailHometown;
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
		this.userInfoDetailExt1 = userInfoDetailExt1;
		this.userInfoDetailExt2 = userInfoDetailExt2;
	}

	public int getUserInfoDetailId() {
		return userInfoDetailId;
	}

	public void setUserInfoDetailId(int userInfoDetailId) {
		this.userInfoDetailId = userInfoDetailId;
	}

	public Date getUserInfoDetailBornTime() {
		return userInfoDetailBornTime;
	}

	public void setUserInfoDetailBornTime(Date userInfoDetailBornTime) {
		this.userInfoDetailBornTime = userInfoDetailBornTime;
	}

	public String getUserInfoDetailHometown() {
		return userInfoDetailHometown;
	}

	public void setUserInfoDetailHometown(String userInfoDetailHometown) {
		this.userInfoDetailHometown = userInfoDetailHometown;
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

	public void setUserInfoDetailSchool(int userInfoDetailSchool) {
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

	public Integer getUserInfoDetailMarriageStatus() {
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

	public void setUserInfoDetailLocationArea(int userInfoDetailLocationArea) {
		this.userInfoDetailLocationArea = userInfoDetailLocationArea;
	}

	public Date getUserInfoDetailCreateTime() {
		return userInfoDetailCreateTime;
	}

	public void setUserInfoDetailCreateTime(Date userInfoDetailCreateTime) {
		this.userInfoDetailCreateTime = userInfoDetailCreateTime;
	}

	public int getUserInfoDetailExt1() {
		return userInfoDetailExt1;
	}

	public void setUserInfoDetailExt1(int userInfoDetailExt1) {
		this.userInfoDetailExt1 = userInfoDetailExt1;
	}

	public String getUserInfoDetailExt2() {
		return userInfoDetailExt2;
	}

	public void setUserInfoDetailExt2(String userInfoDetailExt2) {
		this.userInfoDetailExt2 = userInfoDetailExt2;
	}

	@Override
	public String toString() {
		return "UserInfoDetail [userInfoDetailId=" + userInfoDetailId
				+ ", userInfoDetailBornTime=" + userInfoDetailBornTime
				+ ", userInfoDetailHometown=" + userInfoDetailHometown
				+ ", userInfoDetailEducationStatus="
				+ userInfoDetailEducationStatus + ", userInfoDetailSchool="
				+ userInfoDetailSchool + ", userInfoDetailVocation="
				+ userInfoDetailVocation + ", userInfoDetailConstellation="
				+ userInfoDetailConstellation
				+ ", userInfoDetailMarriageStatus="
				+ userInfoDetailMarriageStatus + ", userInfoDetailSignal="
				+ userInfoDetailSignal + ", userInfoDetailHobby="
				+ userInfoDetailHobby + ", userInfoDetailSelfIntroduction="
				+ userInfoDetailSelfIntroduction + ", userInfoDetailFriends="
				+ userInfoDetailFriends + ", userInfoDetailLocationArea="
				+ userInfoDetailLocationArea + ", userInfoDetailCreateTime="
				+ userInfoDetailCreateTime + ", userInfoDetailExt1="
				+ userInfoDetailExt1 + ", userInfoDetailExt2="
				+ userInfoDetailExt2 + "]";
	}
	
}
