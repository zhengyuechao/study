package com.study.mail;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public void helloWorld() {
		System.out.println("Hello World");
		//return "Hello World";
	}
}
