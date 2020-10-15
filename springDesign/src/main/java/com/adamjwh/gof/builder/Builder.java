package com.adamjwh.gof.builder;

/**
 * 抽象建造者类
 * @author adamjwh
 *
 */
public abstract class Builder {
	
	public abstract void BuildPartA();		//产品的A部件
	public abstract void BuildPartB();		//产品的B部件
	public abstract Product getResult();	//获取产品建造后结果

}
