/**
 * @Title: Iraq.java
 * @Package com.adamjwh.gofex.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.mediator;

/**
 * @ClassName: Iraq
 * @Description: 伊拉克
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class Iraq extends Country {

	public Iraq(UnitedNations unitedNations) {
		super(unitedNations);
	}
	
	public void declare(String message) {
		unitedNations.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("伊拉克获得对方信息：" + message);
	}

}
