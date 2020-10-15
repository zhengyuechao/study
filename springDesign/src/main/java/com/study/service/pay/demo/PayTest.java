package com.study.service.pay.demo;

public class PayTest {

	public static void main(String[] args) {
		// 创建支付策略
	    Payment weChatPay = new WeChatPay();

	    // 创建策略上下文（订单），并将具体的策略实现注入
	    String orderId = "123456";
	    long amount = 150;
	    Order order = new Order(orderId, weChatPay, amount);

	    // 调用具体支付策略逻辑
	    order.pay();
	    
	    
	    
	 // 前端传入的参数
	    String payType = PayStrategyFactory.ALI_PAY;

	    // 创建策略上下文（订单），并将具体的策略实现注入
	    order = new Order(orderId, amount);
	    // 实际情况是 在支付的时候选择支付方式，因为有可能先提交了订单，后面再付款
	    order.pay(payType);
	}
}
