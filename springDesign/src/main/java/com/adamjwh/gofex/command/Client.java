/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.command;

/**
 * @ClassName: Client
 * @Description: 命令模式——烤肉点菜订单日志
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		//开店前准备
		Barbecuer barbecuer = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(barbecuer);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(barbecuer);
		Waiter waiter = new Waiter();
		
		//开门营业，顾客点菜
		
		waiter.setOrder(bakeMuttonCommand1);
		waiter.setOrder(bakeMuttonCommand2);
		//这里假设鸡翅卖完了
		waiter.setOrder(bakeChickenWingCommand1);
		
		//点菜完毕，通知厨房
		waiter.notifyExecute();
	}
	
}
