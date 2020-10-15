package com.adamjwh.gofex.abstract_factory;

/**
 * 反射实现
 * @author adamjwh
 *
 */
public class DataAccess {

	private static final String name = "com.adamjwh.gofex.abstract_factory";
	private static final String db = "Access";
	
	public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = name + "." + db + "User";
		return (IUser) Class.forName(className).newInstance();
	}

	public static IDepartment createDepartment() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = name + "." + db + "Department";
		return (IDepartment) Class.forName(className).newInstance();
	}
	
}
