package com.pluralsight.calcengine;

/**
 * @author nneurall
 * @created	on 23-Aug-2020
 */

public interface MathProcessing {
	/* ========================================================================== */
	/* CONSTANTS */
	/* ========================================================================== */
	String SEPARATOR = " ";

	/* ========================================================================== */
	/* METHODS */
	/* ========================================================================== */
	String getKeyword(); // add
	char getSymbol(); // +
	double doCalculation(double leftVal, double rightVal);
}
