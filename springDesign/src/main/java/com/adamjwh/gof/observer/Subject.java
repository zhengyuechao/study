/**
 * @Title: Subject.java
 * @Package com.adamjwh.gof.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gof.observer;

import java.util.Vector;

/**
 * @ClassName: Subject
 * @Description: 被观察者
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class Subject {

	//观察者数组
	private Vector<Observer> oVector = new Vector<>();
	
	//增加一个观察者
	public void addObserver(Observer observer) {
		this.oVector.add(observer);
	}
	
	//删除一个观察者
	public void deleteObserver(Observer observer) {
		this.oVector.remove(observer);
	}
	
	//通知所有观察者
	public void notifyObserver() {
		for(Observer observer : this.oVector) {
			observer.update();
		}
	}
	
}
