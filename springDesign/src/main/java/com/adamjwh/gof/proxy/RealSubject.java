package com.adamjwh.gof.proxy;

/**
 * 真实主题类
 * @author adamjwh
 *
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实的请求RealSubject");
	}

}
