package com.adamjwh.gofex.decorator;

/**
 * 人类
 * @author adamjwh
 *
 */
public class Person {

	private String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(name + "的装扮：");
	}
}
