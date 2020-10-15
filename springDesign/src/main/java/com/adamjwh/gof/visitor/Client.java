/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gof.visitor;

/**
 * @ClassName: Client
 * @Description: 访问者模式
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new ConcreteElementA());
		objectStructure.attach(new ConcreteElementB());
		
		ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
		ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
		
		objectStructure.accept(visitor1);
		objectStructure.accept(visitor2);
	}
	
}
