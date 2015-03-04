package com.zhadui.android.biz;


import java.math.BigInteger;

import net.sf.json.JSONObject;


public interface DuierInfoBiz_A {

	/**
	 * 根据堆类别获取堆列表信息
	 * @param classId 分类主键
	 * @param startNum 记录开始
	 * @param countNum 查找记录数
	 * @param dstatus 堆状态
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierListByClassIdA(int classId,int startNum,int countNum,int dstatus);
	/**
	 * 根据主键获取堆信息
	 * @param duierInfoId 堆主键
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject getDuierInfoById(BigInteger duierInfoId);
	/**
	 * 根据关键字检索堆列表信息
	 * @param keyWords 关键字
	 * @param startNum 开始查询记录数
	 * @param count 查询的记录数
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject searchDuierListByKey(String keyWords,int startNum,int count);
	/**
	 * 修改堆状态（是否封堆）
	 * @param duierId 堆主键
	 * @param duierStatus 对状态
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject updateDuierStatus(BigInteger duierId,boolean duierStatus);
}
