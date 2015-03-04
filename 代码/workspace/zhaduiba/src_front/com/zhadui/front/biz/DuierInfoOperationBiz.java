package com.zhadui.front.biz;

import java.util.List;
import com.zhadui.common.entity.DuierInfo;

/*import com.zhadui.common.entity.User;*/

public interface DuierInfoOperationBiz {

	public List<DuierInfo> getMoreDuierInfo(int nStart, int nItems);
}
