package com.pluralsight.getorganized;

public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello Get Organized");

    /* -------------------------------------------------------------------------- */
    /* L23: DEMO: Operator Precedence */
    /* -------------------------------------------------------------------------- */
    // int valA = 21;
    // int valB = 6;
    // int valC = 3;
    // int valD = 1;
    //
    // int result1 = valA - valB / valC;
    // int result2 = (valA - valB) / valC;
    // int result3 = valA / valC * valD + valB;
    // int result4 = valA / (valC * (valD + valB));
    //
    // System.out.println(result1);
    // System.out.println(result2);
    // System.out.println(result3);
    // System.out.println(result4);

    /* -------------------------------------------------------------------------- */
    /* L25: DEMO: Type Conversion */
    /* -------------------------------------------------------------------------- */
    float floatVal = 1.0f;
    double doubleVal = 4.0d;
    byte byteVal = 7;
    short shortVal = 7;
    long longVal = 5;

    short result1a = byteVal; // you can also explicitly cast the `byteVal` to be `(short)`

    short result2a = longVal; // wrong way of doing it
    short result2b = (short) longVal;

    short result3a = byteVal - longVal; // wrong way of doing it
    short result3b = (short) (byteVal - longVal);

    long result4a = longVal - floatVal; // wrong way of doing it
    float result4b = longVal - floatVal;

    float result5a = longVal - doubleVal; // wrong way of doing it
    double result5b = longVal - doubleVal;

    long result6a = shortVal - longVal + floatVal; // wrong way of doing it
    long result6b = shortVal - longVal + floatVal + doubleVal; // wrong way of doing it
    long result6c = (long) (shortVal - longVal + floatVal + doubleVal);

    System.out.println("Success");
  }
}
