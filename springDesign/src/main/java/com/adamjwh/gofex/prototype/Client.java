package com.adamjwh.gofex.prototype;

/**
 * 原型模式——图形的克隆
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("图形：" + clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("图形：" + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("图形：" + clonedShape3.getType());
		
	}
	
}
