package com.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.demo.springPublishEvent.MyService;
import com.study.entity.OrderInfo;
import com.study.service.buy.OrderService;

@SpringBootTest
class SpringDesignApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */
	
	@Autowired
	MyService myservice;

	@Autowired
	OrderService orderService;
	
	
	@Test
	public void contextLoads() {
		myservice.read("hello world");
		OrderInfo o =new  OrderInfo("20191231","phone","1000$");
		orderService.prepareOrder(o, "promotion3");
		//personService.sayHello();
	}
	

}
