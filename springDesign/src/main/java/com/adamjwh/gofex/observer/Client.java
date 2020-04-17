/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

/**
 * @ClassName: Client
 * @Description: 观察者模式——通知老板回来了（Boss自己通知）
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class Client {

	public static void main(String[] args) {
		//老板为通知者
		Boss boss = new Boss();
		
		StockObserver observer = new StockObserver("adam", boss);
		NBAObserver observer2 = new NBAObserver("tom", boss);
		
		//老板通知
		boss.attach(observer);
		boss.attach(observer2);
		
		//adam没被老板通知到，所以不用挨骂
		boss.detach(observer);
		
		//老板回来了
		boss.setAction("咳咳，我大Boss回来了！");
		//发通知
		boss.notifyObservers();
	}
	
}
