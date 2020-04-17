/**
 * @Title: UserDaoProxy.java
 * @Package com.adamjwh.gof.proxy.static_proxy
 * @Description: 
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.adamjwh.gof.proxy.static_proxy;

/**
 * @ClassName: UserDaoProxy
 * @Description: 代理类
 * @author adamjwh
 * @date 2018年8月9日
 *
 */
public class UserDaoProxy implements IUserDao {
	
	private IUserDao iUserDao;

	public UserDaoProxy(IUserDao iUserDao) {
		this.iUserDao = iUserDao;
	}
	
	@Override
	public void save() {
		System.out.println("开始事务...");
		iUserDao.save();	//执行目标对象
		System.out.println("提交事务...");
	}

}
