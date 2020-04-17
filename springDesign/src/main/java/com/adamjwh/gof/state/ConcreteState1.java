/**
 * @Title: ConcreteState1.java
 * @Package com.adamjwh.gof.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.state;

/**
 * @ClassName: ConcreteState1
 * @Description: 具体状态角色
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		//...
		System.out.println("ConcreteState1 的 handle1 方法");
	}

	@Override
	public void handle2() {
		super.context.setCurrentState(Context.STATE2);
		System.out.println("ConcreteState1 的 handle2 方法");
	}
	
}
