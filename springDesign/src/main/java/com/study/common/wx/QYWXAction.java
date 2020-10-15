package com.study.common.wx;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
//import com.ray.pojo.AccessToken;
//import com.ray.util.HttpRequestUtil;
//import com.ray.util.RedisUtil;
//import com.ray.util.WeiXinUserUtil;
//import com.ray.util.WeiXinUtil;
//import com.ray.util.XmlUtil;

@Controller
public class QYWXAction {
	private static Logger log = LoggerFactory.getLogger(QYWXAction.class);  
	/*//接收消息服务器配置 token 
	private String token = "9z7KN5cf80U";
	//EncodingAESKey
	private String EncodingAESKey = "VYDkLlmYgL6H5XfBpPSrtmncPnNRkO4tXsrvwWU2Tie";*/
	/**
	 * API接收消息--误删
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/requestMsg")
    public String requestMsg(Model model, HttpServletRequest request) throws Exception{
		
		String retMsg = "";
		
		/*String msg_signature = request.getParameter("msg_signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		System.out.println("msg_signature:"+msg_signature);
		System.out.println("timestamp:"+timestamp);
		System.out.println("nonce:"+nonce);
		System.out.println("echostr:"+echostr);
		String checkMsg = SHA1.getSHA1(token, timestamp, nonce, echostr);
		if(msg_signature.equals(checkMsg)) {
			WXBizMsgCrypt wxCrypt = new WXBizMsgCrypt(token, EncodingAESKey, WeiXinParamesUtil.corpId);
			retMsg = wxCrypt.VerifyURL(msg_signature,timestamp,nonce,echostr);
			System.out.println(retMsg);
		}*/
		return retMsg;
	}
	
	
	/**
	 * 获取企业微信成员信息
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/auth")
    public String auth(Model model, HttpServletRequest request, String point) throws Exception{
		 
		//redis
//		String redis_access_token = RedisUtil.get("QY_ACCESS_TOKEN");
//		log.debug("【QY_ACCESS_TOKEN INIT】="+redis_access_token);
//		AccessToken at = null;
//		if(StringUtils.isEmpty(redis_access_token)) {
//			//获取token
//			at = WeiXinUtil.getAccessToken(XmlUtil.getValue("corpId"), XmlUtil.getValue("agentSecret"));
//			redis_access_token = at.getToken();
//			log.debug("【QY_ACCESS_TOKEN】="+at.getToken());
//			RedisUtil.set("QY_ACCESS_TOKEN", at.getToken(), 100);
//		}
//		
//		System.out.println(request.getParameter("code"));
//		
//		String code  = request.getParameter("code");
//		String wx_user_id = "";
//		//网页测试用
// 		if (StringUtils.isEmpty(code) && "point".equals(point)) {
//			model.addAttribute("qywx_auth_flag", "false");
//			model.addAttribute("login_user_id", "ceshiweixin");
//			model.addAttribute("login_password", "123456");
//			return "platform/mainapp/main";
//		}
//		wx_user_id = WeiXinUserUtil.getUserInfo(redis_access_token, code);
//		
//		String qfsGetUserUrl = XmlUtil.getValue("REMOTE_SERVER_URL")+"login/getUserBywx.ajax";
//		System.out.println("user_id:"+wx_user_id);
//		//*******************************************
//		//1.获取的user_id调用服务接口匹配查询是否存在
//		//if(user_id)
//		String param = "?wx_user_id="+wx_user_id;
//		JSONObject jsons = HttpRequestUtil.doGet(qfsGetUserUrl,param);
//		String responseStatusType = jsons.getString("responseStatus");
//		if("0".equals(responseStatusType)) {
//			model.addAttribute("qywx_auth_flag", "false");
//			model.addAttribute("wx_user_id", wx_user_id);
//			return "platform/mainapp/main";
//		}
		//*******************************************
		//else qywx_auth_flag
		//如果不存在则跳转登录页【登录页实际功能是关联绑定企业用户的user_id,这里需要服务提供接口,前端提供user_id】
		//如果存在则调用登录服务进行访问。
//		String jsonStr = jsons.getString("data");
//		JSONObject jsonObj = JSONObject.parseObject(jsonStr);
//		String user_asoid = jsonObj.getString("user_asoid");
//		String login_pwd = jsonObj.getString("login_pwd");
//		model.addAttribute("qywx_auth_flag", "true");
//		model.addAttribute("wx_user_id", wx_user_id);
//		model.addAttribute("login_user_id", user_asoid);
//		model.addAttribute("login_password", login_pwd);
		return "platform/mainapp/main";
	}
}
