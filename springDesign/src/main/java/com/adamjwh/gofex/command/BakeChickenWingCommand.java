/**
 * @Title: BakeChickenWingCommand.java
 * @Package com.adamjwh.gofex.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.command;

/**
 * @ClassName: BakeChickenWingCommand
 * @Description: 具体烤鸡翅命令
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class BakeChickenWingCommand extends Command {

	private String barbecuer;
	
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		barbecuer = "烤鸡翅";
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}
	
	//获取名称
	public String getBarbecuer() {
		return barbecuer;
	}
	
}
