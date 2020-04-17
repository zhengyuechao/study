/**
 * @Title: Caretaker.java
 * @Package com.adamjwh.gof.memento
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.memento;

/**
 * @ClassName: Caretaker
 * @Description: 备忘录管理员角色
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class Caretaker {
	
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
