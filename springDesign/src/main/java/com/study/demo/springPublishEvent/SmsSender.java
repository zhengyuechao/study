package com.study.demo.springPublishEvent;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * 
* @ClassName: SmsSender 
* @Description: 监听消息发送
* @Author z
* @DateTime 2020年2月25日 下午2:03:07
 */
@Service
public class SmsSender {

	@EventListener
	@Async
	public void handleEnvet(String str) {
		System.out.println("Async:"+str);
	}
}
