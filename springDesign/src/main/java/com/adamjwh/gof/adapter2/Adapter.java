package com.adamjwh.gof.adapter2;

/**
 * 适配器(	类适配器)
 * @author adamjwh
 *
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}

}
