/**
 * @Title: Handler.java
 * @Package com.adamjwh.gofex.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gofex.chain_of_responsibility;

/**
 * @ClassName: Handler
 * @Description: 管理者
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public abstract class Manager {
	
	protected String name;
	protected Manager superior;	//管理者的上级
	
	public Manager(String name) {
		this.name = name;
	}
	
	//设置管理者的上级
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	
	//申请请求
	public abstract void handlerRequest(Request request);

}
