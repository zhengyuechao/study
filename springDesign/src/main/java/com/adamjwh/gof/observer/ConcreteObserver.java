/**
 * @Title: ConcreteObserver.java
 * @Package com.adamjwh.gof.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gof.observer;

/**
 * @ClassName: ConcreteObserver
 * @Description: 具体观察者
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("收到消息，进行处理");
	}

}
