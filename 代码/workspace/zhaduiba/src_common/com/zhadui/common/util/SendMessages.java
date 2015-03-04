package com.zhadui.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SendMessages {

	public static boolean send(String messageContent, String phoneNum) {
		boolean flag = false;
		try {
			String content = URLEncoder.encode(messageContent, "utf-8");
			URL url = new URL(
					"http://utf8.sms.webchinese.cn/?Uid=zhangQiChjao&Key=ff44ba94dd3797c59325&smsMob="
							+ phoneNum + "&smsText=" + content);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.connect();
			InputStream inputStream = connection.getInputStream();
			Reader reader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String str = null;
			StringBuffer sb = new StringBuffer();
			while ((str = bufferedReader.readLine()) != null) {
				sb.append(str);
			}
			reader.close();
			connection.disconnect();
			if (sb.toString().equals("1")) {
				flag = true;
			}
		} catch (Exception e) {
			return flag;
		}
		return flag;
	}
}
