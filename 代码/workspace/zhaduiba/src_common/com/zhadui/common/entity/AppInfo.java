package com.zhadui.common.entity;

import java.io.Serializable;
import java.util.Date;

public class AppInfo implements Serializable {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private int appInfoId;
	private String appInfoName;
	private String appInfoVersionName;
	private int appInfoVersionCode;
	private Date appInfoUpdateTime;
	private String appInfoSummary;
	private String appInfoDownloadUrl;
	private String appInfoQrCode;
	private int appInfoExt1;
	private String appInfoExt2;
	
	public AppInfo() {
		super();
	}

	public AppInfo(int appInfoId, String appInfoName,
			String appInfoVersionName, int appInfoVersionCode,
			Date appInfoUpdateTime, String appInfoSummary,
			String appInfoDownloadUrl, String appInfoQrCode, int appInfoExt1,
			String appInfoExt2) {
		super();
		this.appInfoId = appInfoId;
		this.appInfoName = appInfoName;
		this.appInfoVersionName = appInfoVersionName;
		this.appInfoVersionCode = appInfoVersionCode;
		this.appInfoUpdateTime = appInfoUpdateTime;
		this.appInfoSummary = appInfoSummary;
		this.appInfoDownloadUrl = appInfoDownloadUrl;
		this.appInfoQrCode = appInfoQrCode;
		this.appInfoExt1 = appInfoExt1;
		this.appInfoExt2 = appInfoExt2;
	}

	public int getAppInfoId() {
		return appInfoId;
	}

	public void setAppInfoId(int appInfoId) {
		this.appInfoId = appInfoId;
	}

	public String getAppInfoName() {
		return appInfoName;
	}

	public void setAppInfoName(String appInfoName) {
		this.appInfoName = appInfoName;
	}

	public String getAppInfoVersionName() {
		return appInfoVersionName;
	}

	public void setAppInfoVersionName(String appInfoVersionName) {
		this.appInfoVersionName = appInfoVersionName;
	}

	public int getAppInfoVersionCode() {
		return appInfoVersionCode;
	}

	public void setAppInfoVersionCode(int appInfoVersionCode) {
		this.appInfoVersionCode = appInfoVersionCode;
	}

	public Date getAppInfoUpdateTime() {
		return appInfoUpdateTime;
	}

	public void setAppInfoUpdateTime(Date appInfoUpdateTime) {
		this.appInfoUpdateTime = appInfoUpdateTime;
	}

	public String getAppInfoSummary() {
		return appInfoSummary;
	}

	public void setAppInfoSummary(String appInfoSummary) {
		this.appInfoSummary = appInfoSummary;
	}

	public String getAppInfoDownloadUrl() {
		return appInfoDownloadUrl;
	}

	public void setAppInfoDownloadUrl(String appInfoDownloadUrl) {
		this.appInfoDownloadUrl = appInfoDownloadUrl;
	}

	public String getAppInfoQrCode() {
		return appInfoQrCode;
	}

	public void setAppInfoQrCode(String appInfoQrCode) {
		this.appInfoQrCode = appInfoQrCode;
	}

	public int getAppInfoExt1() {
		return appInfoExt1;
	}

	public void setAppInfoExt1(int appInfoExt1) {
		this.appInfoExt1 = appInfoExt1;
	}

	public String getAppInfoExt2() {
		return appInfoExt2;
	}

	public void setAppInfoExt2(String appInfoExt2) {
		this.appInfoExt2 = appInfoExt2;
	}

	@Override
	public String toString() {
		return "AppInfo [appInfoId=" + appInfoId + ", appInfoName="
				+ appInfoName + ", appInfoVersionName=" + appInfoVersionName
				+ ", appInfoVersionCode=" + appInfoVersionCode
				+ ", appInfoUpdateTime=" + appInfoUpdateTime
				+ ", appInfoSummary=" + appInfoSummary
				+ ", appInfoDownloadUrl=" + appInfoDownloadUrl
				+ ", appInfoQrCode=" + appInfoQrCode + ", appInfoExt1="
				+ appInfoExt1 + ", appInfoExt2=" + appInfoExt2 + "]";
	}
	
}
