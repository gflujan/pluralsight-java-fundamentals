package com.pluralsight.calcengine;

/**
 * @author Gabriel F. Lujan
 * @created 08-Aug-2020
 */

/* ========================================================================== */
/* L95: DEMO: CalcEngine with Exceptions */
/* ========================================================================== */
public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }
}
