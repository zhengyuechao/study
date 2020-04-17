package com.adamjwh.gof.prototype;

/**
 * 原型模型
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcretePrototype p1 = new ConcretePrototype("Hello");
		ConcretePrototype c1 = (ConcretePrototype) p1.clone();
		System.out.println(c1.getId());
	}
	
}
