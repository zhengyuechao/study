package com.adamjwh.gof.prototype;

import java.util.ArrayList;

/**
 * 浅复制
 * @author adamjwh
 *
 */
public class ShallowCopy implements Cloneable {

	ArrayList<String> arrayList = new ArrayList<String>();
	
	@Override
	public ShallowCopy clone() {
		ShallowCopy sCopy = null;
		
		try {
			sCopy = (ShallowCopy) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sCopy;
	}
	
	//set
	public void setValue(String value) {
		this.arrayList.add(value);
	}
	
	//get
	public ArrayList<String> getvalue() {
		return this.arrayList;
	}
	
}
