/**
 * @Title: StockObserver.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

/**
 * @ClassName: StockObserver
 * @Description: 看股票的同事
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class StockObserver extends Observer {
	
	public StockObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(subject.getAction() + "\n" + name + "关闭股票行情，继续工作");
	}

}
