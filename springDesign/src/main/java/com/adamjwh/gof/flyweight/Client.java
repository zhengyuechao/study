package com.adamjwh.gof.flyweight;

/**
 * 享元模式
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		int extrinsic = 22;
		
		Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
		flyweightX.operate(++ extrinsic);
		
		Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
		flyweightY.operate(++ extrinsic);
		
		Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
		flyweightZ.operate(++ extrinsic);
		
		Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
		flyweightReX.operate(++ extrinsic);
		
		Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("X");
		unsharedFlyweight.operate(++ extrinsic);
	}
	
}
