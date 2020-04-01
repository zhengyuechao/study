package com.study;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.boot.test.context.SpringBootTest; 

import com.study.common.util.ReadWeixinConfig;
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
	@Autowired
    private ReadWeixinConfig weiXinPayConfig;
	@Autowired
	private com.study.common.util.ReadProfileProperties profileProperties;

    
	@Test
	public void contextLoads()   {
		/*
		 * myservice.read("hello world"); OrderInfo o =new
		 * OrderInfo("20191231","phone","1000$"); orderService.prepareOrder(o,
		 * "promotion3");
		 */
		//personService.sayHello();
		System.out.println(weiXinPayConfig);
		System.out.println(weiXinPayConfig.getAppid());
		System.out.println(weiXinPayConfig.getMch_id());
		System.out.println(weiXinPayConfig.getSign_key());
		System.out.println(profileProperties);
        System.out.println(profileProperties.getName());
        System.out.println(profileProperties.getEmail());
        
        System.out.println(profileProperties.getHandsome());
	}
	

}
