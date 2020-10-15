package com.adamjwh.gofex.factory_method;

/**
 * 除法类
 * @author adamjwh
 *
 */
public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		if(numberB == 0) {
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		result = numberA / numberB;
		
		return result;
	}
	
}
