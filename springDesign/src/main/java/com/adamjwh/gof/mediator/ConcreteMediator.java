/**
 * @Title: ConcreteMediator.java
 * @Package com.adamjwh.gof.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gof.mediator;

/**
 * @ClassName: ConcreteMediator
 * @Description: 具体中介者角色
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class ConcreteMediator extends Mediator {

	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	
	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void send(String message, Colleague colleague) {
		if(colleague == colleague1) {
			colleague2.notify(message);
		} else {
			colleague1.notify(message);
		}
	}

}
