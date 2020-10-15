/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.command;

/**
 * @ClassName: Client
 * @Description: 命令模式
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class Client {

	public static void main(String[] args) {
		//定义接收者
		Receiver receiver = new Receiver();
		//定义一个发送给接收者的命令
		Command command = new ConcreteCommand(receiver);
		//声明调用者
		Invoker invoker = new Invoker();
		
		//把命令交给调用者执行
		invoker.setCommand(command);
		invoker.executeCommand();
	}
	
}
