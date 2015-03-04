package com.zhadui.bg.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.bg.biz.ThemeBiz_bg;
import com.zhadui.common.entity.DuierClass;

public class ThemeAction_bg extends ActionSupport {

	private List<DuierClass> duierClassList;
	private DuierClass duierClass;
	private int duierClassId;
	private String sortStr;
	public String getSortStr() {
		return sortStr;
	}
	public void setSortStr(String sortStr) {
		this.sortStr = sortStr;
	}
	public int getDuierClassId() {
		return duierClassId;
	}
	public void setDuierClassId(int duierClassId) {
		this.duierClassId = duierClassId;
	}
	public DuierClass getDuierClass() {
		return duierClass;
	}
	public void setDuierClass(DuierClass duierClass) {
		this.duierClass = duierClass;
	}
	private ThemeBiz_bg themeBizBg;
	
	public void setThemeBizBg(ThemeBiz_bg themeBizBg) {
		this.themeBizBg = themeBizBg;
	}
	public List<DuierClass> getDuierClassList() {
		return duierClassList;
	}
	public void setDuierClassList(List<DuierClass> duierClassList) {
		this.duierClassList = duierClassList;
	}

	
	public String toThemeList(){
		duierClassList=themeBizBg.getAllThemes();
		return "toThemeList";
	}
	public String toAddTheme(){
		return "toAddTheme";
	}
	public String addTheme(){
		themeBizBg.addTheme(duierClass);
		return "addTheme";
	}
	
	public String toUpdateTheme(){
		duierClass=themeBizBg.getDuierClassById(duierClassId);
		return "toUpdateTheme";
	}
	public String updateTheme(){
		themeBizBg.updateDuierClass(duierClass);
		return "updateTheme";
	}
	public String deleteTheme(){
		themeBizBg.deleteThemeByThemeId(duierClassId);
		List<DuierClass> list=themeBizBg.getAllThemes();
		String str="";
		for(int i=0;i<list.size();i++){
			str+=list.get(i).getDuierClassId()+",";
		}
		//ÅÅÐò
		int[] n=new int[str.length()];
		String[] strArray=str.split(",");
		for(int i=0;i<strArray.length;i++){
			n[i]=Integer.parseInt(strArray[i]);
		}
		themeBizBg.updateThemeSort(n);
		return "deleteTheme";
	}
	public String toSortTheme(){
		duierClassList=themeBizBg.getAllThemes();
		return "toSortTheme";
	}
	public String sortTheme(){
		int[] n=new int[sortStr.length()];
		
		String[] strArray=sortStr.split(",");
		for(int i=0;i<strArray.length;i++){
			n[i]=Integer.parseInt(strArray[i]);
		}
		themeBizBg.updateThemeSort(n);
		return "sortTheme";
	}
}
