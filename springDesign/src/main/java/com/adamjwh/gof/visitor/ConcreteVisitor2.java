/**
 * @Title: ConcreteVisitor2.java
 * @Package com.adamjwh.gof.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gof.visitor;

/**
 * @ClassName: ConcreteVisitor2
 * @Description: 具体访问者2
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + " 被 " + this.getClass().getName() + " 访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + " 被 " + this.getClass().getName() + " 访问");
	}
	
	

}
