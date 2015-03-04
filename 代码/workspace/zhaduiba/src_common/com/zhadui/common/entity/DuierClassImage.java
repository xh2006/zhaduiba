package com.zhadui.common.entity;

public class DuierClassImage {

	private int duierClassImageId;
	private DuierInfo duierInfo;
	private DuierClass duierClass;
	private Integer duierClassImageType;
	private String duierClassImageUrl;
	private String duierClassImageSummary;
	private String duierClassImageInfoUrl;
	private int duierClassImageExt1;
	private String duierClassImageExt2;
	public DuierClassImage(int duierClassImageId, DuierInfo duierInfo,
			DuierClass duierClass, Integer duierClassImageType,
			String duierClassImageUrl, String duierClassImageSummary,
			String duierClassImageInfoUrl, int duierClassImageExt1,
			String duierClassImageExt2) {
		super();
		this.duierClassImageId = duierClassImageId;
		this.duierInfo = duierInfo;
		this.duierClass = duierClass;
		this.duierClassImageType = duierClassImageType;
		this.duierClassImageUrl = duierClassImageUrl;
		this.duierClassImageSummary = duierClassImageSummary;
		this.duierClassImageInfoUrl = duierClassImageInfoUrl;
		this.duierClassImageExt1 = duierClassImageExt1;
		this.duierClassImageExt2 = duierClassImageExt2;
	}
	public DuierClassImage() {
		super();
	}
	public int getDuierClassImageId() {
		return duierClassImageId;
	}
	public void setDuierClassImageId(int duierClassImageId) {
		this.duierClassImageId = duierClassImageId;
	}
	public DuierInfo getDuierInfo() {
		return duierInfo;
	}
	public void setDuierInfo(DuierInfo duierInfo) {
		this.duierInfo = duierInfo;
	}
	public DuierClass getDuierClass() {
		return duierClass;
	}
	public void setDuierClass(DuierClass duierClass) {
		this.duierClass = duierClass;
	}
	public Integer getDuierClassImageType() {
		return duierClassImageType;
	}
	public void setDuierClassImageType(Integer duierClassImageType) {
		this.duierClassImageType = duierClassImageType;
	}
	public String getDuierClassImageUrl() {
		return duierClassImageUrl;
	}
	public void setDuierClassImageUrl(String duierClassImageUrl) {
		this.duierClassImageUrl = duierClassImageUrl;
	}
	public String getDuierClassImageSummary() {
		return duierClassImageSummary;
	}
	public void setDuierClassImageSummary(String duierClassImageSummary) {
		this.duierClassImageSummary = duierClassImageSummary;
	}
	public String getDuierClassImageInfoUrl() {
		return duierClassImageInfoUrl;
	}
	public void setDuierClassImageInfoUrl(String duierClassImageInfoUrl) {
		this.duierClassImageInfoUrl = duierClassImageInfoUrl;
	}
	public int getDuierClassImageExt1() {
		return duierClassImageExt1;
	}
	public void setDuierClassImageExt1(int duierClassImageExt1) {
		this.duierClassImageExt1 = duierClassImageExt1;
	}
	public String getDuierClassImageExt2() {
		return duierClassImageExt2;
	}
	public void setDuierClassImageExt2(String duierClassImageExt2) {
		this.duierClassImageExt2 = duierClassImageExt2;
	}
	@Override
	public String toString() {
		return "DuierClassImage [duierClassImageId=" + duierClassImageId
				+ ", duierInfo=" + duierInfo + ", duierClass=" + duierClass
				+ ", duierClassImageType=" + duierClassImageType
				+ ", duierClassImageUrl=" + duierClassImageUrl
				+ ", duierClassImageSummary=" + duierClassImageSummary
				+ ", duierClassImageInfoUrl=" + duierClassImageInfoUrl
				+ ", duierClassImageExt1=" + duierClassImageExt1
				+ ", duierClassImageExt2=" + duierClassImageExt2 + "]";
	}
	
	
}
