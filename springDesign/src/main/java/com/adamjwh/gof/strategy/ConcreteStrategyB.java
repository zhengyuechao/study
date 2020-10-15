/**
 * @Title: ConcreteStrategyB.java
 * @Package com.adamjwh.gof.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gof.strategy;

/**
 * @ClassName: ConcreteStrategyB
 * @Description: 具体策略角色B
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class ConcreteStrategyB extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("算法B实现");
	}

}
