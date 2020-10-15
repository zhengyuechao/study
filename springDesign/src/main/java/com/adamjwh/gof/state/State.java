/**
 * @Title: State.java
 * @Package com.adamjwh.gof.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gof.state;

/**
 * @ClassName: State
 * @Description: 抽象状态角色
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public abstract class State {
	
	protected Context context;
	public void setContext(Context context) {
		this.context = context;
	}

	//行为1
	public abstract void handle1();
	//行为2
	public abstract void handle2();
	
}
