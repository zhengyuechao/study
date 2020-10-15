/**
 * @Title: ConcreteElementB.java
 * @Package com.adamjwh.gof.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gof.visitor;

/**
 * @ClassName: ConcreteElementB
 * @Description: 具体元素B
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
	
	//其他方法
	public void operationB() {
		
	}

}
