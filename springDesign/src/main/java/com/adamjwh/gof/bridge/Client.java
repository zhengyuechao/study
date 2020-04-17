package com.adamjwh.gof.bridge;

/**
 * 桥接模式
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		Implementor imp = new ConcreteImplementorA();
		Abstraction abs = new RefinedAbstraction(imp);
		abs.request();
	}
	
}
