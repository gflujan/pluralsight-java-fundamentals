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
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        /* -------------------------------------------------------------------------- */
        /* L65: DEMO: Method Overloading */
        /* -------------------------------------------------------------------------- */
        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        // Doing the same thing as above but w/ a widening type cast/conversion
        int leftInt = 9;
        int rightInt = 4;

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        // Showing how having different types and Java's default casting works
        equationOverload.execute((double) leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

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
}
