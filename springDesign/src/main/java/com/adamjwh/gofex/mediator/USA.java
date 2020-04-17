/**
 * @Title: USA.java
 * @Package com.adamjwh.gofex.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.mediator;

/**
 * @ClassName: USA
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class USA extends Country {

	public USA(UnitedNations unitedNations) {
		super(unitedNations);
	}
	
	public void declare(String message) {
		unitedNations.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("美国获得对方信息：" + message);
	}

}
