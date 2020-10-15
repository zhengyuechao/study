/**
 * @Title: ConcreteAggregate.java
 * @Package com.adamjwh.gof.iterator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.iterator;

import java.util.Vector;

/**
 * @ClassName: ConcreteAggregate
 * @Description: 具体容器
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class ConcreteAggregate implements Aggregate {
	
	private Vector vector = new Vector();

	@Override
	public void add(Object object) {
		this.vector.add(object);
	}

	public void remove(Object object) {
		this.remove(object);
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}
	

}
