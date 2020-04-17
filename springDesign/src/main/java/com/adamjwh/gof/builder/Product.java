package com.adamjwh.gof.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {

	List<String> parts = new LinkedList<>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("------产品创建------");
		for (String part : parts) {
			System.out.println(part);
		}
	}
	
}
