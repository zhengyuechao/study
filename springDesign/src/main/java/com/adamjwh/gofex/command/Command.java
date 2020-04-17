/**
 * @Title: Command.java
 * @Package com.adamjwh.gofex.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.command;

/**
 * @ClassName: Command
 * @Description: 抽象命令类
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public abstract class Command {

	protected Barbecuer receiver;
	
	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}
	
	//执行命令
	abstract public void excuteCommand();
	
	//获取名称
	abstract public String getBarbecuer();
	
}
