/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.iterator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.iterator;

/**
 * @ClassName: Client
 * @Description: 迭代器模式
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		aggregate.add("abc");
		aggregate.add("aaa");
		aggregate.add("1234");
		
		//遍历
		Iterator iterator = aggregate.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
