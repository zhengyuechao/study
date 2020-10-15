/**
 * @Title: ConcreteClassB.java
 * @Package com.adamjwh.gof.templatemethod
 * @Description: 
 * @author adamjwh
 * @date 2018年5月29日
 * @version V1.0
 */
package com.adamjwh.gof.templatemethod;

/**
 * @ClassName: ConcreteClassB
 * @Description: 实现父类的方法
 * @author adamjwh
 * @date 2018年5月29日
 *
 */
public class ConcreteClassB extends AbstractClass {

	@Override
	public void PrimitiveOperation1() {
		System.out.println("具体方法B方法1实现");
	}

	@Override
	public void PrimitiveOperation2() {
		System.out.println("具体方法B方法2实现");
	}
	
}
