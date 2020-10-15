package com.adamjwh.gof.facade;

/**
 * 外观模式
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
	}
	
}
