package com.adamjwh.gofex.builder;

/**
 * 负责创建Meal对象
 * @author adamjwh
 *
 */
public class MealBuilder {

	//订单1
	public Meal order1() {
		Meal meal = new Meal();
		meal.addItem(new Burger1());
		meal.addItem(new Drink1());
		
		return meal;
	}
	
	//订单2
	public Meal order2() {
		Meal meal = new Meal();
		meal.addItem(new Burger2());
		meal.addItem(new Drink2());
		
		return meal;
	}
	
}
