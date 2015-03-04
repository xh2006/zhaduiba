package com.zhadui.bg.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.bg.biz.DuierBiz_bg;
import com.zhadui.common.entity.DuierInfo;

public class DuierAction_bg extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private List<DuierInfo> duierList;
	private int currentPage;
	private int totalRecord;
	private int totalPage;
	private String duierName;
	private int duierStatus=999;
	private int peopleNum=0;
	
	public String getDuierName() {
		return duierName;
	}
	public void setDuierName(String duierName) {
		this.duierName = duierName;
	}
	public int getDuierStatus() {
		return duierStatus;
	}
	public void setDuierStatus(int duierStatus) {
		this.duierStatus = duierStatus;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	private DuierBiz_bg duierBizBg;
	
	public void setDuierBizBg(DuierBiz_bg duierBizBg) {
		this.duierBizBg = duierBizBg;
	}
	public List<DuierInfo> getDuierList() {
		return duierList;
	}
	public void setDuierList(List<DuierInfo> duierList) {
		this.duierList = duierList;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String toDuierList(){
		//判断当前页
		if(currentPage==0){
			currentPage=1;
		}
		//每页显示记录
		int pageSize=2;
		//总记录数
		totalRecord=duierBizBg.countTotalRecord();
		//总页数
		totalPage=totalRecord%pageSize==0?totalRecord/pageSize:totalRecord/pageSize+1;
		int offset=pageSize*(currentPage-1);
		int endNum=offset+pageSize;
		duierList=duierBizBg.loadDuierList(offset, endNum,duierName,duierStatus,peopleNum);
		return "toDuierList";
	}
}
