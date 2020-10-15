package com.adamjwh.gof.decorator;

import java.lang.reflect.Method;

/**
 * 具体装饰类
 * @author adamjwh
 *
 */
public class ConcreteDecoratorA extends Decorator {

	//定义被修饰者
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	//定义自己的修饰方法
	private void method1() {
		System.out.println("method1 修饰");
	}
	
	@Override
	public void operation() {
		this.method1();
		super.operation();
	}

}
