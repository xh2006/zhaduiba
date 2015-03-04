/**
 * 堆儿信息展示块儿JavaBean
 * 
 * */
package com.zhadui.common.entity;

import java.util.Date;

public class DuierShowInfoBlock {
	private String duierName;
	private int duierId;	// 用来生成该堆儿访问url
	private String duierClass;
	private String duierIntroduction;
	private String duierShowImageUrl;	 // 堆儿展示图片
	private int duierStatus;	// 堆儿状态
	private int duierNeedUndertaker;	// 堆儿需要承接
	private int duierParticipants;
	private int duierComments;
	private String duierOwnerName;
	private int duierOwnerId;	// 用来生成访问堆儿主主页的url
	private String duierUserHeaderImgUrl;
	private Date duierUpdateTime;
	private int duierArea;
	

	public DuierShowInfoBlock(String duierName, int duierId, String duierClass,
			String duierIntroduction, String duierShowImageUrl,
			int duierStatus, int duierNeedUndertaker, int duierParticipants,
			int duierComments, String duierOwnerName, int duierOwnerId,
			String duierUserHeaderImgUrl, Date duierUpdateTime, int duierArea) {
		super();
		this.duierName = duierName;
		this.duierId = duierId;
		this.duierClass = duierClass;
		this.duierIntroduction = duierIntroduction;
		this.duierShowImageUrl = duierShowImageUrl;
		this.duierStatus = duierStatus;
		this.duierNeedUndertaker = duierNeedUndertaker;
		this.duierParticipants = duierParticipants;
		this.duierComments = duierComments;
		this.duierOwnerName = duierOwnerName;
		this.duierOwnerId = duierOwnerId;
		this.duierUserHeaderImgUrl = duierUserHeaderImgUrl;
		this.duierUpdateTime = duierUpdateTime;
		this.duierArea = duierArea;
	}

	public DuierShowInfoBlock() {
		super();
	}

	public Date getDuierUpdateTime() {
		return duierUpdateTime;
	}

	public void setDuierUpdateTime(Date duierUpdateTime) {
		this.duierUpdateTime = duierUpdateTime;
	}

	public int getDuierArea() {
		return duierArea;
	}

	public void setDuierArea(int duierArea) {
		this.duierArea = duierArea;
	}
	
	public String getDuierName() {
		return duierName;
	}

	public void setDuierName(String duierName) {
		this.duierName = duierName;
	}

	public int getDuierId() {
		return duierId;
	}

	public void setDuierId(int duierId) {
		this.duierId = duierId;
	}

	public String getDuierClass() {
		return duierClass;
	}

	public void setDuierClass(String duierClass) {
		this.duierClass = duierClass;
	}

	public String getDuierIntroduction() {
		return duierIntroduction;
	}

	public void setDuierIntroduction(String duierIntroduction) {
		this.duierIntroduction = duierIntroduction;
	}

	public int getDuierParticipants() {
		return duierParticipants;
	}

	public void setDuierParticipants(int duierParticipants) {
		this.duierParticipants = duierParticipants;
	}

	public int getDuierComments() {
		return duierComments;
	}

	public void setDuierComments(int duierComments) {
		this.duierComments = duierComments;
	}

	public String getDuierOwnerName() {
		return duierOwnerName;
	}

	public void setDuierOwnerName(String duierOwnerName) {
		this.duierOwnerName = duierOwnerName;
	}

	public int getDuierOwnerId() {
		return duierOwnerId;
	}

	public void setDuierOwnerId(int duierOwnerId) {
		this.duierOwnerId = duierOwnerId;
	}

	public String getDuierShowImageUrl() {
		return duierShowImageUrl;
	}

	public void setDuierShowImageUrl(String duierShowImageUrl) {
		this.duierShowImageUrl = duierShowImageUrl;
	}

	public int getDuierStatus() {
		return duierStatus;
	}

	public void setDuierStatus(int duierStatus) {
		this.duierStatus = duierStatus;
	}

	public int getDuierNeedUndertaker() {
		return duierNeedUndertaker;
	}

	public void setDuierNeedUndertaker(int duierNeedUndertaker) {
		this.duierNeedUndertaker = duierNeedUndertaker;
	}
	
	public String getDuierUserHeaderImgUrl() {
		return duierUserHeaderImgUrl;
	}

	public void setDuierUserHeaderImgUrl(String duierUserHeaderImgUrl) {
		this.duierUserHeaderImgUrl = duierUserHeaderImgUrl;
	}
	
	public String toJsonString(){
		// 生成堆儿活动介绍摘要
		String duierAbstract = "";
		if(duierIntroduction.length() > 100){
			duierAbstract = duierIntroduction.substring(0, 90);
			duierAbstract += "...";
		}
		else{
			duierAbstract = duierIntroduction;
		}
		
		String duierInfo_json = "{"
				+ "\"name\":\"" + duierName + "\","
				+ "\"id\":\"" + duierId + "\","
				+ "\"creator\":\"" + duierOwnerName + "\","
				+ "\"creatorId\":\"" + duierOwnerId + "\","
				+ "\"creatorImg\":\"" + duierUserHeaderImgUrl + "\","
				+ "\"category\":\"" + duierClass + "\","
				+ "\"updateTime\":\"" + duierUpdateTime + "\","
				+ "\"area\":\"" + duierArea + "\","
				+ "\"duierImg\":\"" + duierShowImageUrl + "\","
				+ "\"participants\":\"" + duierParticipants + "\","
				+ "\"comments\":\"" + duierComments + "\","
				+ "\"digest\":\"" + duierAbstract + "\","
				+ "\"status\":\"" + duierStatus + "\","
				+ "\"needUndertaker\":\"" + duierNeedUndertaker + "\""
				+ "}";
		return duierInfo_json;
	}
	
}
