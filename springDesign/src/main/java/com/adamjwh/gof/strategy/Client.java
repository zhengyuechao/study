/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gof.strategy;

/**
 * @ClassName: Client
 * @Description: 策略模式
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Context context;
		
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
	}

}
