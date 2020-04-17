package com.adamjwh.gof.singleton;

/**
 * 静态内部类
 * @author adamjwh
 *
 */
public class Singleton4 {

	//静态内部类
	private static class SingletonHolder {
		public static Singleton4 instance = new Singleton4();
	}
	
	private Singleton4() {
	}
	
	public static Singleton4 getInstance() {
		return SingletonHolder.instance;
	}
	
}
