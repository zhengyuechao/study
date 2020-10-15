package com.adamjwh.gofex.decorator;

/**
 * 具体服装类
 * @author adamjwh
 *
 */
public class Suits extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.print("西装 ");
	}
	
}
