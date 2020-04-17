/**
 * @Title: Aggregate.java
 * @Package com.adamjwh.gof.iterator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.iterator;

/**
 * @ClassName: Aggregate
 * @Description: 抽象容器
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public interface Aggregate {
	
	public void add(Object object);
	
	public void remove(Object object);
	
	public Iterator iterator();

}
