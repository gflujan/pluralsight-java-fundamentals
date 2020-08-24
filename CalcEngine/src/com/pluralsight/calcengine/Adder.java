package com.pluralsight.calcengine;

/**
 * @author nneurall
 * @created on 30-Jun-2020
 */

public class Adder extends CalculateBase implements MathProcessing {
	/* ========================================================================== */
	/* CONSTRUCTORS */
	/* ========================================================================== */
	public Adder() {}

	public Adder(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}

	/* ========================================================================== */
	/* METHODS */
	/* ========================================================================== */
	@Override
	public void calculate() {
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}

	@Override
	public String getKeyword() {
		return "add";
	}

	@Override
	public char getSymbol() {
		return '+';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();

		return getResult();
	}
}
