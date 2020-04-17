package com.adamjwh.gof.builder;

public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();
	
	//设置产品零件
	@Override
	public void BuildPartA() {
		product.add("部件A");
	}

	@Override
	public void BuildPartB() {
		product.add("部件B");
	}

	//组建一个产品
	@Override
	public Product getResult() {
		return product;
	}

}
