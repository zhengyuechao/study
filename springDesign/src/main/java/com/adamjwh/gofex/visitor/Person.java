/**
 * @Title: Person.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Person
 * @Description: 人的抽象类
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public abstract class Person {
	
	//接受
	public abstract void accept(Action action);

}
