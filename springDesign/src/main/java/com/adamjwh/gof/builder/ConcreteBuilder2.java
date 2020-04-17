package com.adamjwh.gof.builder;

public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();
	
	//设置产品零件
	@Override
	public void BuildPartA() {
		product.add("部件X");
	}

	@Override
	public void BuildPartB() {
		product.add("部件Y");
	}

	//组建一个产品
	@Override
	public Product getResult() {
		return product;
	}

}
