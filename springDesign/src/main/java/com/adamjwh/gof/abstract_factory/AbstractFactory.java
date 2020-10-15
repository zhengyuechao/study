package com.adamjwh.gof.abstract_factory;

/**
 * 抽象工厂类
 * @author adamjwh
 *
 */
public abstract class AbstractFactory {

	//创建A产品家族
	public abstract AbstractProductA createProductA();
	//创建B产品家族
	public abstract AbstractProductB createProductB();
	
}
