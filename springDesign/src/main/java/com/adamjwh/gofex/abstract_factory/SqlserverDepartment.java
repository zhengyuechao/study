package com.adamjwh.gofex.abstract_factory;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("insert info into department with sqlserver");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("get info from department by id with sqlserver");
		return null;
	}

}
