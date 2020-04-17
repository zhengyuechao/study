/**
 * @Title: CashContext.java
 * @Package com.adamjwh.gofex.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gofex.strategy;

/**
 * @ClassName: CashContext
 * @Description: 上下文
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class CashContext {
	
	private CashSuper cashSuper;
	
	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	
	public double getResult(double money) {
		return cashSuper.acceptCash(money);
	}

}
