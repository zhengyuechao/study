package com.adamjwh.gof.abstract_factory;

/**
 * 抽象工厂方法
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		//定义两个工厂
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		//产生A1对象
		AbstractProductA a1 = new ProductA1();
		//产生A2对象
		AbstractProductA a2 = new ProductA2();
		//产生B1对象
		AbstractProductB b1 = new ProductB1();
		//产生B2对象
		AbstractProductB b2 = new ProductB2();
		
		//....
		int r = 3>>2 ;
		System.out.println(r);
	}
	
}
