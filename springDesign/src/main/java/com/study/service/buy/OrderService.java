package com.study.service.buy;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.entity.OrderInfo;

@Service
public class OrderService {

	//map 存储 bean PromotionCalclation 工厂模式
	@Autowired
	private Map<String, PromotionCalclation> promotionCalculations;
	
	public OrderInfo prepareOrder(OrderInfo o, String promotion) {
		/*switch (promotion) {
		case "promotion1":
			
			break;

		default:
			break;
		}
		return o;*/
		return this.promotionCalculations.get(promotion).calulate(o);
	}
	
	
}