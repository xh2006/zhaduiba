package com.zhadui.bg.biz;

import java.util.List;

import com.zhadui.common.entity.DuierClass;

public interface ThemeBiz_bg {

	/**
	 * 查找主题列表
	 * @return List<DuierClass>
	 * @author wang.xr
	 */
	public List<DuierClass> getAllThemes();
	/**
	 * 添加一个主题
	 * @author wang.xr
	 */
	public void addTheme(DuierClass duierClass);
	/**
	 * 根据主键获取一个主题对象
	 * @param duierClassId
	 * @return DuierClass
	 * @author wang.xr
	 */
	public DuierClass getDuierClassById(int duierClassId);
	/**
	 * 更新主题
	 * @param duierClass 堆主题对象
	 * @author wang.xr
	 */
	public void updateDuierClass(DuierClass duierClass);
	/**
	 * 根据主键删除主题
	 * @param themeId 主题主键
	 * @author wang.xr
	 */
	public void deleteThemeByThemeId(int themeId);
	/**
	 * 根据传递进来的ID顺序重新排序
	 * @param sortArray 包含Id的数组
	 * @author wang.xr
	 */
	public void updateThemeSort(int[] sortArray);
}
