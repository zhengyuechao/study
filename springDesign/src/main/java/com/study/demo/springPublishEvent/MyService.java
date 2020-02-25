package com.study.demo.springPublishEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.study.entity.OrderInfo;

/**
 * 
* @ClassName: MyService 
* @Description: 我的订单业务处理
* @Author z
* @DateTime 2020年2月25日 下午2:05:07
 */
@Service
public class MyService {
	
	@Autowired
	private ApplicationContext applicationContext;

	public void read(String str) {
		System.out.println("come on");
		this.applicationContext.publishEvent(str);
		OrderInfo order = new OrderInfo("123020","car","6亿");
		this.applicationContext.publishEvent(order);
	}
}
