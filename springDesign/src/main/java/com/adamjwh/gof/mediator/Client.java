/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gof.mediator;

/**
 * @ClassName: Client
 * @Description: 中介者模式
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.send("Nice to meet u.");
		colleague2.send("Nice to meet u too.");
	}

}
