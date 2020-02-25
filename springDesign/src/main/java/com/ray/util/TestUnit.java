package com.ray.util;

import com.ray.pojo.AccessToken;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class TestUnit {

	
	public static void main(String[] args) {
		AccessToken at = WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.agentSecret);
		System.out.println(at.getToken());
		System.out.println(at.getExpiresIn());
		
		String suite_access_token = WeiXinUtil.getJsapiTicket(at.getToken());
		
		System.err.println(suite_access_token);
		
		/**
		 * cZ9RKfYYZoI_ZvlIgzgdkbGHWosDsJ-2ELEME2sXVfDjENwZfgQ_SvPpC6ABl8LQhg1l-YvTODBvgY5GdGEe6ADi9h_6s1l9C_CQn2hCnADJYl9q1nlEcvDx6vKA0MSJXtGX1BfQSYj1-AEwjUbfsJMv8fNhsfJZ5_TmqcLarkZtN6bzTADbxPRYRt0sz4DILVo7lIw5GStl03935H2nnw
7200
sM4AOVdWfPE4DxkXGEs8VJ5alZLHXI9R84RFHreQt7YhtRWUxsP9DxIagRVq2USd5J6DJXnhEnulQWuiQD3mZw
		 */
		/*String suite_access_token = "sM4AOVdWfPE4DxkXGEs8VJ5alZLHXI9R84RFHreQt7YhtRWUxsP9DxIagRVq2USd5J6DJXnhEnulQWuiQD3mZw";
		TestUnit.get_pre_auth_code("",suite_access_token);*/
		System.out.println("==================");
		  TestUnit.get_user_info("", at.getToken());
		  System.out.println("==================");
	}
	
	
	/** 
	 * 3.获取access_token 
	 *  
	 * @param appid 凭证 
	 * @param appsecret 密钥 
	 * @return 
	 */  
	public static AccessToken get_pre_auth_code(String appid, String appsecret) { 
		
		String get_suite_token = "https://qyapi.weixin.qq.com/cgi-bin/service/get_pre_auth_code?suite_access_token=SUITE_ACCESS_TOKEN";
		//String get_suite_token = "https://qyapi.weixin.qq.com/cgi-bin/service/get_suite_token";
		AccessToken accessToken = null;  
		
		String requestUrl = get_suite_token.replace("{suite_access_token}", appsecret);  
		JSONObject jsonObject = WeiXinUtil.httpRequest(requestUrl, "GET", null);  
		// 如果请求成功  
		if (null != jsonObject) {  
			try {  
				System.out.println(jsonObject);
				/*accessToken = new AccessToken();  
				accessToken.setToken(jsonObject.getString("access_token"));  
				accessToken.setExpiresIn(jsonObject.getInt("expires_in"));  */
			} catch (JSONException e) {  
				accessToken = null;  
				// 获取token失败  
				//log.error("获取token失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));  
			}  
		}  
		return accessToken;  
	}  
	/**
	 * .获取getuserinfo 
	 *   
	 * @param access_token
	 * @param code
	 * @return
	 */
	public static String get_user_info(String access_token, String code) { 
		
		String get_suite_token = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";
		//String get_suite_token = "https://qyapi.weixin.qq.com/cgi-bin/service/get_suite_token";
		String userId = null;  

		String requestUrl = get_suite_token.replace("ACCESS_TOKEN", access_token).replace("CODE", code);  
		JSONObject jsonObject = WeiXinUtil.httpRequest(requestUrl, "GET", null);  
		// 如果请求成功  
		if (null != jsonObject) {  
			try {  
				System.out.println(jsonObject);
				userId = jsonObject.getString("UserId");  
				/*accessToken = new AccessToken();  
				accessToken.setExpiresIn(jsonObject.getInt("expires_in"));  */
			} catch (JSONException e) {  
				userId = null;  
				e.printStackTrace();
				// 获取token失败  
				//log.error("获取token失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));  
			}  
		}  
		return userId;  
	}  
}
