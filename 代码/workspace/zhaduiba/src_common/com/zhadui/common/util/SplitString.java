package com.zhadui.common.util;

import java.util.ArrayList;
import java.util.List;

public class SplitString {

	public static List<String> getSplitStringAyyay(String sourceStr,String regex){
		List<String> list=new ArrayList<String>();
		String[] strArr=sourceStr.split(regex);
		if(strArr.length>0){
			for(int i=0;i<strArr.length;i++){
				list.add(strArr[i]);
			}
		}else{
			list=null;
		}
		return list;
	}
}
