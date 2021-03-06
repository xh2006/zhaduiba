/**
 * FileName: 	DuierInfoDao.java
 * FileDes:  	管理堆儿信息的接口申明。
 * FileAuthors: XuHua
 */
package com.zhadui.front.dao;

import java.util.List;

import com.zhadui.common.entity.DuierChatInfo;
import com.zhadui.common.entity.DuierInfo;
 
public interface DuierInfoDao {
	public List<DuierInfo> getDuierInfo(int nStartId, int nItems);
	
	/**
	 * 根据堆ID获得堆儿信息
	 */
	public DuierInfo getDuierInfoByDuierId(int id);
	
	/**
	 * 根据堆ID获得堆儿留言信息
	 */
	public List<DuierChatInfo> getDuierChatInfoByDuierId(int id);
	
	/**
	 * 插入堆儿评论信息
	 * @param duierChatInfo
	 */
	public void insertDuierChatInfo(DuierChatInfo duierChatInfo);
	
	/**
	 * 插入堆儿信息
	 * @param duierInfo
	 */
	public void insertDuierInfo(DuierInfo duierInfo);
	
	public void updateDuierInfo(DuierInfo duierInfo);
}
