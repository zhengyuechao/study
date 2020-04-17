/**
 * @Title: RoleStateCaretaker.java
 * @Package com.adamjwh.gofex.memento
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gofex.memento;

/**
 * @ClassName: RoleStateCaretaker
 * @Description: 角色状态管理者
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class RoleStateCaretaker {
	
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

}
