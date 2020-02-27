package com.study.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.common.util.SignUtil;

/**
 * 微信控制器
 * @author Weijun Hu
 * @since 2016年7月9日 上午10:19:36
 */
@RestController
@RequestMapping("/wxapi")
public class WechatController {
	
	@GetMapping(value="test")
	public String test(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("微信控制器测试");
		String echostr = "bo哥,宇宙无敌，法力无边，就目前来看波哥过气并且out的成熟透顶的程序员";
		return echostr;
	}
	
	/**
	 * 消息处理
	 * @param response
	 * @param request
	 * @throws IOException
	 * @date 2016年7月9日 上午11:20:31
	 */
	/*@GetMapping(value="MP_verify_zboPYo3tUDOUktFD.txt")
	public String configFile(HttpServletResponse response,HttpServletRequest request) throws IOException {
		String str = "zboPYo3tUDOUktFD";
		return str;
	}*/
	/**
	 * 微信公众号: 验证服务器地址的有效性<br>
	 * 微信URL: http://IP:PORT/项目名称/wechatController/wechat.do<br>
	 * 开发者通过检验signature对请求进行校验。若确认此次GET请求来自微信服务器，请原样返回echostr参数内容，则接入生效，成为开发者成功，否则接入失败。<br>
	 * 参考api: http://mp.weixin.qq.com/wiki/17/2d4265491f12608cd170a95559800f2d.html
	 * @param request
	 * @param response
	 * @param signature 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
	 * @param timestamp 时间戳
	 * @param nonce 随机数
	 * @param echostr 随机字符串
	 * @date 2016年7月9日 上午11:10:30
	 */
	@RequestMapping(value="wechat", method = RequestMethod.GET)
	public void wechat(HttpServletRequest request,HttpServletResponse response,String signature,String timestamp,String nonce,String echostr) {
		String token = "senyintwx0134";//配置里面的token
		boolean flag = SignUtil.checkSignature(token, signature, timestamp, nonce);
		if(flag){
			try {
				//验证成功,则原样返回echostr参数内容
				response.getWriter().print(echostr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
 
	/**
	 * 消息处理
	 * @param response
	 * @param request
	 * @throws IOException
	 * @date 2016年7月9日 上午11:20:31
	 */
	@RequestMapping(value = "wechat", method = RequestMethod.POST)
	public void wechatPost(HttpServletResponse response,HttpServletRequest request) throws IOException {
		/*String respMessage = wechatService.do(request);*/ //TODO 处理相关业务
		PrintWriter out = response.getWriter();
		//out.print(respMessage);
		out.close();
	}
}
 