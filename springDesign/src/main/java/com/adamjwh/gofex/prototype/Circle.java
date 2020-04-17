package com.adamjwh.gofex.prototype;

/**
 * 圆形类
 * @author adamjwh
 *
 */
public class Circle extends Shape {

	public Circle() {
		type = "圆形";
	}
	
	@Override
	public void draw() {
		System.out.println("圆形类的draw方法");
	}

}
