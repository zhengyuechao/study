package com.adamjwh.gof.singleton;

/**
 * 饿汉式单例（高并发安全）
 * @author adamjwh
 *
 */
public class Singleton3 {
	
	private static final Singleton3 instance = new Singleton3();
	
	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		return instance;
	}
	
	//类中其他方法，尽量使static
	public static void dosomething() {
	}
	
}
