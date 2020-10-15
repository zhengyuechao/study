package com.adamjwh.gof.facade;

/**
 * 外观类
 * @author adamjwh
 *
 */
public class Facade {

	//被委托的对象
	SubSystemA a;
	SubSystemB b;
	SubSystemC c;
	SubSystemD d;
	
	public Facade() {
		a = new SubSystemA();
		b = new SubSystemB();
		c = new SubSystemC();
		d = new SubSystemD();
	}
	
	//提供给外部访问的方法
	public void methodA() {
		this.a.dosomethingA();
	}
	
	public void methodB() {
		this.b.dosomethingB();
	}
	
	public void methodC() {
		this.c.dosomethingC();
	}
	
	public void methodD() {
		this.d.dosomethingD();
	}
	
}
