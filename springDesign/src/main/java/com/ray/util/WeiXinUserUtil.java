package com.ray.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class WeiXinUserUtil {
	private static Logger log = LoggerFactory.getLogger(WeiXinUserUtil.class);  
	//微信的请求url
	//根据code获取成员信息
	public final static String getuserinfo = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";  
	
	/**
	 * 获取企业微信用户信息  
	 * @param access_token  调用接口凭证
	 * @param code 通过成员授权获取到的code，每次成员授权带上的code将不一样，code只能使用一次，10分钟未被使用自动过期
	 * @return
	 */
	public static String getUserInfo(String access_token, String code) {  
		String userId = null;  

		String requestUrl = getuserinfo.replace("ACCESS_TOKEN", access_token).replace("CODE", code);  
		JSONObject jsonObject = WeiXinUtil.httpRequest(requestUrl, "GET", null);  
		// 如果请求成功  
		if (null != jsonObject) {  
			try {  
				userId = jsonObject.getString("UserId");   
			} catch (JSONException e) {   
				// 获取token失败  
				log.error("获取token失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));  
			}  
		}  
		return userId;  
	}  
}
