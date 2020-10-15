/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gofex.chain_of_responsibility;

/**
 * @ClassName: Client
 * @Description: 职责链模式——请假/加薪
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("尼古拉斯·经理");
		Majordomo majordomo = new Majordomo("尼古拉斯·总监");
		GeneralManager generalManager = new GeneralManager("尼古拉斯·总经理");
		
		//设置上级
		commonManager.setSuperior(majordomo);
		majordomo.setSuperior(generalManager);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("adam请假");
		request.setNumber(1);
		commonManager.handlerRequest(request);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("adam请假");
		request2.setNumber(4);
		commonManager.handlerRequest(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("adam请求加薪");
		request3.setNumber(500);
		commonManager.handlerRequest(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("adam请求加薪");
		request4.setNumber(1000);
		commonManager.handlerRequest(request4);
	}

}
