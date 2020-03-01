package com.program;

import java.util.Scanner;

/**
 * TemperatureConversion
 */
public class TemperatureConversion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the temp in Celsius?");

    double cTemp = scanner.nextDouble();
    scanner.close();

    double fTemp = (cTemp * 1.8) + 32;

    System.out.printf("If it is %f degrees in C then it is %f in F", cTemp, fTemp);


  }
}