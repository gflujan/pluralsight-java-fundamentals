package com.pluralsight.calcengine;

/**
 * @author nneurall
 * @created 30-Jul-2020
 */

public class CalculateHelper {
	static final private char ADD_SYMBOL = '+';
	static final private char SUBTRACT_SYMBOL = '-';
	static final private char MULTIPLY_SYMBOL = '*';
	static final private char DIVIDE_SYMBOL = '/';

	MathCommand command;
	double leftValue;
	double rightValue;
	double result;

	public void process(String statement) throws InvalidStatementException {
		// add 1.0 2.0
		String[] parts = statement.split(" ");

		/* ========================================================================== */
		/* L95: DEMO: CalcEngine with Exceptions */
		/* All exceptions related code was added in this portion */
		/* ========================================================================== */
		if (parts.length != 3) {
			throw new InvalidStatementException("Incorrect number of fields", statement);
		}

		String commandString = parts[0]; // add

		try {
			leftValue = Double.parseDouble(parts[1]); // 1.0
			rightValue = Double.parseDouble(parts[2]); // 2.0
		} catch (NumberFormatException err) {
			throw new InvalidStatementException("Non-numberic ;-) data", statement, err);
		}

		setCommandFromString(commandString);

		if (command == null) {
			throw new InvalidStatementException("Invalid command", statement);
		}

		CalculateBase calculator = null;

		switch (command) {
			case Add:
				calculator = new Adder(leftValue, rightValue);
				break;
			case Subtract:
				calculator = new Subtractor(leftValue, rightValue);
				break;
			case Multiply:
				calculator = new Multiplier(leftValue, rightValue);
				break;
			case Divide:
				calculator = new Divider(leftValue, rightValue);
				break;
			default:
				// replace this comment with something
				break;
		}

		calculator.calculate();
		result = calculator.getResult();
	}

	private void setCommandFromString(String commandString) {
		// add -> MathCommand.Add
		if (commandString.equalsIgnoreCase(MathCommand.Add.toString())) {
			command = MathCommand.Add;
		} else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())) {
			command = MathCommand.Subtract;
		} else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
			command = MathCommand.Multiply;
		} else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
			command = MathCommand.Divide;
		} else {
			command = null;
		}
	}

	@Override
	public String toString() {
		// 1.0 + 2.0 = 3.0
		char symbol = ' ';

		switch (command) {
			case Add:
				symbol = ADD_SYMBOL;
				break;
			case Subtract:
				symbol = SUBTRACT_SYMBOL;
				break;
			case Multiply:
				symbol = MULTIPLY_SYMBOL;
				break;
			case Divide:
				symbol = DIVIDE_SYMBOL;
				break;
			default:
				// replace this comment with something
				break;
		}

		StringBuilder sb = new StringBuilder(20);
		sb.append(leftValue);
		sb.append(' ');
		sb.append(symbol);
		sb.append(' ');
		sb.append(rightValue);
		sb.append(" = ");
		sb.append(result);

		return sb.toString();
	}
}
