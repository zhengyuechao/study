/**
 * @Title: Man.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Man
 * @Description: 男人类
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManConclusion(this);
	}

}
