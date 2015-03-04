package com.zhadui.android.action;

import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.zhadui.android.biz.DuierInfoBiz_A;
import com.zhadui.common.entity.DuierInfo;
public class DuierInfoAction_A {

	private int tab_id;
	private int list_startnum;
	private int list_getcount;
	private int dstatus;
	private BigInteger list_id;
	private String search_text;
	private String list_name;
	private double list_lng;
	private double list_lat;
	private String list_content;
	private String list_required_time;
	private String list_required_nums;
	private String list_requried_address;
	private float list_required_pay;
	private Integer is_need_undertaker;
	private boolean list_status;
	
	public boolean isList_status() {
		return list_status;
	}

	public void setList_status(boolean list_status) {
		this.list_status = list_status;
	}

	public String getList_name() {
		return list_name;
	}
	public void setList_name(String list_name) {
		this.list_name = list_name;
	}
	public double getList_lng() {
		return list_lng;
	}
	public void setList_lng(double list_lng) {
		this.list_lng = list_lng;
	}
	public double getList_lat() {
		return list_lat;
	}
	public void setList_lat(double list_lat) {
		this.list_lat = list_lat;
	}
	public String getList_content() {
		return list_content;
	}
	public void setList_content(String list_content) {
		this.list_content = list_content;
	}
	public String getList_required_time() {
		return list_required_time;
	}
	public void setList_required_time(String list_required_time) {
		this.list_required_time = list_required_time;
	}
	public String getList_required_nums() {
		return list_required_nums;
	}
	public void setList_required_nums(String list_required_nums) {
		this.list_required_nums = list_required_nums;
	}
	public String getList_requried_address() {
		return list_requried_address;
	}
	public void setList_requried_address(String list_requried_address) {
		this.list_requried_address = list_requried_address;
	}
	public float getList_required_pay() {
		return list_required_pay;
	}
	public void setList_required_pay(float list_required_pay) {
		this.list_required_pay = list_required_pay;
	}
	public Integer getIs_need_undertaker() {
		return is_need_undertaker;
	}
	public void setIs_need_undertaker(Integer is_need_undertaker) {
		this.is_need_undertaker = is_need_undertaker;
	}
	public String getSearch_text() {
		return search_text;
	}
	public void setSearch_text(String search_text) {
		this.search_text = search_text;
	}
	public BigInteger getList_id() {
		return list_id;
	}
	public void setList_id(BigInteger list_id) {
		this.list_id = list_id;
	}
	public int getDstatus() {
		return dstatus;
	}
	public void setDstatus(int dstatus) {
		this.dstatus = dstatus;
	}
	public int getTab_id() {
		return tab_id;
	}
	public void setTab_id(int tab_id) {
		this.tab_id = tab_id;
	}
	public int getList_startnum() {
		return list_startnum;
	}
	public void setList_startnum(int list_startnum) {
		this.list_startnum = list_startnum;
	}
	public int getList_getcount() {
		return list_getcount;
	}
	public void setList_getcount(int list_getcount) {
		this.list_getcount = list_getcount;
	}

	private DuierInfoBiz_A duierInfoBizA;
	
	public void setDuierInfoBizA(DuierInfoBiz_A duierInfoBizA) {
		this.duierInfoBizA = duierInfoBizA;
	}

	public void android_getDListByCId() {
		HttpServletResponse response = ServletActionContext.getResponse();/*tab_id, list_startnum, list_getcount*/
		JSONObject json = duierInfoBizA.getDuierListByClassIdA(tab_id, list_startnum, list_getcount,dstatus);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	public void android_getDuierInfo(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierInfoBizA.getDuierInfoById(list_id);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	
	public void android_searchDuierList(){
		HttpServletResponse response=ServletActionContext.getResponse();
		JSONObject json=duierInfoBizA.searchDuierListByKey(search_text,list_startnum,list_getcount);
		try {
			response.setCharacterEncoding("utf-8");
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
	
	public void android_addDuierInfo(){
		/*  private String list_name;
			private double list_lng;
			private double list_lat;
			private String list_content;
			private String list_required_time;
			private int list_required_nums;
			private String list_requried_address;
			private float list_required_pay;
			private Integer is_need_undertaker;
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
		DuierInfo duierInfo=new DuierInfo();
		duierInfo.setDuierInfoName(list_name);
		duierInfo.setDuierInfoLocationLong(list_lng);
		duierInfo.setDuierInfoLocationLat(list_lat);
		duierInfo.setDuierInfoActivityIntroduction(list_content);
		String[] timeArr=list_required_time.split("#");
		try {
			duierInfo.setDuierInfoStartTime(sdf.parse((timeArr[0])));
			duierInfo.setDuierInfoEndTime(sdf.parse((timeArr[1])));
		} catch (ParseException e) {
		}
		String[] numArr=list_required_nums.split("#");
		duierInfo.setDuierInfoLowlimitPerson(Integer.parseInt(numArr[0]));
		duierInfo.setDuierInfouplimitPerson(Integer.parseInt(numArr[1]));
		duierInfo.setDuierInfoLocation(list_requried_address);
		duierInfo.setDuierInfoActivityFee(list_required_pay);
		duierInfo.setDuierInfoNeedUndertaker(is_need_undertaker);
		duierInfo.setDuierInfoActivityStatus(1);
		
	}
	
public void android_updateDuierStatus(){
	HttpServletResponse response=ServletActionContext.getResponse();
	JSONObject json=duierInfoBizA.updateDuierStatus(list_id, list_status);
	try {
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(json.toString());
	} catch (IOException e) {
	}
	}
}
