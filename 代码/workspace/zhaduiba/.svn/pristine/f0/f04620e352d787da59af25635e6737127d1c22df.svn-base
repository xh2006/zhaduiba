package com.wxr.test;

import java.util.Date;
import java.util.Random;

import com.zhadui.common.util.LevelUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Encrypt en=new Encrypt();
		String key="06";
		en.setKey(key);
		en.setEncString("root");
		String mi=en.getStrMi();
		System.out.println("----------加密后："+mi);
		en.setDesString(mi);
		String dmi=en.getStrM();
		System.out.println("----------解密后："+dmi);
		*/
		//int n=LevelUtil.getLevelByExperiencePoints(31 );
		/*int n=new Random().nextInt(10000);
		System.out.println("====:"+n);*/
		//int n=("|ss|dd".split("|")).length;
		/*String[] str="@ss@dd".split("@");
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}*/
		
		System.out.println(random(4));
	}
	public static String random(int n) {
        if (n < 1 || n > 10) {
            throw new IllegalArgumentException("cannot random " + n + " bit number");
        }
        Random ran = new Random();
        if (n == 1) {
            return String.valueOf(ran.nextInt(10));
        }
        int bitField = 0;
        char[] chs = new char[n];
        for (int i = 0; i < n; i++) {
            while(true) {
                int k = ran.nextInt(10);
                if( (bitField & (1 << k)) == 0) {
                    bitField |= 1 << k;
                    chs[i] = (char)(k + '0');
                    break;
                }
            }
        }
        return new String(chs);
    }

}
