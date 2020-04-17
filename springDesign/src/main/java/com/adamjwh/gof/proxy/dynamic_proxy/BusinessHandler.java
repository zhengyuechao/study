/**
 * @Title: BusinessHandler.java
 * @Package com.adamjwh.gof.proxy.dynamic_proxy
 * @Description: 
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.adamjwh.gof.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: BusinessHandler
 * @Description: 动态代理类
 * @author adamjwh
 * @date 2018年8月9日
 *
 */
public class BusinessHandler implements InvocationHandler {
	
	private IBusiness iBusiness;
	
	public BusinessHandler(IBusiness iBusiness) {
		this.iBusiness = iBusiness;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		method.invoke(iBusiness, args);
		System.out.println("after");
		return null;
	}

}
