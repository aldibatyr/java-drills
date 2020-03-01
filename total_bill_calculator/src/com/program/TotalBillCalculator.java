package com.program;

import java.util.Scanner;

/**
 * TotalBillCalculator
 */
public class TotalBillCalculator {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the bill amount");
    double total = s.nextDouble();
    System.out.println("Enter tax percentage");
    double taxRate = s.nextDouble();
    System.out.println("Enter service charge rate");
    double serviceRate = s.nextDouble();
    s.close();
    double taxAmount = total * (taxRate / 100);
    double serviceChargeAmount = total * (serviceRate / 100);
    double grandTotal = total + taxAmount + serviceChargeAmount;
    System.out.printf("The service charge total is $%f \n The tax amount is $%f \n", serviceChargeAmount, taxAmount);
    System.out.printf("The grand total is $%f", grandTotal);


  }
}