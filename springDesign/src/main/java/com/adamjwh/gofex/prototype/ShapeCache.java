package com.adamjwh.gofex.prototype;

import java.util.Hashtable;

/**
 * 具体实现类，获取图形
 * @author adamjwh
 *
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();
	
	public static Shape getShape(String shapeId) {
		Shape shape = shapeMap.get(shapeId);
		
		return shape.clone();
	}
	
	//添加三种图形
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Triangle triangle = new Triangle();
		triangle.setId("2");
		shapeMap.put(triangle.getId(), triangle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
	
}
