package com.adamjwh.gofex.factory_method;

/**
 * 减法类
 * @author adamjwh
 *
 */
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = numberA - numberB;
		
		return result;
	}
	
}
