/**
 * @Title: LiftState.java
 * @Package com.adamjwh.gofex.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.state;

/**
 * @ClassName: LiftState
 * @Description: 抽象电梯状态
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public abstract class LiftState {

	protected Context context;
	
	public void setContext(Context context) {
		this.context = context;
	}
	
	//电梯门开启动作
	public abstract void open();
	//电梯门关闭动作
	public abstract void close();
	//电梯运行
	public abstract void run();
	//电梯停止
	public abstract void stop();
	
}
