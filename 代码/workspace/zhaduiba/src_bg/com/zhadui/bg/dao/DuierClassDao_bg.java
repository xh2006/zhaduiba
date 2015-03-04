package com.zhadui.bg.dao;

import java.util.List;

import com.zhadui.common.entity.DuierClass;

public interface DuierClassDao_bg {

	/**
	 * 查找所有主题列表
	 * @return List<DuierClass>
	 * @author wang.xr
	 */
	public List<DuierClass> getDuierClassList();
	/**
	 * 添加一条堆分类
	 * @param duierClass 堆类别对象
	 * @author wang.xr
	 */
	public void addDuierClass(DuierClass duierClass);
	/**
	 * 统计主题的数目
	 * @return int
	 * @author wang.xr
	 */
	public int getDuierClassCount();
	/**
	 * 根据堆主键获取一条对信息
	 * @param duierClassId
	 * @return DuierClass
	 * @author wang.xr
	 */
	public DuierClass getDuierClassById(int duierClassId);
	/**
	 * 更新主题
	 * @param duierClass 主题对象
	 * @author wang.xr
	 */
	public void updateDuierClass(DuierClass duierClass);
	/**
	 * 根据主键删除类
	 * @param duierClassId 主键
	 * @author wang.xr
	 */
	public void deleteDuierClassById(int duierClassId);
	/**
	 * 修改堆主题的显示顺序
	 * @param duierClassId 对主题主键
	 * @param layer 顺序
	 * @author wang.xr
	 */
	public void updateDuierClassLayer(int duierClassId,int layer);
}
