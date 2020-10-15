package com.adamjwh.gofex.prototype;

import java.awt.Window.Type;

/**
 * 矩形类
 * @author adamjwh
 *
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "矩形";
	}

	@Override
	public void draw() {
		System.out.println("矩形类的draw方法");
	}
	
}
