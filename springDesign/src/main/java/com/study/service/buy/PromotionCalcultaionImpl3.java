package com.study.service.buy;
 
import org.springframework.stereotype.Component;

import com.study.entity.OrderInfo;

/*
 * 面向接口实现类3
 */
@Component("promotion3")
public class PromotionCalcultaionImpl3 implements PromotionCalclation {

	@Override
	public OrderInfo calulate(OrderInfo o) {
		System.out.println("P3 对订单进行了结算");
		return o;
	}

}
