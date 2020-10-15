package com.adamjwh.gofex.adapter;

/**
 * 外籍中锋
 * @author adamjwh
 *
 */
public class ForeignCenters {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attackChi() {
		System.out.println("中锋 " + name + " 进攻");
	}

	public void defenseChi() {
		System.out.println("中锋 " + name + " 防守");
	}
}
