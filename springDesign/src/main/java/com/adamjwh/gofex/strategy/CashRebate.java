/**
 * @Title: CashRebate.java
 * @Package com.adamjwh.gofex.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gofex.strategy;

/**
 * @ClassName: CashRebate
 * @Description: 打折收费子类
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class CashRebate extends CashSuper {
	
	private double moneyRebate = 1;	//折扣
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
