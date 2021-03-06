package com.zhadui.personal.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.common.entity.DuierInfo;
import com.zhadui.common.entity.DuierStatus;
import com.zhadui.common.entity.DuierUndertakeInfo;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.common.entity.UserInfo;
import com.zhadui.common.entity.UserInfoDetail;
import com.zhadui.personal.biz.PersonalCenterBiz;

public class PersonalCenterAction extends ActionSupport {

	private PersonalCenterBiz personalCenterBiz;
	private UserInfo userInfo;
	private UserInfoDetail userInfoDetail;
	private List<DuierStatus> duierStatusList;
	private int joinedNum;
	private int createdNum;
	private List<DuierInfo> duierInfoList;
	private List<DuierUndertakeInfo> undertakeredDuierList;
	private int undertakeredNum;
	private int ifRefresh=0;
	public int getIfRefresh() {
		return ifRefresh;
	}

	public void setIfRefresh(int ifRefresh) {
		this.ifRefresh = ifRefresh;
	}

	public int getUndertakeredNum() {
		return undertakeredNum;
	}

	public void setUndertakeredNum(int undertakeredNum) {
		this.undertakeredNum = undertakeredNum;
	}

	public List<DuierUndertakeInfo> getUndertakeredDuierList() {
		return undertakeredDuierList;
	}

	public void setUndertakeredDuierList(
			List<DuierUndertakeInfo> undertakeredDuierList) {
		this.undertakeredDuierList = undertakeredDuierList;
	}

	public int getCreatedNum() {
		return createdNum;
	}

	public void setCreatedNum(int createdNum) {
		this.createdNum = createdNum;
	}

	public List<DuierInfo> getDuierInfoList() {
		return duierInfoList;
	}

	public void setDuierInfoList(List<DuierInfo> duierInfoList) {
		this.duierInfoList = duierInfoList;
	}

	public int getJoinedNum() {
		return joinedNum;
	}

	public void setJoinedNum(int joinedNum) {
		this.joinedNum = joinedNum;
	}

	public List<DuierStatus> getDuierStatusList() {
		return duierStatusList;
	}

	public void setDuierStatusList(List<DuierStatus> duierStatusList) {
		this.duierStatusList = duierStatusList;
	}

	public UserInfoDetail getUserInfoDetail() {
		return userInfoDetail;
	}

	public void setUserInfoDetail(UserInfoDetail userInfoDetail) {
		this.userInfoDetail = userInfoDetail;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setPersonalCenterBiz(PersonalCenterBiz personalCenterBiz) {
		this.personalCenterBiz = personalCenterBiz;
	}

	/**
	 * 去个人中心页面
	 * @return
	 * @author wang.xr
	 */
	public String toPersonalCenter(){
		/**
		 * 此处到时候替换为从session中获取主键
		 */
		ifRefresh=0;
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		userInfo=personalCenterBiz.getUserInfoById(userInfoId);
		userInfoDetail=personalCenterBiz.getUserInfoDetailById(userInfoId);
		joinedNum=personalCenterBiz.countJoinedDuierByUserId(userInfoId);
		createdNum=personalCenterBiz.countCreatedDuierByUserId(userInfoId);
		undertakeredNum=personalCenterBiz.countUndertakeredDuierByUserId(userInfoId);
		return "toPersonalCenter";
	}
	/**
	 * 去详细信息页面
	 * @return
	 * @author wang.xr
	 */
	public String toInfoDetails(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		userInfo=personalCenterBiz.getUserInfoById(userInfoId);
		userInfoDetail=personalCenterBiz.getUserInfoDetailById(userInfoId);
		return "toInfoDetails";
	}
	/**
	 * 去已扎堆列表信息
	 * @return
	 * @author wang.xr
	 */
	public String toJoinedDuierList(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		duierStatusList=personalCenterBiz.getDuierStatusListByUserId(userInfoId);
		return "toJoinedDuierList";
	}
	/**
	 * 去已垒堆列表
	 * @return
	 * @author wang.xr
	 */
	public String toCreatedDuierList(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		duierInfoList=personalCenterBiz.getCreatedDuierListByUserId(userInfoId);
		return "toCreatedDuierList";
	}
	/**
	 * 去承接堆列表
	 * @return toUndertakeredDuierList
	 * @author wang.xr
	 */
	public String toUndertakeredDuierList(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		undertakeredDuierList=personalCenterBiz.getUndertakedDuierListByUserId(userInfoId);
		return "toUndertakeredDuierList";
	}
	/**
	 * 去修改个人信息页面
	 * @return
	 * @author wang.xr
	 */
	public String toUpdateInfo(){
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		userInfo=personalCenterBiz.getUserInfoById(userInfoId);
		userInfoDetail=personalCenterBiz.getUserInfoDetailById(userInfoId);
		return "toUpdateInfo";
	}
	/**
	 * 修改个人信息
	 * @return updateInfo
	 * @author wang.xr
	 */
	public String updateInfo(){
		personalCenterBiz.updateUserInfo(userInfo, userInfoDetail);
		ifRefresh=1;
		return "updateInfo";
	}
}
