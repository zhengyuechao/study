package com.adamjwh.gof.factory_method;

/**
 * 抽象工厂类
 * @author adamjwh
 *
 */
public abstract class Creator {

	//创建一个产品对象，参数自行设置
	public abstract <T extends Product> T createProduct(Class<T> c);
	
}
