package com.zhadui.bg.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.bg.biz.AppBiz_bg;
import com.zhadui.common.entity.AppInfo;

public class AppAction_bg extends ActionSupport {
 
	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private List<AppInfo> appList;
	private AppBiz_bg appBizBg;
	private int phoneApkId;
	private String phoneApkName;
	private String phoneApkversionName;
	private int phoneApkversionCode;
	private File phoneApk;
	private String phoneApkFileName;
	private String phoneApkSummary;
	
	public List<AppInfo> getAppList() {
		return appList;
	}
	public void setAppList(List<AppInfo> appList) {
		this.appList = appList;
	}
	public int getPhoneApkId() {
		return phoneApkId;
	}
	public void setPhoneApkId(int phoneApkId) {
		this.phoneApkId = phoneApkId;
	}
	public String getPhoneApkName() {
		return phoneApkName;
	}
	public void setPhoneApkName(String phoneApkName) {
		this.phoneApkName = phoneApkName;
	}
	public String getPhoneApkversionName() {
		return phoneApkversionName;
	}
	public void setPhoneApkversionName(String phoneApkversionName) {
		this.phoneApkversionName = phoneApkversionName;
	}
	public int getPhoneApkversionCode() {
		return phoneApkversionCode;
	}
	public void setPhoneApkversionCode(int phoneApkversionCode) {
		this.phoneApkversionCode = phoneApkversionCode;
	}
	public File getPhoneApk() {
		return phoneApk;
	}
	public void setPhoneApk(File phoneApk) {
		this.phoneApk = phoneApk;
	}
	public String getPhoneApkFileName() {
		return phoneApkFileName;
	}
	public void setPhoneApkFileName(String phoneApkFileName) {
		this.phoneApkFileName = phoneApkFileName;
	}
	public String getPhoneApkSummary() {
		return phoneApkSummary;
	}
	public void setPhoneApkSummary(String phoneApkSummary) {
		this.phoneApkSummary = phoneApkSummary;
	}
	public void setAppBizBg(AppBiz_bg appBizBg) {
		this.appBizBg = appBizBg;
	}
	public String toAppList(){
		appList=appBizBg.loadAppList();
		return "toAppList";
	}
	public String deleteApp(){
		appBizBg.deleteAppById(phoneApkId);
		return "deleteApp";
	}
	public String toAddApp(){
		return "toAddApp";
	}
	
	public String addApp(){
		String apkPath=ServletActionContext.getServletContext().getRealPath("apkFiles");
		String apkname=String.valueOf(System.currentTimeMillis())+new Random().nextInt(10000)+".apk";
		File apkFile=new File(apkPath,apkname);
		try {
			FileUtils.copyFile(phoneApk,apkFile);
		} catch (IOException e) {
		}
		String downloadSrc="apkFiles/"+apkname;
		AppInfo appInfo=new AppInfo();
		appInfo.setAppInfoName(phoneApkName);
		appInfo.setAppInfoVersionCode(phoneApkversionCode);
		appInfo.setAppInfoVersionName(phoneApkversionName);
		appInfo.setAppInfoSummary(phoneApkSummary);
		appInfo.setAppInfoDownloadUrl(downloadSrc);
		appInfo.setAppInfoUpdateTime(new Date());
		appBizBg.addApp(appInfo);
		return "addApp";
	}
	
	public void validateAddApp(){
		super.clearFieldErrors();
		System.out.println("====="+phoneApk);
		if(phoneApkName==null){
			super.addFieldError("appNameError","应用名称不能为空");
			return;
		}
		if(phoneApkversionName==null){
			super.addFieldError("versionNameError","versionName不能为空");
			return;
		}
		if(phoneApkversionCode==0){
			super.addFieldError("versionCodeError","versionCode不能为空");
			return;
		}
		if(phoneApk==null){
			super.addFieldError("appError","应用不能为空");
			return;
		}
		Pattern p=Pattern.compile(".*.apk$");
		Matcher m=p.matcher(phoneApkFileName);
		if(!m.matches()){
			super.addFieldError("appError","应用不是有效的手机应用");
			return;
		}
		if(phoneApkSummary==null){
			super.addFieldError("appSummaryError","应用摘要不能为空");
			return;
		}
	}
}
