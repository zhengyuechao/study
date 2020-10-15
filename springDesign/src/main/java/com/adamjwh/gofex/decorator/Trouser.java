package com.adamjwh.gofex.decorator;

/**
 * 具体服装类
 * @author adamjwh
 *
 */
public class Trouser extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.print("垮裤 ");
	}
	
}
