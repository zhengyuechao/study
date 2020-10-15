package com.adamjwh.gof.singleton;

/**
 * 懒汉式无锁（低并发下不会出现问题，高并发需加锁）
 * @author adamjwh
 *
 */
public class Singleton {

	private static Singleton instance;
	
	//限制产生多个对象
	private Singleton() {
	}
	
	//通过方法获取实例对象
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
