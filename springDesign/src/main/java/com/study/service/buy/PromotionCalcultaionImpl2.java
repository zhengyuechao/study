package com.study.service.buy;
 
import org.springframework.stereotype.Component;

import com.study.entity.OrderInfo;
/*
 * 面向接口实现类2
 */
@Component("promotion2")
public class PromotionCalcultaionImpl2 implements PromotionCalclation {

	@Override
	public OrderInfo calulate(OrderInfo o) {
		System.out.println("P2 对订单进行了结算");
		return o;
	}

}
