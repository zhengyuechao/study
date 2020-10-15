package com.adamjwh.gofex.factory_method;

/**
 * 加法类
 * @author adamjwh
 *
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = numberA + numberB;
		
		return result;
	}
	
}
