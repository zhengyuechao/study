/**
 * @Title: ObjectStructure.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ObjectStructure
 * @Description: 对象结构
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class ObjectStructure {
	
	private List<Person> elements = new LinkedList<>();
	
	//增加
	public void attach(Person person) {
		elements.add(person);
	}
	
	//移除
	public void detach(Person person) {
		elements.remove(person);
	}
	
	//查看显示
	public void display(Action action) {
		for (Person person : elements) {
			person.accept(action);
		}
	}

}
