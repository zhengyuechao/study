package com.study.entity;


public class OrderInfo {
	
	private String order_id;
	
	private String order_name;
	
	private String price;
	
	public OrderInfo() {
		System.out.println("[订单ID]="+order_id+"[订单名称]="+order_name+"[订单价格]="+price);
	}
	public OrderInfo(String order_id,String order_name,String price) {
		this.order_id = order_id;
		this.order_name = order_name;
		this.price = price;
		System.out.println("[订单ID]="+order_id+"[订单名称]="+order_name+"[订单价格]="+price);
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
