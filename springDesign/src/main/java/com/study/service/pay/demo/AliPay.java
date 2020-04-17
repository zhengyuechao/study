package com.study.service.pay.demo;

/**
 * 支付宝支付
 *
 */
public class AliPay implements Payment {
    @Override
    public boolean pay(String orderId, long amount) {
        System.out.println("用户选择 支付宝 支付，订单号为：" + orderId + " ，支付金额：" + amount);
        return true;
    }
}