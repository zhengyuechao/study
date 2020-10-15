package com.study.service.pay.demo;

public interface  Payment {

	boolean pay(String orderId, long amount);
}
