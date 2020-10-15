/**
 * @Title: BakeMuttonCommand.java
 * @Package com.adamjwh.gofex.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.command;

/**
 * @ClassName: BakeMuttonCommand
 * @Description: 具体烤羊肉串命令
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class BakeMuttonCommand extends Command {

	private String barbecuer;
	
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		barbecuer = "烤羊肉串";
	}

	@Override
	public void excuteCommand() {
		receiver.bakeMutton();
	}
	
	//获取名称
	public String getBarbecuer() {
		return barbecuer;
	}
	
}
