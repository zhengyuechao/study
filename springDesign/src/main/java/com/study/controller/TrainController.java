package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.common.util.ConfigUtil;

@RestController
public class TrainController {

	//@Autowired
	//PersonService p = new PersonService();
	
	@GetMapping("/test")
	public String myperson() {
		String str = "";//p.sayHello();
		str += ConfigUtil.getConfig("my");
		return str;
	}
}