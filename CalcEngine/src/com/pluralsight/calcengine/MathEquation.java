package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    /* -------------------------------------------------------------------------- */
    /* L57: DEMO: Setting Class initializers and constructors */
    /* -------------------------------------------------------------------------- */
    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    /* -------------------------------------------------------------------------- */
    /* L50: DEMO: w/ Accessors & Mutators */
    /* GETTERS / SETTERS */
    /* -------------------------------------------------------------------------- */
    public double getLeftVal() {
        return (leftVal);
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return (rightVal);
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return (opCode);
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return (result);
    }

    /* -------------------------------------------------------------------------- */
    /* L50: DEMO: w/ Accessors & Mutators */
    /* CLASS / INSTANCE METHODS */
    /* -------------------------------------------------------------------------- */
    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 'd':
                result = rightVal == 0.0d ? 0.0d : leftVal / rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            default:
                System.out.println("Error - Invalid 'opCode'");
                result = 0.0d;
                break;
        }
    }
}
