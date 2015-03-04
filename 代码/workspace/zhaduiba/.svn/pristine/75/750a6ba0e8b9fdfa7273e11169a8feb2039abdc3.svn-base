package com.zhadui.android.dao;

import java.math.BigInteger;
import java.util.Map;

import com.zhadui.common.entity.DuierStatus;

public interface DuierStatusDao_A {

	/**
	 * 统计扎堆人数
	 * @param DId 堆主键
	 * @return 扎堆人数
	 * @author wang.xr
	 */
	public int countParticipantByDId(BigInteger DId);
	@SuppressWarnings("rawtypes")
	/**
	 * 判断用户是否已扎堆
	 * @param paramMap map参数
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean userIfInDuier(Map paramMap);
	/**
	 * 扎堆
	 * @param duierStatus
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean addDuierStatus(DuierStatus duierStatus);
	/**
	 * 修改堆
	 * @param duierStatus
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean updateDuierStatus(DuierStatus duierStatus);
	/**
	 * 退出堆
	 * @param duierStatusId
	 * @return true/false
	 * @author wang.xr
	 */
	public boolean deleteDuierStatusById(int duierStatusId);
	/**
	 * 根据用户主键和堆主键获取堆状态
	 * @param userId 用户主键
	 * @param duierId 堆主键
	 * @return DuierStatus对象
	 * @author wang.xr
	 */
	public DuierStatus getDuierStatusByUIdAndDId(int userId,BigInteger duierId);
	/**
	 * 根据用户主键统计用户已经扎堆的数量
	 * @param userId 用户主键
	 * @return 用户扎堆的数量
	 * @author wang.xr
	 */
	public int countDuierNumByUId(int userId);
}
