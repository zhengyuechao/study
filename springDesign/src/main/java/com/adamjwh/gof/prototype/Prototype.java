package com.adamjwh.gof.prototype;

/**
 * 原型类
 * @author adamjwh
 *
 */
public abstract class Prototype implements Cloneable {
	
	private String id;
	
	public Prototype(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public Prototype clone() {
		Prototype prototype = null;
		
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return prototype;
	}
	
}
