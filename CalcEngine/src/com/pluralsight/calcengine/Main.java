package com.pluralsight.calcengine;

/**
 * @author Metal Gabe
 * @created 23-May-2020 @ 11:35
 */

public class Main {
    public static void main(String[] args) {
        /* -------------------------------------------------------------------------- */
        /* L37: DEMO: w/ Arrays, Loops & Switch */
        /* L48: Re-factoring to use MathEquation class */
        /* -------------------------------------------------------------------------- */
        // double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
        // double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
        // char[] opCodes = { 'd', 'a', 's', 'm' };
        // double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        /* -------------------------------------------------------------------------- */
        /* L32: DEMO: CalcEngine */
        /* -------------------------------------------------------------------------- */
        // double val1 = 100.0d;
        // double val2 = 50.0d;
        // double result;
        // char opCode = 'd';
        //
        // if (opCode == 'a') {
        //     result = val1 + val2;
        // } else if (opCode == 's') {
        //     result = val1 - val2;
        // } else if (opCode == 'd') {
        //     result = val2 != 0.0d ? val1 / val2 : 0.0d;
        //
        //     // if (val2 != 0.0d) {
        //     //     result = val1 / val2;
        //     // } else {
        //     //     result = 0.0d;
        //     // }
        // } else if (opCode == 'm') {
        //     result = val1 * val2;
        // } else {
        //     System.out.println("ERROR - Invalid 'opCode'");
        //     result = 0.0d;
        // }

        // System.out.println(result);
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        /* -------------------------------------------------------------------------- */
        /* L48: DEMO: CalcEngine with Classes & Methods */
        /* -------------------------------------------------------------------------- */

        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
