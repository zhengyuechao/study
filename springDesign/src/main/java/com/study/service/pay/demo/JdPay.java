package com.study.service.pay.demo;

/**
 * 京东支付
 * 
 */
public class JdPay implements Payment {
    @Override
    public boolean pay(String orderId, long amount) {
        System.out.println("用户选择 京东 支付，订单号为：" + orderId + " ，支付金额：" + amount);
        return true;
    }
}
