/**
 * @Title: Secretary.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Secretary
 * @Description: 具体通知者（前台）
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class Secretary implements Subject {

	//同事列表
	private List<Observer> observers = new LinkedList<>();
	private String action;

	//添加
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	//删除
	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	//通知
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
	}

	//前台状态
	@Override
	public String getAction() {
		return action;
	}

	@Override
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}
