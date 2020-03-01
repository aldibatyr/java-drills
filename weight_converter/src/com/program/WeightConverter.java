package com.program;

import java.util.Scanner;

/**
 * WeightConverter
 */
public class WeightConverter {


  public static void main(String[] args) {
    Double test = 22.000000;
    System.out.println(test);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input your weight in lbs");
    Double weightInLbs = scanner.nextDouble();
    scanner.close();
    System.out.printf("You weight %f in kgs", weightInLbs / 2.2);
  }
}