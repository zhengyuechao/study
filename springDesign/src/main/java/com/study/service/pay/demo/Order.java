package com.study.service.pay.demo;

/**
 * 订单类，相当于 策略上下文角色
 * 
 */
public class Order {
    // 订单id
    private String orderId;
    // 金额
    private long amount;
    // 具体支付类型的引用
    private Payment payType;

    public Order(String orderId, Payment payType, long amount) {
        this.orderId = orderId;
        this.payType = payType;
        this.amount = amount;
    }

    /**
     * 订单支付方法
     *
     * @return
     */
    public boolean pay() {
        boolean paySuccess;
        // 调用支付接口
        paySuccess = payType.pay(orderId, amount);

        if (!paySuccess) {
            // 支付失败逻辑
            System.out.println("支付失败！");
        }
        return paySuccess;
    }
    
    
    public Order(String orderId, long amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     * 订单支付方法
     *
     * @return
     */
    public boolean pay(String payType) {
        boolean paySuccess;
        Payment payment = PayStrategyFactory.getPayment(payType);
        // 调用支付接口
        paySuccess = payment.pay(orderId, amount);

        if (!paySuccess) {
            // 支付失败逻辑
            System.out.println("支付失败！");
        }
        return paySuccess;
    }
}