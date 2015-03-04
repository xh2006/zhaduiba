package com.zhadui.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormat {

	/**
	 * 
	 * @param date 要转化的日期
	 * @return 转换后的String类型的日期 格式为：yyyy-MM-dd HH:mm:ss
	 * @author wang.xr
	 */
	public static String getFormatDateToString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		return str;
	}
	/**
	 * 
	 * @param format 要转化的格式 例如："yyyy-MM-dd HH:mm:ss"
	 * @param date 要转化的日期
	 * @return 转化后的String类型
	 * @author wang.xr
	 */
	public static String getFormatDateToString(String format,Date date){
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		String str = sdf.format(date);
		return str;
	}
	/**
	 * 
	 * @param date 要转化的日期
	 * @return 转化后的Date类型的日期
	 * @author wang.xr
	 */
	public static Date getFormatDate(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=sdf.format(date);
		Date dateTime = new Date();
		try {
			dateTime = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateTime;
	}
	/**
	 * 
	 * @param format 要转化的格式 例如："yyyy-MM-dd HH:mm:ss"
	 * @param date 要转化的日期
	 * @return 返回转化后的Date类型的日期
	 * @author wang.xr
	 */
	public static Date getFormatDate(String format,Date date){
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		String str=sdf.format(date);
		Date dateTime = new Date();
		try {
			dateTime = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateTime;
	}
}
