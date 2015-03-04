package com.zhadui.android.dao;

import java.util.List;
import java.util.Map;

import com.zhadui.common.entity.DuierChatInfo;

public interface DuierChatInfoDao_A {

	@SuppressWarnings("rawtypes")
	public List<DuierChatInfo> getDuierMessageListByDuierId(Map map);
	public int addDuierChatInfo(DuierChatInfo duierChatInfo);
}
