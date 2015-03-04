package com.zhadui.android.biz;

import net.sf.json.JSONObject;

import com.zhadui.common.entity.UserInfo;

public interface UserInfoBiz_A {

	/**
	 * 根据手机号码和密码登录
	 * @param phoneNum 电话号码
	 * @param password 密码
	 * @return 用户
	 * @author wang.xr
	 */
	public UserInfo loginByPhoneAndPwd(String phoneNum,String password);
	/**
	 * 
	 * @param acount 帐户名
	 * @param password 密码
	 * @return 用户
	 * @author wang.xr
	 */
	public UserInfo loginByAcountAndPwd(String acount,String password);
	/**
	 * 根据用户主键获取用户信息，并封装成json格式返回
	 * @param userId用户主键
	 * @return json格式的用户信息
	 * @author wang.xr
	 */
	public JSONObject getUserInfoById(int userId);
	/**
	 * 根据用户主键和朋友关系json字符串更新服务器朋友数据
	 * @param userId 用户主键
	 * @param friendsStr 朋友关系字符串
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject updateFriendsByUserIdAndJson(int userId,String friendsStr);
	/**
	 * 用户注册
	 * @param phoneNum电话号码
	 * @param password 密码
	 * @return JSONObject
	 * @author wang.xr
	 */
	public JSONObject registerUser(String phoneNum,String password);
}
