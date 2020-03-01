package com.program;

import java.util.Scanner;

/**
 * NumberPrinter
 */
public class NumberPrinter {

  public static void main(final String[] args) {
    final Scanner s = new Scanner(System.in);
    System.out.println("Please input a 5 digit number");
    

    Integer input = s.nextInt();

    s.close();
    
    String numString = input.toString();

    String[] arrOfNums = numString.split("");

    for (String a : arrOfNums) {
      System.out.println(a);
    }
  }
}