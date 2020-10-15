package com.adamjwh.gof.builder;

/**
 * 指挥者类
 * @author adamjwh
 *
 */
public class Director {
	
	public void Construct(Builder builder) {
		builder.BuildPartA();
		builder.BuildPartB();
	}

}
