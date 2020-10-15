/**
 * @Title: Visitor.java
 * @Package com.adamjwh.gof.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gof.visitor;

/**
 * @ClassName: Visitor
 * @Description: 抽象访问者
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public abstract class Visitor {
	
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}
