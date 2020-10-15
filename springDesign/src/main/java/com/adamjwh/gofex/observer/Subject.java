/**
 * @Title: Subject.java
 * @Package com.adamjwh.gofex.observer
 * @Description: 
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.adamjwh.gofex.observer;

/**
 * @ClassName: Subject
 * @Description: 通知者接口
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public interface Subject {

	//增加
	public void attach(Observer observer);
	//删除
	public void detach(Observer observer);
	//通知
	public void notifyObservers();
	
	//状态
	public void setAction(String action);
	public String getAction();
	
}
