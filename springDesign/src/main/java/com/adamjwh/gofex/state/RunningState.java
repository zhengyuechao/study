/**
 * @Title: RunningState.java
 * @Package com.adamjwh.gofex.state
 * @Description: 
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.adamjwh.gofex.state;

/**
 * @ClassName: RunningState
 * @Description: 运行状态
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class RunningState extends LiftState {

	//运行时不能开门
	@Override
	public void open() {
		//什么都不做
	}

	//运行时门肯定是关的
	@Override
	public void close() {
		//什么都不做
	}

	// * 执行运行方法
	@Override
	public void run() {
		System.out.println("电梯运行中");
	}

	//运行后可以停止
	@Override
	public void stop() {
		//环境设置为停止状态
		super.context.setLiftState(Context.STOPPING_STATE);
		super.context.getLiftState().stop();
	}

}
