package com.zhadui.android.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierUndertakeInfo;

public interface DuierUndertakeInfoDao_A {

	/**
	 * 根据堆主键获取堆的承接者
	 * @param duierId 堆主键
	 * @return DuierUndertakeInfo
	 * @author wang.xr
	 */
	public DuierUndertakeInfo getDuierUnderTakeInfoByDuierId(BigInteger duierId);
	/**
	 * 根据堆主键获取想要承接堆的人的列表信息
	 * @param duierId 堆主键
	 * @return List<DuierUndertakeInfo>
	 * @author wang.xr
	 */
	public List<DuierUndertakeInfo> getDuierUndertakeListByDuierId(BigInteger duierId);
	/**
	 * 指定堆的承接者，修改承接成功与否信息
	 * @param map 参数，存放堆主键和用户主键
	 * @return boolean
	 * @author wang.xr
	 */
	@SuppressWarnings("rawtypes")
	public boolean updateDuierUndertakeForAppoint(Map map);
	/**
	 * 添加一条竞选记录
	 * @param duierUndertakeInfo 承接人对象
	 * @return boolean
	 * @author wang.xr
	 */
	public boolean addDuierUndertake(DuierUndertakeInfo duierUndertakeInfo);
}
