package com.study.mail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.demo.mail.HelloWorldService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

	@Resource
	HelloWorldService helloWorldService;
	/**
	 * Q:No tests found with test runner JUnit4
	 * A:因为引用测试包错误，正确的引用是org.junit.jupiter.api.Test
	* @Title: SayHelloTest 
	* @Description: 
	* @Author z
	* @DateTime 2020年9月3日 下午2:49:49
	 */
	@org.junit.jupiter.api.Test
	public void SayHelloTest() {
		helloWorldService.helloWorld();
	}
}
