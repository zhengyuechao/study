package com.adamjwh.gof.proxy;

/**
 * 代理模式
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.request();
	}
	
}
