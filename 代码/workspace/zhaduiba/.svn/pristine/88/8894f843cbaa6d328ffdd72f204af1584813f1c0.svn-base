package com.zhadui.common.util;

public class LevelUtil {

	public static int getLevelByExperiencePoints(int experiencePoints){
		//y=x3+23
		int newPoints=experiencePoints-23;
		double doubleResult=Math.pow(newPoints, 1.0/3);
		int result=(int)Math.floor(doubleResult);
		return result+1;
	}
}
