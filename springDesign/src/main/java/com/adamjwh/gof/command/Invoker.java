/**
 * @Title: Invoker.java
 * @Package com.adamjwh.gof.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.command;

/**
 * @ClassName: Invoker
 * @Description: 调用者角色
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class Invoker {

	private Command command;
	
	//接受命令
	public void setCommand(Command command) {
		this.command = command;
	}
	
	//执行命令
	public void executeCommand() {
		command.execute();
	}
	
}
