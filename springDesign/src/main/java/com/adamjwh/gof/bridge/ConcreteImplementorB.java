package com.adamjwh.gof.bridge;

/**
 * 具体实现化角色
 * @author adamjwh
 *
 */
public class ConcreteImplementorB extends Implementor {

	@Override
	public void doSomething() {
		System.out.println("具体实现B的doSomething执行");
	}
	
	@Override
	public void doAnything() {
		System.out.println("具体实现B的doAnything执行");
	}
	
}
