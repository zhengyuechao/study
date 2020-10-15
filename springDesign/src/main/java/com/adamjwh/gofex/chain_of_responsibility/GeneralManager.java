/**
 * @Title: GeneralManager.java
 * @Package com.adamjwh.gofex.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gofex.chain_of_responsibility;

/**
 * @ClassName: GeneralManager
 * @Description: 总经理
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handlerRequest(Request request) {
		if (request.getRequestType().equals("请假")) {	//能批准任意时长的假期
			System.out.println(name + ":" + request.getRequestContent() + "，时长：" + request.getNumber() + "天，被批准");
		} else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
			System.out.println(name + ":" + request.getRequestContent() + "，金额：￥" + request.getNumber() + "，被批准");
		} else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
			System.out.println(name + ":" + request.getRequestContent() + "，金额：￥" + request.getNumber() + "，再说吧");
		}
	}

}
