package com.zhadui.common.entity;

import java.math.BigInteger;
import java.util.Date;

public class DuierInfo {

	private BigInteger duierInfoId;
	private UserInfo duierInfoCreator;
	private Date duierInfoCreateTime;
	private String duierInfoName;
	private DuierClass duierInfoClass;
	private Date duierInfoStartTime;
	private Date duierInfoEndTime;
	private Date duierInfoUpdateTime;
	private int duierInfoArea;
	private String duierInfoLocation;
	private int duierInfoLowlimitPerson;
	private int duierInfouplimitPerson;
	private String duierInfoActivityIntroduction;
	private Integer duierInfoActivityStatus;
	private Integer duierInfoNeedUndertaker;
	private double duierInfoLocationLong;
	private double duierInfoLocationLat;
	private float duierInfoActivityFee;
	private int duierInfoExt1;
	private String duierInfoExt2;
	public DuierInfo(BigInteger duierInfoId, UserInfo duierInfoCreator,
			Date duierInfoCreateTime, String duierInfoName,
			DuierClass duierInfoClass, Date duierInfoStartTime,
			Date duierInfoEndTime, Date duierInfoUpdateTime, int duierInfoArea,
			String duierInfoLocation, int duierInfoLowlimitPerson,
			int duierInfouplimitPerson, String duierInfoActivityIntroduction,
			Integer duierInfoActivityStatus, Integer duierInfoNeedUndertaker,
			double duierInfoLocationLong, double duierInfoLocationLat,
			float duierInfoActivityFee, int duierInfoExt1, String duierInfoExt2) {
		super();
		this.duierInfoId = duierInfoId;
		this.duierInfoCreator = duierInfoCreator;
		this.duierInfoCreateTime = duierInfoCreateTime;
		this.duierInfoName = duierInfoName;
		this.duierInfoClass = duierInfoClass;
		this.duierInfoStartTime = duierInfoStartTime;
		this.duierInfoEndTime = duierInfoEndTime;
		this.duierInfoUpdateTime = duierInfoUpdateTime;
		this.duierInfoArea = duierInfoArea;
		this.duierInfoLocation = duierInfoLocation;
		this.duierInfoLowlimitPerson = duierInfoLowlimitPerson;
		this.duierInfouplimitPerson = duierInfouplimitPerson;
		this.duierInfoActivityIntroduction = duierInfoActivityIntroduction;
		this.duierInfoActivityStatus = duierInfoActivityStatus;
		this.duierInfoNeedUndertaker = duierInfoNeedUndertaker;
		this.duierInfoLocationLong = duierInfoLocationLong;
		this.duierInfoLocationLat = duierInfoLocationLat;
		this.duierInfoActivityFee = duierInfoActivityFee;
		this.duierInfoExt1 = duierInfoExt1;
		this.duierInfoExt2 = duierInfoExt2;
	}
	public DuierInfo() {
		super();
	}
	public BigInteger getDuierInfoId() {
		return duierInfoId;
	}
	public void setDuierInfoId(BigInteger duierInfoId) {
		this.duierInfoId = duierInfoId;
	}
	public UserInfo getDuierInfoCreator() {
		return duierInfoCreator;
	}
	public void setDuierInfoCreator(UserInfo duierInfoCreator) {
		this.duierInfoCreator = duierInfoCreator;
	}
	public Date getDuierInfoCreateTime() {
		return duierInfoCreateTime;
	}
	public void setDuierInfoCreateTime(Date duierInfoCreateTime) {
		this.duierInfoCreateTime = duierInfoCreateTime;
	}
	public String getDuierInfoName() {
		return duierInfoName;
	}
	public void setDuierInfoName(String duierInfoName) {
		this.duierInfoName = duierInfoName;
	}
	public DuierClass getDuierInfoClass() {
		return duierInfoClass;
	}
	public void setDuierInfoClass(DuierClass duierInfoClass) {
		this.duierInfoClass = duierInfoClass;
	}
	public Date getDuierInfoStartTime() {
		return duierInfoStartTime;
	}
	public void setDuierInfoStartTime(Date duierInfoStartTime) {
		this.duierInfoStartTime = duierInfoStartTime;
	}
	public Date getDuierInfoEndTime() {
		return duierInfoEndTime;
	}
	public void setDuierInfoEndTime(Date duierInfoEndTime) {
		this.duierInfoEndTime = duierInfoEndTime;
	}
	public Date getDuierInfoUpdateTime() {
		return duierInfoUpdateTime;
	}
	public void setDuierInfoUpdateTime(Date duierInfoUpdateTime) {
		this.duierInfoUpdateTime = duierInfoUpdateTime;
	}
	public int getDuierInfoArea() {
		return duierInfoArea;
	}
	public void setDuierInfoArea(int duierInfoArea) {
		this.duierInfoArea = duierInfoArea;
	}
	public String getDuierInfoLocation() {
		return duierInfoLocation;
	}
	public void setDuierInfoLocation(String duierInfoLocation) {
		this.duierInfoLocation = duierInfoLocation;
	}
	public int getDuierInfoLowlimitPerson() {
		return duierInfoLowlimitPerson;
	}
	public void setDuierInfoLowlimitPerson(int duierInfoLowlimitPerson) {
		this.duierInfoLowlimitPerson = duierInfoLowlimitPerson;
	}
	public int getDuierInfouplimitPerson() {
		return duierInfouplimitPerson;
	}
	public void setDuierInfouplimitPerson(int duierInfouplimitPerson) {
		this.duierInfouplimitPerson = duierInfouplimitPerson;
	}
	public String getDuierInfoActivityIntroduction() {
		return duierInfoActivityIntroduction;
	}
	public void setDuierInfoActivityIntroduction(
			String duierInfoActivityIntroduction) {
		this.duierInfoActivityIntroduction = duierInfoActivityIntroduction;
	}
	public Integer getDuierInfoActivityStatus() {
		return duierInfoActivityStatus;
	}
	public void setDuierInfoActivityStatus(Integer duierInfoActivityStatus) {
		this.duierInfoActivityStatus = duierInfoActivityStatus;
	}
	public Integer getDuierInfoNeedUndertaker() {
		return duierInfoNeedUndertaker;
	}
	public void setDuierInfoNeedUndertaker(Integer duierInfoNeedUndertaker) {
		this.duierInfoNeedUndertaker = duierInfoNeedUndertaker;
	}
	public double getDuierInfoLocationLong() {
		return duierInfoLocationLong;
	}
	public void setDuierInfoLocationLong(double duierInfoLocationLong) {
		this.duierInfoLocationLong = duierInfoLocationLong;
	}
	public double getDuierInfoLocationLat() {
		return duierInfoLocationLat;
	}
	public void setDuierInfoLocationLat(double duierInfoLocationLat) {
		this.duierInfoLocationLat = duierInfoLocationLat;
	}
	public float getDuierInfoActivityFee() {
		return duierInfoActivityFee;
	}
	public void setDuierInfoActivityFee(float duierInfoActivityFee) {
		this.duierInfoActivityFee = duierInfoActivityFee;
	}
	public int getDuierInfoExt1() {
		return duierInfoExt1;
	}
	public void setDuierInfoExt1(int duierInfoExt1) {
		this.duierInfoExt1 = duierInfoExt1;
	}
	public String getDuierInfoExt2() {
		return duierInfoExt2;
	}
	public void setDuierInfoExt2(String duierInfoExt2) {
		this.duierInfoExt2 = duierInfoExt2;
	}
	@Override
	public String toString() {
		return "DuierInfo [duierInfoId=" + duierInfoId + ", duierInfoCreator="
				+ duierInfoCreator + ", duierInfoCreateTime="
				+ duierInfoCreateTime + ", duierInfoName=" + duierInfoName
				+ ", duierInfoClass=" + duierInfoClass
				+ ", duierInfoStartTime=" + duierInfoStartTime
				+ ", duierInfoEndTime=" + duierInfoEndTime
				+ ", duierInfoUpdateTime=" + duierInfoUpdateTime
				+ ", duierInfoArea=" + duierInfoArea + ", duierInfoLocation="
				+ duierInfoLocation + ", duierInfoLowlimitPerson="
				+ duierInfoLowlimitPerson + ", duierInfouplimitPerson="
				+ duierInfouplimitPerson + ", duierInfoActivityIntroduction="
				+ duierInfoActivityIntroduction + ", duierInfoActivityStatus="
				+ duierInfoActivityStatus + ", duierInfoNeedUndertaker="
				+ duierInfoNeedUndertaker + ", duierInfoLocationLong="
				+ duierInfoLocationLong + ", duierInfoLocationLat="
				+ duierInfoLocationLat + ", duierInfoActivityFee="
				+ duierInfoActivityFee + ", duierInfoExt1=" + duierInfoExt1
				+ ", duierInfoExt2=" + duierInfoExt2 + "]";
	}
	public String toJsonString()
	{
//		{"duierInfoId":"2","duierInfoCreator":"6"}
		String duierInfo_json = "{"
				+ "\"id\":\"" + duierInfoId + "\","
				+ "\"creator\":\"" + duierInfoCreator + "\","
				+ "\"createTime\":\"" + duierInfoCreateTime + "\","
				+ "\"name\":\"" + duierInfoName + "\","
				+ "\"class\":\"" + duierInfoClass + "\","
				+ "\"startTime\":\"" + duierInfoStartTime + "\","
				+ "\"endTime\":\"" + duierInfoEndTime + "\","
				+ "\"updateTime\":\"" + duierInfoUpdateTime + "\","
				+ "\"area\":\"" + duierInfoArea + "\","
				+ "\"location\":\"" + duierInfoLocation + "\","
				+ "\"lowlimitPerson\":\"" + duierInfoLowlimitPerson + "\","
				+ "\"uplimitPerson\":\"" + duierInfouplimitPerson + "\","
				+ "\"introduction\":\"" + duierInfoActivityIntroduction + "\","
				+ "\"status\":\"" + duierInfoActivityStatus + "\","
				+ "\"needUndertaker\":\"" + duierInfoNeedUndertaker + "\","
				+ "\"fee\":\"" + duierInfoActivityFee + "\""
				+ "}";

		return duierInfo_json;
	}
}
