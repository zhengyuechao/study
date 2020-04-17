package com.adamjwh.gofex.prototype;

/**
 * 图形类
 * @author adamjwh
 *
 */
public abstract class Shape implements Cloneable {
	
	private String id;
	protected String type;
	
	public abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	
	@Override
	public Shape clone() {
		Shape prototype = null;
		
		try {
			prototype = (Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return prototype;
	}
	
}
