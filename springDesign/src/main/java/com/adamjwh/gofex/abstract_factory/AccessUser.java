package com.adamjwh.gofex.abstract_factory;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("insert info into user with access");
	}

	@Override
	public User getUser(int id) {
		System.out.println("get info from user by id with access");
		return null;
	}

}
