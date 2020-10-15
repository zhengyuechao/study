/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gof.chain_of_responsibility;

/**
 * @ClassName: Client
 * @Description: 职责链模式
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandlerA();
		Handler handler2 = new ConcreteHandlerB();
		Handler handler3 = new ConcreteHandlerC();
		
		//设置链中的阶段顺序 1->2->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		
		//提交请求返回结果
		Response response = handler1.handlerMessage(new Request());
	}

}
