package com.study.gof.noelse.template;

public interface BehaviorInterface {
	
	// 其他参数校验(不同活动类型实现不同)
	public void	checkParams( Context ctx);
		// 获取node奖品信息(不同活动类型实现不同)
	public void	getPrizesByNode(Context ctx) ;

}
