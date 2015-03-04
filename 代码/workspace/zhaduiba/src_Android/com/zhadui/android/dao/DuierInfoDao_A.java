package com.zhadui.android.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierInfo;

public interface DuierInfoDao_A {

	public List<DuierInfo> getDuierListByClassIdForLimit(Map<String,Integer> paramMap);
	public DuierInfo getDuierInfoById(BigInteger duierInfoId);
	/**
	 * 统计用户垒了多少堆
	 * @param userId 用户主键
	 * @return 垒堆数量
	 * @author wang.xr
	 */
	public int countDuierNumByUserId(int userId);
	/**
	 * 根据关键字检索堆列表
	 * @param map 关键字参数
	 * @return List<DuierInfo>
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public List<DuierInfo> searchDuierInfoByKeyWords(Map map);
	/**
	 * 修改堆状态（是否封堆）
	 * @param map map参数，存放堆主键和堆状态
	 * @return boolean
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public boolean updateDuierStatus(Map map);
	/**
	 * 修改堆更新时间
	 * @param map map参数(updateTime,duierInfoId)
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public void renewUpdateTime(Map map);
}
