package com.adamjwh.gofex.builder;

/**
 * 食物条目
 * @author adamjwh
 *
 */
public interface Item {

	//获取食物名称
	public String getName();
	//获取包装
	public Packing packing();
	//获取价格
	public float getPrice();
	
}
