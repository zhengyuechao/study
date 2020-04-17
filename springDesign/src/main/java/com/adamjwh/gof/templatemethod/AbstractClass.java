/**
 * @Title: AbstractClass.java
 * @Package com.adamjwh.gof.templatemethod
 * @Description: 
 * @author adamjwh
 * @date 2018年5月29日
 * @version V1.0
 */
package com.adamjwh.gof.templatemethod;

/**
 * @ClassName: AbstractClass
 * @Description: 抽象模板
 * @author adamjwh
 * @date 2018年5月29日
 *
 */
public abstract class AbstractClass {

	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();
	
	public void TemplateMethod() {
		PrimitiveOperation1();
		PrimitiveOperation2();
	}
	
}
