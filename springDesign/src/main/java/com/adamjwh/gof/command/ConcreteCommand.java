/**
 * @Title: ConcreteCommand.java
 * @Package com.adamjwh.gof.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.command;

/**
 * @ClassName: ConcreteCommand
 * @Description: 具体Command
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class ConcreteCommand extends Command {

	//构造传递接收者
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	//必须实现一个命令
	@Override
	public void execute() {
		receiver.action();
	}

}
