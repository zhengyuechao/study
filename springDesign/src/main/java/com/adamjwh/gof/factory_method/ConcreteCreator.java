package com.adamjwh.gof.factory_method;

/**
 * 具体工厂类
 * @author adamjwh
 *
 */
public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T) product;
	}

}
