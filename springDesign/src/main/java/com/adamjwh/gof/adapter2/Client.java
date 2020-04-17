package com.adamjwh.gof.adapter2;

/**
 * 适配器模式（targer为接口）
 * 类适配器
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		//原有业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		
		//增加适配器后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
	
}
