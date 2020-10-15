/**
 * @Title: Observer.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

/**
 * @ClassName: Observer
 * @Description: 观察者（前台秘书）
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public abstract class Observer {

	protected String name;
	protected Subject subject;
	
	public Observer(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}
	
	public abstract void update();
	
}
