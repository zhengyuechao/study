/**
 * @Title: Woman.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Woman
 * @Description: 女人类
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class Woman extends Person {

	@Override
	public void accept(Action action) {
		action.getWomanConclusion(this);
	}

}
