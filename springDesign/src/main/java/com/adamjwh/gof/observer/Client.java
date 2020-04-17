/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gof.observer;

/**
 * @ClassName: Client
 * @Description: 观察者模式
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//创建一个被观察者
		ConcreteSubject subject = new ConcreteSubject();
		//定义一个观察者
		Observer observer = new ConcreteObserver();
		//观察
		subject.addObserver(observer);
		//观察者开始活动
		subject.doSomething();
	}
	
}
