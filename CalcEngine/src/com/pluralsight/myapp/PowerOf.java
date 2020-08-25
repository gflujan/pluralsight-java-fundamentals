package com.pluralsight.myapp;

import com.pluralsight.calcengine.MathProcessing;

/**
 * @author Gabriel F. Lujan
 * @created on 24-Aug-2020
 */

public class PowerOf implements MathProcessing {
	@Override
	public String getKeyword() {
		return "power";
	}

	@Override
	public char getSymbol() {
		return '^';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		return Math.pow(leftVal, rightVal);
	}
}
