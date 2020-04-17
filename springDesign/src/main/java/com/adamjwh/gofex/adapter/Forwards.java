package com.adamjwh.gofex.adapter;

/**
 * 前锋
 * @author adamjwh
 *
 */
public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println("Forward " + name + " attack");
	}

	@Override
	public void defense() {
		System.out.println("Forward " + name + " defense");
	}

}
