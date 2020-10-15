/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.templatemethod
 * @Description: 
 * @author adamjwh
 * @date 2018年5月29日
 * @version V1.0
 */
package com.adamjwh.gof.templatemethod;

/**
 * @ClassName: Client
 * @Description: 模板方法模式
 * @author adamjwh
 * @date 2018年5月29日
 *
 */
public class Client {

	public static void main(String[] args) {
		AbstractClass abstractClass;
		
		abstractClass = new ConcreteClassA();
		abstractClass.TemplateMethod();
		
		abstractClass = new ConcreteClassB();
		abstractClass.TemplateMethod();
	}
	
}
