/**
 * @Title: Request.java
 * @Package com.adamjwh.gofex.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gofex.chain_of_responsibility;

/**
 * @ClassName: Request
 * @Description: 申请
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class Request {
	
	private String requestType;	//申请类别
	private String requestContent;	//申请内容
	private int number;	//数量

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
