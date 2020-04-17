/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.visitor
 * @Description: 
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.adamjwh.gofex.visitor;

/**
 * @ClassName: Client
 * @Description: 访问者模式——男人和女人
 * @author adamjwh
 * @date 2018年7月29日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		//成功
		Success success = new Success();
		objectStructure.display(success);
		
		//失败
		Failing failing = new Failing();
		objectStructure.display(failing);
	}

}
