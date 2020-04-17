package com.adamjwh.gof.adapter2;

/**
 * 目标角色实现类
 * @author adamjwh
 *
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("普通请求");
	}

}
