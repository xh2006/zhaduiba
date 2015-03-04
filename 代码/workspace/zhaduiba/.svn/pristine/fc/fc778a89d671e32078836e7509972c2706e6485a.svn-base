package com.zhadui.android.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.DuierClassBiz_A;
import com.zhadui.common.entity.DuierClass;
import com.zhadui.common.util.PageModel;

public class DuierClassAction_A extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DuierClassBiz_A duierClassBizA;

	public void setDuierClassBizA(DuierClassBiz_A duierClassBizA) {
		this.duierClassBizA = duierClassBizA;
	}

	public void android_getTheme() {
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = duierClassBizA.getThemes();
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void TestPage() {
		int currentPage;
		String page = "0";
		// totalRecorº∆À„
		int totalRecord = 0;
		totalRecord = duierClassBizA.getTotalRecord();
		PageModel pageModel = PageModel.newPageModel(1, page, totalRecord);
		List<DuierClass> list = duierClassBizA.queryForPage(pageModel);
		pageModel.setDataList(list);
		currentPage = pageModel.getCurrentPage();
		System.out.println("------------" + pageModel.getDataList().size()
				+ "-------currentPage" + currentPage);

	}
}
