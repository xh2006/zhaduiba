package com.zhadui.front.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SearchHandler extends ActionSupport {
	private String content;

	List<String> sentences = new ArrayList<String>();
	List<String> s_words = new ArrayList<String>(); 
	
	List<String> splitToSentences(String content){
		List<String> sentences = new ArrayList<String>();
		
		// 返回句子列表
		return sentences;
	}
	
	// get and set
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
