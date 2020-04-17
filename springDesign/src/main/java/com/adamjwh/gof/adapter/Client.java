package com.adamjwh.gof.adapter;

/**
 * 适配器模式（targer为具体/抽象类）
 * 对象适配器
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
	
}