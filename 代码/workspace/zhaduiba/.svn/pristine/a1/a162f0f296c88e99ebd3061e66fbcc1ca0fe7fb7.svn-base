package com.zhadui.android.action;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.android.biz.DuierStatusBiz_A;

@SuppressWarnings("serial")
public class DuierStatusAction_A extends ActionSupport {

	private DuierStatusBiz_A duierStatusBizA;

	public void setDuierStatusBizA(DuierStatusBiz_A duierStatusBizA) {
		this.duierStatusBizA = duierStatusBizA;
	}

	private BigInteger list_id;
	private int user_id;
	private int type;
	
	public BigInteger getList_id() {
		return list_id;
	}

	public void setList_id(BigInteger list_id) {
		this.list_id = list_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void android_getUserIfStatusAndUpdate() {
		HttpServletResponse response = ServletActionContext.getResponse();
		JSONObject json = new JSONObject();
		switch (type) {
		case 1://判断是否已扎堆
			json = duierStatusBizA.userIfInWithUserIdAndDuierId(user_id,
					list_id);
			break;
		case 2://扎堆
			json = duierStatusBizA.userJoinDuier(user_id, list_id);
			break;
		case 3://退出扎堆
			json = duierStatusBizA.userQuitDuier(user_id, list_id);
			break;
		default:
			json.put("result", "check_fail");
			json.put("content", "没有相关信息");
			break;
		}
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
		}
	}
}
