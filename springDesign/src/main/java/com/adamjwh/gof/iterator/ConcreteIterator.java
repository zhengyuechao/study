/**
 * @Title: ConcreteIterator.java
 * @Package com.adamjwh.gof.iterator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.iterator;

import java.util.Vector;

/**
 * @ClassName: ConcreteIterator
 * @Description: 具体迭代器
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class ConcreteIterator implements Iterator {
	
	private Vector vector = new Vector();
	public int cursor = 0;	//定义当前游标
	
	public ConcreteIterator(Vector vector) {
		this.vector = vector;
	}

	@Override
	public Object next() {
		Object result = null;
		
		if (this.hasNext()) {
			result = this.vector.get(this.cursor ++);
		} else {
			result = null;
		}
		
		return result;
	}

	@Override
	public boolean hasNext() {
		if (this.cursor == this.vector.size()) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean remove() {
		this.vector.remove(this.cursor);
		
		return true;
	}

}
