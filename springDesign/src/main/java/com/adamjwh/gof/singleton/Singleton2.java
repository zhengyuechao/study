package com.adamjwh.gof.singleton;

/**
 * 懒汉式单例（多线程的单例模式）
 * @author adamjwh
 *
 */
public class Singleton2 {

	private volatile static Singleton2 instance;
	private static Object syncRoot = new Object();
	
	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		//双重锁定
		if(instance == null) {
			synchronized (syncRoot) {
				if(instance == null) {
					instance = new Singleton2();
				}
			}
		}
		
		return instance;
	}
	
}
