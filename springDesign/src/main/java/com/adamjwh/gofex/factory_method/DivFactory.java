package com.adamjwh.gofex.factory_method;

/**
 * 除法工厂
 * @author adamjwh
 *
 */
public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
