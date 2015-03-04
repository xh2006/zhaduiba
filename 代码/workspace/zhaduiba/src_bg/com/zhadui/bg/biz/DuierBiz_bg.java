package com.zhadui.bg.biz;

import java.util.List;

import com.zhadui.common.entity.DuierInfo;

public interface DuierBiz_bg {

	/**
	 * 查询
	 * @param offset 开始记录数
	 * @param endNum 结束记录数
	 * @param duierName 堆名称
	 * @param duierStatus 堆状态
	 * @param duierNum 人数
	 * @return
	 * @author wang.xr
	 */
	public List<DuierInfo> loadDuierList(int offset,int endNum,String duierName,int duierStatus,int duierNum);
	/**
	 * 统计总记录数
	 * @return
	 * @author wang.xr
	 */
	public int countTotalRecord();
}
