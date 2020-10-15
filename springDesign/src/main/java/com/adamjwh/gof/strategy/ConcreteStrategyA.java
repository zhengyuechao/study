/**
 * @Title: ConcreteStrategyA.java
 * @Package com.adamjwh.gof.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gof.strategy;

/**
 * @ClassName: ConcreteStrategyA
 * @Description: 具体策略角色A
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class ConcreteStrategyA extends Strategy {

	@Override
	public void algorithmInterface() {
		System.out.println("算法A实现");
	}

}
