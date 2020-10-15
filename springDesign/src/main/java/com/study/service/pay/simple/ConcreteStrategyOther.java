package com.study.service.pay.simple;

/**
 * 策略实现类
 * 
 */
public class ConcreteStrategyOther implements IStrategy {

    /**
     * 具体实现
     */
    @Override
    public void unifiedPay() {
        System.out.println("this is ConcreteStrategyOther method...");
    }
}