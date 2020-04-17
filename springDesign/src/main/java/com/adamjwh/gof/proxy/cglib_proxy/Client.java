/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.proxy.cglib_proxy
 * @Description: 
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.adamjwh.gof.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @ClassName: Client
 * @Description: 代理模式——Cglib代理
 * @author adamjwh
 * @date 2018年8月9日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();		//工具类
		enhancer.setSuperclass(Hello.class);	//继承被代理类
		enhancer.setCallback(new HelloMethodInterceptor());		//设置回调
		
		Hello hello = (Hello) enhancer.create();	//生成代理类对象
		hello.sayHello();
	}

}
