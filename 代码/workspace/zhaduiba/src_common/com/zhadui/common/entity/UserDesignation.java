package com.zhadui.common.entity;

public class UserDesignation {

	private int userDesignationId;
	private String userDesignationContent;
	private int userDesignationExt1;
	private String userDesignationExt2;
	public UserDesignation(int userDesignationId,
			String userDesignationContent, int userDesignationExt1,
			String userDesignationExt2) {
		super();
		this.userDesignationId = userDesignationId;
		this.userDesignationContent = userDesignationContent;
		this.userDesignationExt1 = userDesignationExt1;
		this.userDesignationExt2 = userDesignationExt2;
	}
	public UserDesignation() {
		super();
	}
	public int getUserDesignationId() {
		return userDesignationId;
	}
	public void setUserDesignationId(int userDesignationId) {
		this.userDesignationId = userDesignationId;
	}
	public String getUserDesignationContent() {
		return userDesignationContent;
	}
	public void setUserDesignationContent(String userDesignationContent) {
		this.userDesignationContent = userDesignationContent;
	}
	public int getUserDesignationExt1() {
		return userDesignationExt1;
	}
	public void setUserDesignationExt1(int userDesignationExt1) {
		this.userDesignationExt1 = userDesignationExt1;
	}
	public String getUserDesignationExt2() {
		return userDesignationExt2;
	}
	public void setUserDesignationExt2(String userDesignationExt2) {
		this.userDesignationExt2 = userDesignationExt2;
	}
	@Override
	public String toString() {
		return "UserDesignation [userDesignationId=" + userDesignationId
				+ ", userDesignationContent=" + userDesignationContent
				+ ", userDesignationExt1=" + userDesignationExt1
				+ ", userDesignationExt2=" + userDesignationExt2 + "]";
	}
	
}
