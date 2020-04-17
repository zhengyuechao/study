package com.adamjwh.gof.factory_method;

/**
 * 工厂方法模式
 * @author adamjwh
 *
 */
public class Client {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		creator.createProduct(ConcreteProduct1.class);
		//...
	}
}
