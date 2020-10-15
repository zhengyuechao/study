package com.adamjwh.gof.adapter;

/**
 * 适配器(对象适配器)
 * @author adamjwh
 *
 */
public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
