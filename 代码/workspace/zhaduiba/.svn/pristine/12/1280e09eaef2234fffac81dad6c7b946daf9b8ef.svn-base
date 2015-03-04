package com.zhadui.android.biz;

import java.math.BigInteger;

import net.sf.json.JSONObject;

public interface DuierUndertakeInfoBiz_A {

	/**
	 * 得到对的承接者信息
	 * @param duierId 堆主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierUndertakeInfoByDuierId(BigInteger duierId);
	/**
	 * 用于获取申请承接人用户信息列表
	 * @param duierId 堆主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierUndertakeListByDuierId(BigInteger duierId);
	/**
	 * 指定堆的承接者
	 * @param duierId 堆主键
	 * @param userId 用户主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject appointDuierUnertakeByduierIdAndUserId(BigInteger duierId,int userId);
	/**
	 * 添加一条竞选信息
	 * @param duierId 堆主键
	 * @param userId 用户主键
	 * @param affair 事项
	 * @param fee 费用
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject addDuierUndertakeInfo(BigInteger duierId,int userId,String affair,float fee);
}
