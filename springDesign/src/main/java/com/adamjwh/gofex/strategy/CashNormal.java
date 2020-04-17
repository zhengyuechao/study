/**
 * @Title: CashNormal.java
 * @Package com.adamjwh.gofex.strategy
 * @Description: 
 * @author adamjwh
 * @date 2018年7月30日
 * @version V1.0
 */
package com.adamjwh.gofex.strategy;

/**
 * @ClassName: CashNormal
 * @Description: 正常收费子类
 * @author adamjwh
 * @date 2018年7月30日
 *
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
