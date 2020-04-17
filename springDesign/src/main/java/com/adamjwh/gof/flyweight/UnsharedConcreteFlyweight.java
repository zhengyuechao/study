package com.adamjwh.gof.flyweight;

/**
 * 不需要共享的Flyweight子类
 * @author adamjwh
 *
 */
public class UnsharedConcreteFlyweight extends Flyweight {

	public UnsharedConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate(int extrinsic) {
		System.out.println("不共享的具体Flyweight:" + extrinsic);
	}

}
