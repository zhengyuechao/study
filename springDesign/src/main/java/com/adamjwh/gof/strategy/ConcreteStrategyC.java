/**
 * @Title: ConcreteStrategyC.java
 * @Package com.adamjwh.gof.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gof.strategy;

/**
 * @ClassName: ConcreteStrategyC
 * @Description: 具体策略角色C
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class ConcreteStrategyC extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("算法C实现");
	}

}
