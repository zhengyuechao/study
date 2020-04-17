/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.state;

/**
 * @ClassName: Client
 * @Description: 状态模式——电梯状态
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		
		//定义初始状态为关门（共四种初始值）
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}
	
}
