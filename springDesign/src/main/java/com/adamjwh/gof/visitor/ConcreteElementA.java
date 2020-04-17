/**
 * @Title: ConcreteElementA.java
 * @Package com.adamjwh.gof.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gof.visitor;

/**
 * @ClassName: ConcreteElementA
 * @Description: 具体元素A
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	
	//其它方法
	public void operationA() {
		
	}

}
