package com.adamjwh.gofex.factory_method;

/**
 * 加法工厂
 * @author adamjwh
 *
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
