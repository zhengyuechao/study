package com.study.service.pay.demo;

/**
 * 银联支付
 * 
 */
public class UnionPay implements Payment {
    @Override
    public boolean pay(String orderId, long amount) {
        System.out.println("用户选择 银联 支付，订单号为：" + orderId + " ，支付金额：" + amount);
        return true;
    }
}