/**
 * @Title: Command.java
 * @Package com.adamjwh.gof.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.command;

/**
 * @ClassName: Command
 * @Description: 命令角色
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public abstract class Command {

	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	//执行命令的方法
	abstract public void execute();
	
}
