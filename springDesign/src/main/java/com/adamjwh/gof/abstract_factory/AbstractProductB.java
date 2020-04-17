package com.adamjwh.gof.abstract_factory;

/**
 * 抽象产品类
 * @author adamjwh
 *
 */
public abstract class AbstractProductB {

	//每个产品共有的方法
	public void shareMethod() {}
	//每个产品相同方法，不同实现
	public abstract void doSomething();
	
}
