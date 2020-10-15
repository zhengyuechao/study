package com.adamjwh.gofex.adapter;

/**
 * 中锋
 * @author adamjwh
 *
 */
public class Centers extends Player {
	
	public Centers(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("Center " + name + " attack");
	}

	@Override
	public void defense() {
		System.out.println("Center " + name + " defense");
	}
	
}
