package com.adamjwh.gofex.abstract_factory;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("insert info into user with sqlserver");
	}

	@Override
	public User getUser(int id) {
		System.out.println("get info from user by id with sqlserver");
		return null;
	}

}
