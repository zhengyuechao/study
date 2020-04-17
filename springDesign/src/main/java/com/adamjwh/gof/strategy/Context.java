/**
 * @Title: Context.java
 * @Package com.adamjwh.gof.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gof.strategy;

/**
 * @ClassName: Context
 * @Description: 封装角色
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class Context {
	
	Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	//上下文接口
	public void contextInterface() {
		strategy.algorithmInterface();
	}

}
