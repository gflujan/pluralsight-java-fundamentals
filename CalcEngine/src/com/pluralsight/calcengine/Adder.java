package com.pluralsight.calcengine;

/**
 * @author nneurall
 * @created 30-Jun-2020
 */

public class Adder extends CalculateBase {
    /* -------------------------------------------------------------------------- */
    /* CONSTRUCTORS */
    /* -------------------------------------------------------------------------- */
    public Adder() {}

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    /* -------------------------------------------------------------------------- */
    /* METHODS */
    /* -------------------------------------------------------------------------- */
    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
