package com.adamjwh.gofex.factory_method;

public class Operation {
	
	protected double numberA = 0;
	protected double numberB = 0;
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public double getResult() {
		double result = 0;
		return result;
	}
}
