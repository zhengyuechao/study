package com.adamjwh.gofex.composite;

/**
 * 树叶节点——人力资源部
 * @author adamjwh
 *
 */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
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
		System.out.println(name + " : 员工招聘培训管理");
	}
	
}
