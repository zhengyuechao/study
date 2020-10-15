package com.study.service.pay.simple;

/**
 * 策略类抽象接口，具体策略实现由其子类来实现
 *
 */
public interface IStrategy {

    /**
     * 定义的抽象方法 来约束具体的算法实现方法
     */
    void unifiedPay();
}