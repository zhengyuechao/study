package com.study.service.pay.simple;

/**
 * 策略具体实现类weixin
 * 
 */
public class ConcreteStrategyWXPay implements IStrategy {

    /**
     * 具体实现
     */
    @Override
    public void unifiedPay() {
        System.out.println("this is ConcreteStrategyWXPay method...");
    }

}