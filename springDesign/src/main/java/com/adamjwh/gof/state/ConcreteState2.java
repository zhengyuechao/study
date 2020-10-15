/**
 * @Title: ConcreteState2.java
 * @Package com.adamjwh.gof.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.state;

/**
 * @ClassName: ConcreteState2
 * @Description: 抽象状态角色
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		super.context.setCurrentState(Context.STATE1);
		System.out.println("ConcreteState2 的 handle1 方法");
	}

	@Override
	public void handle2() {
		//...
		System.out.println("ConcreteState2 的 handle2 方法");
	}

}
