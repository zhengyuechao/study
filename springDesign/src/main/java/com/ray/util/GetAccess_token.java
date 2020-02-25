package com.ray.util;



import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.ray.util.Access_token;

/**
* 获取access_token
* @author xhb
* @date  2018年10月15日17:24:41
*/
public class GetAccess_token {
	//access_token
	public static String getAccess_token(){
		String rat = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid="+WeiXinParamesUtil.corpId+"&corpsecret="+WeiXinParamesUtil.agentSecret;
		String s = HttpRequestUtil.httpRequest(rat);
		s = "["+s+"]";
		//把读出来的json文件换换为实体
		List<Access_token> at = new ArrayList<Access_token>();
		at = JSONObject.parseArray(s, Access_token.class);
		return at.get(0).getAccess_token();
	}
	
	
	
}
