package com.zhadui.common.entity;

import java.util.Date;

public class DuierChatInfo {

	private int duierChatInfoId;
	private UserInfo duierChatInfoTalker;
	private DuierInfo duierChatInfoDuier;
	private UserInfo duierChatInfoToTalker;
	private Date duierChatInfoPublishTime;
	private Integer duierChatInfoPublishType;
	private Integer duierChatInfoPublishContentType;
	private String duierChatInfoPublishContent;
	private int duierChatInfoExt1;
	private String duierChatInfoExt2;
	public DuierChatInfo(int duierChatInfoId, UserInfo duierChatInfoTalker,
			DuierInfo duierChatInfoDuier, UserInfo duierChatInfoToTalker,
			Date duierChatInfoPublishTime, Integer duierChatInfoPublishType,
			Integer duierChatInfoPublishContentType,
			String duierChatInfoPublishContent, int duierChatInfoExt1,
			String duierChatInfoExt2) {
		super();
		this.duierChatInfoId = duierChatInfoId;
		this.duierChatInfoTalker = duierChatInfoTalker;
		this.duierChatInfoDuier = duierChatInfoDuier;
		this.duierChatInfoToTalker = duierChatInfoToTalker;
		this.duierChatInfoPublishTime = duierChatInfoPublishTime;
		this.duierChatInfoPublishType = duierChatInfoPublishType;
		this.duierChatInfoPublishContentType = duierChatInfoPublishContentType;
		this.duierChatInfoPublishContent = duierChatInfoPublishContent;
		this.duierChatInfoExt1 = duierChatInfoExt1;
		this.duierChatInfoExt2 = duierChatInfoExt2;
	}
	public DuierChatInfo() {
		super();
	}
	public int getDuierChatInfoId() {
		return duierChatInfoId;
	}
	public void setDuierChatInfoId(int duierChatInfoId) {
		this.duierChatInfoId = duierChatInfoId;
	}
	public UserInfo getDuierChatInfoTalker() {
		return duierChatInfoTalker;
	}
	public void setDuierChatInfoTalker(UserInfo duierChatInfoTalker) {
		this.duierChatInfoTalker = duierChatInfoTalker;
	}
	public DuierInfo getDuierChatInfoDuier() {
		return duierChatInfoDuier;
	}
	public void setDuierChatInfoDuier(DuierInfo duierChatInfoDuier) {
		this.duierChatInfoDuier = duierChatInfoDuier;
	}
	public UserInfo getDuierChatInfoToTalker() {
		return duierChatInfoToTalker;
	}
	public void setDuierChatInfoToTalker(UserInfo duierChatInfoToTalker) {
		this.duierChatInfoToTalker = duierChatInfoToTalker;
	}
	public Date getDuierChatInfoPublishTime() {
		return duierChatInfoPublishTime;
	}
	public void setDuierChatInfoPublishTime(Date duierChatInfoPublishTime) {
		this.duierChatInfoPublishTime = duierChatInfoPublishTime;
	}
	public Integer getDuierChatInfoPublishType() {
		return duierChatInfoPublishType;
	}
	public void setDuierChatInfoPublishType(Integer duierChatInfoPublishType) {
		this.duierChatInfoPublishType = duierChatInfoPublishType;
	}
	public Integer getDuierChatInfoPublishContentType() {
		return duierChatInfoPublishContentType;
	}
	public void setDuierChatInfoPublishContentType(
			Integer duierChatInfoPublishContentType) {
		this.duierChatInfoPublishContentType = duierChatInfoPublishContentType;
	}
	public String getDuierChatInfoPublishContent() {
		return duierChatInfoPublishContent;
	}
	public void setDuierChatInfoPublishContent(String duierChatInfoPublishContent) {
		this.duierChatInfoPublishContent = duierChatInfoPublishContent;
	}
	public int getDuierChatInfoExt1() {
		return duierChatInfoExt1;
	}
	public void setDuierChatInfoExt1(int duierChatInfoExt1) {
		this.duierChatInfoExt1 = duierChatInfoExt1;
	}
	public String getDuierChatInfoExt2() {
		return duierChatInfoExt2;
	}
	public void setDuierChatInfoExt2(String duierChatInfoExt2) {
		this.duierChatInfoExt2 = duierChatInfoExt2;
	}
	@Override
	public String toString() {
		return "DuierChatInfo [duierChatInfoId=" + duierChatInfoId
				+ ", duierChatInfoTalker=" + duierChatInfoTalker
				+ ", duierChatInfoDuier=" + duierChatInfoDuier
				+ ", duierChatInfoToTalker=" + duierChatInfoToTalker
				+ ", duierChatInfoPublishTime=" + duierChatInfoPublishTime
				+ ", duierChatInfoPublishType=" + duierChatInfoPublishType
				+ ", duierChatInfoPublishContentType="
				+ duierChatInfoPublishContentType
				+ ", duierChatInfoPublishContent="
				+ duierChatInfoPublishContent + ", duierChatInfoExt1="
				+ duierChatInfoExt1 + ", duierChatInfoExt2="
				+ duierChatInfoExt2 + "]";
	}
		
}
