package com.zhadui.android.biz.impl;

import net.sf.json.JSONObject;

import com.zhadui.android.biz.AppInfoBiz_A;
import com.zhadui.android.dao.AppInfoDao_A;
import com.zhadui.common.entity.AppInfo;

public class AppInfoBizImpl_A implements AppInfoBiz_A {

	private AppInfoDao_A appInfoDaoA;

	public void setAppInfoDaoA(AppInfoDao_A appInfoDaoA) {
		this.appInfoDaoA = appInfoDaoA;
	}

	@Override
	public JSONObject getAppVersionAndDownload(int versionCode) {
		JSONObject json=new JSONObject();
		try {
			AppInfo maxAppInfo = appInfoDaoA.getMaxCodeVersionAppInfo();
			if (maxAppInfo != null) {
				JSONObject json1=new JSONObject();
				if (maxAppInfo.getAppInfoVersionCode() > versionCode) {
					json1.put("is_need_update",true);
					json1.put("url_apk",maxAppInfo.getAppInfoDownloadUrl());
				}else{
					json1.put("is_need_update",false);
					json1.put("url_apk",maxAppInfo.getAppInfoDownloadUrl());
				}
				json.put("result","check_ok");
				json.put("content",json1);
			}else{
				json.put("result","check_fail");
				json.put("content","没有相关数据");
			}
		} catch (Exception e) {
			json.put("result","check_error");
			json.put("content","服务器问题");
		}
		return json;
	}

}