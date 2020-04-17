/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.state;

/**
 * @ClassName: Client
 * @Description: 状态模式
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class Client {

	public static void main(String[] args) {
		//定义环境角色
		Context context = new Context();
		//初始化状态
		context.setCurrentState(new ConcreteState1());
		//行为执行
		context.handle1();
		context.handle2();
	}
	
}
