package com.adamjwh.gofex.factory_method;

/**
 * 乘法工厂
 * @author adamjwh
 *
 */
public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
