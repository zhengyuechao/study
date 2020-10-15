/**
 * @Title: ConcreteColleague2.java
 * @Package com.adamjwh.gof.mediator
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gof.mediator;

/**
 * @ClassName: ConcreteColleague2
 * @Description: 具体同事对象
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println("同事2得到消息：" + message);
	}

}
