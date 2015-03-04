package com.zhadui.bg.dao;

import java.util.List;

import com.zhadui.common.entity.DuierClassImage;

public interface AdDao_bg {

	/**
	 * 得到所有广告列表
	 * @return List<DuierClassImage>
	 * @author wang.xr
	 */
	public List<DuierClassImage> getDuierClassImageList();
	/**
	 * 添加一条广告信息
	 * @param duierClassImage 对象
	 * @author wang.xr
	 */
	public void addDuierClassImage(DuierClassImage duierClassImage);
	/**
	 * 根据主键得到一个DuierClassImage对象
	 * @param duierClassImageId 主键
	 * @return DuierClassImage对象
	 * @author wang.xr
	 */
	public DuierClassImage getDuierClassImageById(int duierClassImageId);
	/**
	 * 根据主键删除一条广告信息
	 * @param duierClassImageId 主键
	 * @author wang.xr
	 */
	public void deleteDuierClassImageById(int duierClassImageId);
}
