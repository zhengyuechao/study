/**
 * @Title: NBAObserver.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

/**
 * @ClassName: NBAObserver
 * @Description: 看NBA的同事
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class NBAObserver extends Observer {
	
	public NBAObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(subject.getAction() + "\n" + name + "关闭NBA直播，继续工作");
	}

}
