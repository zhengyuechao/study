/**
 * @Title: ConcreteSubject.java
 * @Package com.adamjwh.gof.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gof.observer;

/**
 * @ClassName: ConcreteSubject
 * @Description: 具体被观察者
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class ConcreteSubject extends Subject {

	//具体业务
	public void doSomething() {
		//...
		super.notifyObserver();
	}
	
}
