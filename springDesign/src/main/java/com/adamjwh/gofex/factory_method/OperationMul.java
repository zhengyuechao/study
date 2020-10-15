package com.adamjwh.gofex.factory_method;

/**
 * 乘法类
 * @author adamjwh
 *
 */
public class OperationMul extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = numberA * numberB;
		
		return result;
	}
	
}
