package com.zhadui.android.biz;

import java.math.BigInteger;

import net.sf.json.JSONObject;

public interface DuierStatusBiz_A {
	/**
	 * 判断用户是否已经扎堆
	 * @param userId 用户主键
	 * @param duierId 堆主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject userIfInWithUserIdAndDuierId(int userId,BigInteger duierId);
	/**
	 * 扎堆
	 * @param userId 用户主键
	 * @param duierId 堆主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject userJoinDuier(int userId,BigInteger duierId);
	/**
	 * 取消扎堆
	 * @param userId 用户主键
	 * @param duierId 堆主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject userQuitDuier(int userId,BigInteger duierId); 
}
