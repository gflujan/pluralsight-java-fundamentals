package com.pluralsight.myapp;

// import com.pluralsight.calcengine.Adder;
// import com.pluralsight.calcengine.CalculateBase;
import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.CalculateHelper;
// import com.pluralsight.calcengine.Divider;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.MathProcessing;
// import com.pluralsight.calcengine.MathCommand;
// import com.pluralsight.calcengine.MathEquation;
// import com.pluralsight.calcengine.Multiplier;
// import com.pluralsight.calcengine.Subtractor;

/**
 * @author Metal Gabe
 * @created on 23-May-2020
 */

public class Main {
	public static void main(String[] args) {
		// seeOlderShit();
		// useCalculateHelper();

		/* ========================================================================== */
		/* L110: DEMO: Dynamically Extending CalcEngine - Declare & Implement */
		/* L111: DEMO: Dynamically Extending CalcEngine - Add Support */
		/* L112: DEMO: Dynamically Extending CalcEngine - New Functionality */
		/* ========================================================================== */
		String[] statements = {
			"add 25.0 92.0"
		};

		DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
			new Adder()
		});

		for (String statement : statements) {
			String output = helper.process(statement);
			System.out.println(output);
		}
	}

	/* ========================================================================== */
	/* L87: DEMO: CalcEngine with Specialized Classes */
	/* ========================================================================== */
	static void useCalculateHelper() {
		String[] statements = {
			"add 1.0",
			"add xx 25.0",
			"addX 0.0 0.0",
			"divide 100.0 50.0",
			"add 25.0 92.0",
			"subtract 225.0 17.0",
			"multiply 11.0 3.0",
		};

		CalculateHelper helper = new CalculateHelper();

		for (String statement : statements) {
			try {
				helper.process(statement);
				System.out.println(helper);
			} catch (InvalidStatementException err) {
				System.out.println(err.getMessage());

				if (err.getCause() != null) {
					System.out.println("  Original exception: " + err.getCause().getMessage());
				}
			}
		}
	}

	static void seeOlderShit() {
		/* ========================================================================== */
		/* L37: DEMO: w/ Arrays, Loops & Switch */
		/* L48: Re-factoring to use MathEquation class */
		/* ========================================================================== */
		// double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		// double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		// char[] opCodes = { 'd', 'a', 's', 'm' };
		// double[] results = new double[opCodes.length];

		// MathEquation[] equations = new MathEquation[4];
		// equations[0] = new MathEquation('d', 100.0d, 50.0d);
		// equations[1] = new MathEquation('a', 25.0d, 92.0d);
		// equations[2] = new MathEquation('s', 225.0d, 17.0d);
		// equations[3] = new MathEquation('m', 11.0d, 3.0d);
		//
		// for (MathEquation equation : equations) {
		//     equation.execute();
		//     System.out.print("result = ");
		//     System.out.println(equation.getResult());
		// }

		/* ========================================================================== */
		/* L65: DEMO: Method Overloading */
		/* ========================================================================== */
		// System.out.println();
		// System.out.println("Using Overloads");
		// System.out.println();

		// double leftDouble = 9.0d;
		// double rightDouble = 4.0d;

		// MathEquation equationOverload = new MathEquation('d');

		// equationOverload.execute(leftDouble, rightDouble);
		// System.out.print("result = ");
		// System.out.println(equationOverload.getResult());

		// Doing the same thing as above but w/ a widening type cast/conversion
		// int leftInt = 9;
		// int rightInt = 4;

		// equationOverload.execute(leftInt, rightInt);
		// System.out.print("result = ");
		// System.out.println(equationOverload.getResult());

		// Showing how having different types and Java's default casting works
		// equationOverload.execute((double) leftInt, rightInt);
		// System.out.print("result = ");
		// System.out.println(equationOverload.getResult());

		/* ========================================================================== */
		/* L32: DEMO: CalcEngine */
		/* ========================================================================== */
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

		/* ========================================================================== */
		/* L76: DEMO: CalcEngine with Specialized Classes */
		/* ========================================================================== */
		// System.out.println();
		// System.out.println("BLLR?: ——————————————————————————————————————————");
		// System.out.println("BLLR?: USING INHERITANCE");
		// System.out.println("BLLR?: ——————————————————————————————————————————");
		//
		// CalculateBase[] calculators = {
		//     // Calculators! Mount up!
		//     new Divider(100.0d, 50.0d),
		//     new Adder(25.0d, 92.0d),
		//     new Subtractor(225.0d, 17.0d),
		//     new Multiplier(11.0d, 3.0d),
		// };
		//
		// for (CalculateBase calculator : calculators) {
		//     calculator.calculate();
		//     System.out.print("BLLR?: result = ");
		//     System.out.println(calculator.getResult());
		// }
	}
}
