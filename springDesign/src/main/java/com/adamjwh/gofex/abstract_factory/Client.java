package com.adamjwh.gofex.abstract_factory;

/**
 * 抽象工厂模式——更换数据库
 * @author adamjwh
 *
 */
public class Client {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		User user = new User();
		Department department = new Department();
		
		IFactory factory = new SqlserverFactory();
//		IFactory factory = new AccessFactory();
		
//		DataAccess factory = new DataAccess();	//反射实现
		
		IUser iUser = factory.createUser();
		iUser.insert(user);
		iUser.getUser(1);
		
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.insert(department);
		iDepartment.getDepartment(1);
	}

}
