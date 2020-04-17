/**
 * @Title: Iterator.java
 * @Package com.adamjwh.gof.iterator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.iterator;

/**
 * @ClassName: Iterator
 * @Description: 抽象迭代器
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public interface Iterator {
	
	public Object next();	//遍历到下一个元素
	
	public boolean hasNext();	//是否已经遍历到尾部
	
	public boolean remove();	//删除当前指向的元素

}
