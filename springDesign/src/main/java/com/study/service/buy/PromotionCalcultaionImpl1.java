package com.study.service.buy;
 
import org.springframework.stereotype.Component;

import com.study.common.util.DateUtils;
import com.study.entity.OrderInfo;

/*
 * 面向接口实现类1
 */
@Component("promotion1")
public class PromotionCalcultaionImpl1 implements PromotionCalclation,CalcDate {

	@Override
	public OrderInfo calulate(OrderInfo o) {
		System.out.println("P1 对订单进行了结算[订单ID=]"+o.getOrder_id());
		return o;
	}

	@Override
	public String payDate() {
		System.out.println(DateUtils.getCurrentYYYY());
		return null;
	}
}
