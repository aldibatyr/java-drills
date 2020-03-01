package com.program;

import java.util.Scanner;

/**
 * ChangeMaker
 */
public class ChangeMaker {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Input amount in dollars and cents");

    Double amountDouble = s.nextDouble() * 100;
    Integer amount = amountDouble.intValue();


    s.close();

    Integer[] coins = new Integer[] { 10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1 };
    Integer[] change = new Integer[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    // calculations
    int counter = 0;
    for (int coin : coins) {
      if (amount > coin) {
        int rem = amount % coin;
        int temp = amount - rem;
        change[counter] = temp/coin;
        amount = rem;
      } else if (amount % coin == 0) {
        change[counter] = amount / coin;
        break;
      }
      counter ++;
    }

    for (int i = 0; i < change.length; i++) {
      System.out.println(change[i]);
    }
    

  }
}