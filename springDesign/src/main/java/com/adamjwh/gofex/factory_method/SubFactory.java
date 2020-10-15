package com.adamjwh.gofex.factory_method;

/**
 * 减法工厂
 * @author adamjwh
 *
 */
public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
