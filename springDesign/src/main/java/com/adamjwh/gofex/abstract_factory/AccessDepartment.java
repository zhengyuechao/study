package com.adamjwh.gofex.abstract_factory;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("insert info into department with access");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("get info from department by id with access");
		return null;
	}

}
