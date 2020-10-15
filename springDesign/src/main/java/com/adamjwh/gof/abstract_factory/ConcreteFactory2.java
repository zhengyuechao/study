package com.adamjwh.gof.abstract_factory;

/**
 * 产品等级2的实现类
 * @author adamjwh
 *
 */
public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}