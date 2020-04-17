package com.adamjwh.gofex.singleton;

public class Emperor {
	
	private static final Emperor EMPEROR = new Emperor();
	
	private Emperor() {
	}
	
	public static Emperor getEmperor() {
		return EMPEROR;
	}
	
	public static void say() {
		System.out.println("朕乃当今圣上小李");
	}

}
