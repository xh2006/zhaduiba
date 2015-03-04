package com.zhadui.android.biz;

import net.sf.json.JSONObject;

public interface AppInfoBiz_A {

	/**
	 * 根据代码版本号查询是否需要更新并且提供下载连接
	 * @param versionCode 代码版本号
	 * @return JSONObject{result:”check_ok”，content:{is_need_update:true,url_apk:”http://192.168.1.1/zhaduier.apk”}}
	 * @author wang.xr
	 */
	public JSONObject getAppVersionAndDownload(int versionCode);
}
