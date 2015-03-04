package com.zhadui.common.entity;

/**
 * 描述：放在session中，用以记录用户登录状态。
 * @author xh
 *
 */
public class LoginStatus {
	private int userId;		// 用户表主键

	
	
	// get and set 方法
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
		
}
