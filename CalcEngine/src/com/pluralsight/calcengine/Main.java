package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
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

        /* -------------------------------------------------------------------------- */
        /* L37: DEMO: w/ Arrays, Loops & Switch */
        /* -------------------------------------------------------------------------- */
        double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = { 'd', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];

        // Using a standard "for" loop
        for (int i = 0; i < opCodes.length; i += 1) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] == 0.0d ? 0.0d : leftVals[i] / rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                default:
                    System.out.println("Error - Invalid 'opCode'");
                    results[i] = 0.0d;
                    break;
            }
        }

        for (double currResult : results) {
            System.out.print("result = ");
            System.out.println(currResult);
        }
    }
}
