/**
 * @Title: CommonManager.java
 * @Package com.adamjwh.gofex.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gofex.chain_of_responsibility;

/**
 * @ClassName: CommonManager
 * @Description: 经理类
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void handlerRequest(Request request) {
		if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {	//只能批准两天内的假期
			System.out.println(name + ":" + request.getRequestContent() + "，时长：" + request.getNumber() + "天，被批准");
		} else {	//其余请求申请上级
			if (superior != null) {
				superior.handlerRequest(request);
			}
		}
	}

}
