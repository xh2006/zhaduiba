package com.zhadui.common.util;

import java.util.List;

@SuppressWarnings("rawtypes")
public class PageModel {

	private int currentPage;
	private int pageSize;
	private int totalPage;
	private int totalRecord;
	private List dataList;

	private PageModel() {
	}

	private PageModel(final int pageSize, final String page, final int totalRecord) {
		this.pageSize = pageSize;
		this.totalRecord = totalRecord;
		setTotalPage();
		setCurrentPage(page);
	}

	public static PageModel newPageModel(final int pageSize, final String page,
			final int totalRecord) {
		return new PageModel(pageSize, page, totalRecord);
	}

	private void setCurrentPage(String page) {
		try {
			currentPage = Integer.parseInt(page);
		} catch (java.lang.NumberFormatException e) {
			// 这里异常不做处理，当前页默认为1
			currentPage = 1;
		}
		// 如果当前页小于第一页时，当前页指定到首页
		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage) {
			currentPage = totalPage;
		}
	}

	private void setTotalPage() {
		if (totalRecord % pageSize == 0) {
			totalPage = totalRecord / pageSize;
		} else {
			totalPage = totalRecord / pageSize + 1;
		}
	}

	/*
	 * 获得当前页
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/*
	 * 获得总页数
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/*
	 * 获得开始行数
	 */
	public int getStartRow() {
		return (currentPage - 1) * pageSize;
	}

	/*
	 * 获得结束行
	 */
	public int getEndRow() {
		return currentPage * pageSize;
	}

	/*
	 * 获得翻页数据
	 */
	public List getDataList() {
		return dataList;
	}

	/*
	 * 设置翻页数据
	 */
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	// 首页
	public int getFirst() {
		return 1;
	}

	//
	// 上一页
	public int getPrevious() {
		return currentPage - 1;
	}

	//
	// // 下一页
	public int getNext() {
		return currentPage + 1;
	}

	//
	// // 尾页
	//
	public int getLast() {
		return totalPage;
	}
}
