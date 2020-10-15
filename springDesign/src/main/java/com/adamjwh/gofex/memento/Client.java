/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.memento
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gofex.memento;

/**
 * @ClassName: Client
 * @Description: 备忘录模式——游戏存档
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//打boss前
		GameRole gameRole = new GameRole();
		gameRole.getInitState();
		gameRole.stateDisplay();
		
		//保存进度
		RoleStateCaretaker caretaker = new RoleStateCaretaker();
		caretaker.setMemento(gameRole.saveState());
		
		//打boss失败
		gameRole.fight();
		gameRole.stateDisplay();
		
		//恢复状态
		gameRole.recoveryState(caretaker.getMemento());
		gameRole.stateDisplay();
	}

}
