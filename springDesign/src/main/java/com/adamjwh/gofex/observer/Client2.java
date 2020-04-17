/**
 * @Title: Client2.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

/**
 * @ClassName: Client2
 * @Description: 观察者模式——通知老板回来了(前台通知)
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class Client2 {

	public static void main(String[] args) {
		//前台为通知者
		Secretary secretary = new Secretary();
		
		StockObserver observer = new StockObserver("adam", secretary);
		NBAObserver observer2 = new NBAObserver("tom", secretary);
		
		//前台通知
		secretary.attach(observer);
		secretary.attach(observer2);
		
		//adam没被前台通知到，所以被老板抓了个现行
		secretary.detach(observer);
		
		//老板回来了
		secretary.setAction("小心！Boss回来了！");
		//发通知
		secretary.notifyObservers();
	}
	
}
