package com.adamjwh.gof.abstract_factory;

/**
 * 产品等级1的实现类
 * @author adamjwh
 *
 */
public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
