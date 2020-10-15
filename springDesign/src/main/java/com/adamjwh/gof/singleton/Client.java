package com.adamjwh.gof.singleton;

/**
 * 单例模式
 * @author adamjwh
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		//枚举
//		Singleton5 instance1 = Singleton5.instance;
//		Singleton5 instance2 = Singleton5.instance;
		
		if(instance1 == instance2) {
			System.out.println("两个对象是相同的实例");
		}
	}
	
}
