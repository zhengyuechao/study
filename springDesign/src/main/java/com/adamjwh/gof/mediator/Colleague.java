/**
 * @Title: Colleague.java
 * @Package com.adamjwh.gof.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gof.mediator;

/**
 * @ClassName: Colleague
 * @Description: 抽象同事角色
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public abstract class Colleague {
	
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

}
