package com.adamjwh.gof.prototype;

/**
 * 深复制/浅复制客户端
 * @author adamjwh
 *
 */
public class TestClient {

	public static void main(String[] args) {
		//产生对象
//		ShallowCopy copy = new ShallowCopy();
		DeepCopy copy = new DeepCopy();
		copy.setValue("张三");
		
		//拷贝对象
//		ShallowCopy cloneCopy = copy.clone();
		DeepCopy cloneCopy = copy.clone();
		cloneCopy.setValue("李四");
		
		System.out.println(copy.getvalue());
	}
	
}
