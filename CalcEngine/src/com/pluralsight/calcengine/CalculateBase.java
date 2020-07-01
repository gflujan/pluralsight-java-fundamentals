package com.pluralsight.calcengine;

/**
 * @author nneurall
 * @created 30-Jun-2020
 */

abstract public class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    /* -------------------------------------------------------------------------- */
    /* GETTERS / SETTERS */
    /* -------------------------------------------------------------------------- */
    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    /* -------------------------------------------------------------------------- */
    /* CONSTRUCTORS */
    /* -------------------------------------------------------------------------- */
    public CalculateBase() {}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    /* -------------------------------------------------------------------------- */
    /* METHODS */
    /* -------------------------------------------------------------------------- */
    abstract public void calculate();
}
