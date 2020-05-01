package com.pluralsight.getorganized;

public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello Get Organized");

    int valA = 21;
    int valB = 6;
    int valC = 3;
    int valD = 1;

    int result1 = valA - valB / valC;
    int result2 = (valA - valB) / valC;
    int result3 = valA / valC * valD + valB;
    int result4 = valA / (valC * (valD + valB));

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
  }
}
