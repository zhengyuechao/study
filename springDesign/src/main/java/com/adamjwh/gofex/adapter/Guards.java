package com.adamjwh.gofex.adapter;

/**
 * 后卫
 * @author adamjwh
 *
 */
public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("Guard " + name + " attack");
	}

	@Override
	public void defense() {
		System.out.println("Guard " + name + " defense");
	}
	
}
