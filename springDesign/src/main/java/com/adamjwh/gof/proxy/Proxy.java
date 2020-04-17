package com.adamjwh.gof.proxy;

/**
 * 代理类
 * @author adamjwh
 *
 */
public class Proxy extends Subject {

	private RealSubject realSubject = null;
	
	public Proxy() {
		this.realSubject = new RealSubject();
	}
	
	@Override
	public void request() {
		this.before();
		this.realSubject.request();
		this.after();
	}

	//预处理
	private void before() {
		System.out.println("-------before------");
	}
	
	//善后处理
	private void after() {
		System.out.println("-------after-------");
	}
}
