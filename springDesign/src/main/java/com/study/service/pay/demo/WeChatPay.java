package com.study.service.pay.demo;

/**
 * 微信支付
 * 
 */
public class WeChatPay implements Payment {
    @Override
    public boolean pay(String orderId, long amount) {
        System.out.println("用户选择 微信 支付，订单号为：" + orderId + " ，支付金额：" + amount);
        return true;
    }
}