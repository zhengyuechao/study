package com.ray.util;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringUtils; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ray.pojo.AccessToken; 
/**
 * 定时器任务
 * @author 
 *
 */
@Component
public class TaskTimer { 
	
	public static void main(String[] args) {
		boolean result = RedisUtil.exists("QY_ACCESS_TOKEN");
		String set_time = "";//设置时间
		if(result) {
			 System.out.println(result);
		}else {
			System.out.println("fffff:"+result);
		}
	}
	/**
	 * 定时器获取微信Token任务
	 */
	//定时器每一小时 0 0 */1 * * ?
	@Scheduled(cron = "0 0 */1  * * ?")
	public void getTimeToken() {
		System.out.println("come in");
		boolean result = RedisUtil.exists("QY_ACCESS_TOKEN");
		String set_time = "";//设置时间
		if(result) {
			Long lTime = RedisUtil.ttl("QY_ACCESS_TOKEN");
			//获取accesstoken的更新时间判断是否为一小时内已经更新
			long oldTokenTimeNum = lTime;
			long newTokenTime=7000;
			System.out.println("存在");
			System.out.println("oldTokenTimeNum："+oldTokenTimeNum+"newTokenTime:"+newTokenTime);
			System.out.println(newTokenTime-oldTokenTimeNum);
			if((newTokenTime-oldTokenTimeNum)>=3000){
				System.out.println("");
				//获取token
				AccessToken at =  WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.agentSecret); 
				RedisUtil.set("QY_ACCESS_TOKEN", at.getToken(), at.getExpiresIn());
			}
			
		}else {
			System.out.println("不存在"); 
			AccessToken at =  WeiXinUtil.getAccessToken(WeiXinParamesUtil.corpId, WeiXinParamesUtil.agentSecret); 
			RedisUtil.set("QY_ACCESS_TOKEN", at.getToken(), at.getExpiresIn());
		}
	}
}
