package com.pluralsight.calcengine;

/**
 * @author nneurall
 * @created on 30-Jun-2020
 */

public class Multiplier extends CalculateBase {
	/* ========================================================================== */
	/* CONSTRUCTORS */
	/* ========================================================================== */
	public Multiplier() {}

	public Multiplier(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}

	/* ========================================================================== */
	/* METHODS */
	/* ========================================================================== */
	@Override
	public void calculate() {
		double value = getLeftVal() * getRightVal();
		setResult(value);
	}
}
