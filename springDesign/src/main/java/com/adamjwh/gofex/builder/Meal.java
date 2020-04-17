package com.adamjwh.gofex.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author adamjwh
 *
 */
public class Meal {
	
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	//获取总消费
	public float getCost() {
		float cost = 0.0f;
		
		for (Item item : items) {
			cost += item.getPrice();
		}
		
		return cost;
	}
	
	public void showItem() {
		for (Item item : items) {
			System.out.print("餐品：" + item.getName());
			System.out.print("，包装：" + item.packing().getPack());
			System.out.println("，价格：￥" + item.getPrice());
		}
	}

}
