/**
 * @Title: Failing.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Failing
 * @Description: 失败
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class Failing extends Action {
	
	@Override
	public void getManConclusion(Man man) {
		System.out.println("男人失败...");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println("女人失败...");
	}

}
