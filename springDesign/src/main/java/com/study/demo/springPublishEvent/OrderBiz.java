package com.study.demo.springPublishEvent;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.study.entity.OrderInfo;

/**
 * 
* @ClassName: OrderBiz 
* @Description: 监听订单处理
* @Author z
* @DateTime 2020年2月25日 下午2:01:23
 */
@Service
public class OrderBiz {

	@EventListener
	@Async
	public void handleEnvet(OrderInfo obj) {
		System.out.println("Async:"+"[价位]"+obj.getPrice()+"[商品名称]"+obj.getOrder_name());
	}
}
