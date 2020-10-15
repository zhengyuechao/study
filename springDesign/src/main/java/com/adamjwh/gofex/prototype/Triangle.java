package com.adamjwh.gofex.prototype;

/**
 * 三角形类
 * @author adamjwh
 *
 */
public class Triangle extends Shape {

	public Triangle() {
		type = "三角形";
	}
	
	@Override
	public void draw() {
		System.out.println("三角形类的draw方法");
	}

}
