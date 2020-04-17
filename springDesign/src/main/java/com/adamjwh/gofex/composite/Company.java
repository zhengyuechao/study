package com.adamjwh.gofex.composite;

/**
 * 公司类
 * @author adamjwh
 *
 */
public abstract class Company {

	protected String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	//增加
	public abstract void add(Company company);
	//移除
	public abstract void remove(Company company);
	//显示
	public abstract void display(int depth);
	//履行职责
	public abstract void lineOfDuty();
	
}
