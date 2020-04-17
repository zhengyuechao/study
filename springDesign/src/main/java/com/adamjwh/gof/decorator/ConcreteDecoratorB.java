package com.adamjwh.gof.decorator;

/**
 * 具体装饰类
 * @author adamjwh
 *
 */
public class ConcreteDecoratorB extends Decorator {

	//定义被修饰者
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	//定义自己的修饰方法
	private void method2() {
		System.out.println("method2 修饰");
	}
	
	@Override
	public void operation() {
		super.operation();
		this.method2();
	}

}
