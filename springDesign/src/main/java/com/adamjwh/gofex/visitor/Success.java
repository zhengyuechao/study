/**
 * @Title: Success.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Success
 * @Description: 成功
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class Success extends Action {

	@Override
	public void getManConclusion(Man man) {
		System.out.println("男人成功...");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("女人成功...");
	}

}
