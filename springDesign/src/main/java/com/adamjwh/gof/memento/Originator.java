/**
 * @Title: Originator.java
 * @Package com.adamjwh.gof.memento
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.memento;

/**
 * @ClassName: Originator
 * @Description: 发起人角色
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMento() {
		return (new Memento(state));
	}
	
	public void setMemento(Memento memento) {
		state = memento.getState();
	}
	
	public void show() {
		System.out.println("state = " + state);
	}
	
}
