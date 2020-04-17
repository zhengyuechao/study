/**
 * @Title: Waiter.java
 * @Package com.adamjwh.gofex.command
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.command;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Waiter
 * @Description: 服务员
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class Waiter {

	private List<Command> orders = new LinkedList<>();
	
	//设置订单
	public void setOrder(Command command) throws Exception {
		//通过反射获得鸡翅的类
		String s1 = Class.forName("com.adamjwh.gofex.command.BakeChickenWingCommand").toString().substring(6);
		//获取command订单中的类
		String s2 = command.toString().substring(0, command.toString().indexOf("@"));
		
		//这里模拟鸡翅卖完的情况，当订单中有鸡翅时，撤销订单
		if(s1.equals(s2)) {
			System.out.println("【服务员：鸡翅没有了，请点别的烧烤】");
			cancelOrder(command);//撤销订单
		} else {
			orders.add(command);
			System.out.println("添加订单：" + command.getBarbecuer() + "\t时间：" + new Date().toString());
		}
	}
	
	//取消订单
	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单：" + command.getBarbecuer() + "\t时间：" + new Date().toString());
	}
	
	//通知全部执行
	public void notifyExecute() {
		System.out.println("-----------------------订单-----------------------");
		for(Command command : orders) {
			command.excuteCommand();
		}
	}
}
