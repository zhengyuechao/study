/**
 * @Title: Action.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Action
 * @Description: 状态的抽象类
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public abstract class Action {
	
	//得到男人的结论或反应
	public abstract void getManConclusion(Man man);
	
	//得到女人的结论或反应
	public abstract void getWomanConclusion(Woman woman);

}
