package com.adamjwh.gofex.composite;

/**
 * 树叶节点——财务部
 * @author adamjwh
 *
 */
public class FinanceDepartment extends Company {
	
	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company company) {
		
	}

	@Override
	public void remove(Company company) {
		
	}

	@Override
	public void display(int depth) {
		//输出树形结构的子节点
		for(int i=0; i<depth; i++) {
			System.out.print('-');
		}
		System.out.println(name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + " : 公司财务收支管理");
	}
	
}
