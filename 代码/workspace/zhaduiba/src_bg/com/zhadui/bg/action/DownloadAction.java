package com.zhadui.bg.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {

	private String downloadPath;
	public String getDownloadPath() {
		return downloadPath;
	}

	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}

	public String getFileName() throws UnsupportedEncodingException {
        // 点击下载之后，提示信息上的文件名
        return new String(("zhaduiba.apk").getBytes(), "iso-8859-1");
    }

	public InputStream getInputStream() throws IOException{
		InputStream inputStream=ServletActionContext.getServletContext().getResourceAsStream(downloadPath);
		return inputStream;
	}
	public String execute(){
		return "success";
	}
}
