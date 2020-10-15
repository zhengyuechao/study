package com.adamjwh.gof.builder;

/**
 * 建造者模式
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();
		
		//指挥者用ConcreteBuilder1的方法来建造产品
		director.Construct(builder1);
		Product product1 = builder1.getResult();
		product1.show();
		
		//指挥者用ConcreteBuilder2的方法来建造产品
		director.Construct(builder2);
		Product product2 = builder2.getResult();
		product2.show();
		
	}
	
}
