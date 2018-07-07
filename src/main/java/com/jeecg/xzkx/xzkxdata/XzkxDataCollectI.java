package com.jeecg.xzkx.xzkxdata;

import java.util.Map;

/**
 * CMS收集数据接口
 * @author jg_huangxg
 *
 */
public interface XzkxDataCollectI {

	/**
	 * 通过CMS数据收集器方法，返回用户需要的数据
	 */
	public void collect(Map<String, String> params);
}
