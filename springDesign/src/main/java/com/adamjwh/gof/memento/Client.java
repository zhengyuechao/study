/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.memento
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gof.memento;

/**
 * @ClassName: Client
 * @Description: 备忘录模式
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("On");	//Originator初始状态
		originator.show();
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMento());
		
		originator.setState("Off");	//Originator状态变为Off
		originator.show();
		
		originator.setMemento(caretaker.getMemento());	//回复初始状态
		originator.show();
	}

}
