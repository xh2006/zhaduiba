package com.zhadui.android.biz;

import java.math.BigInteger;

import net.sf.json.JSONObject;

public interface DuierChatInfoBiz_A {

	/**
	 * 得到堆浏览列表
	 * @param duierId 堆主键
	 * @param startNum 开始数
	 * @param count 统计记录数
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierChatInfoListByDuierId(BigInteger duierId,int startNum,int count);
	/**
	 * 留言
	 * @param duierId 堆主键
	 * @param userId 用户主键
	 * @param message 留言内容
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject addMessage(BigInteger duierId,int userId,String message);
}
