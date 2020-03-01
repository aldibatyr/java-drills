package com.program;
import java.util.Scanner;
// Using this program as a starting point, write a program that prompts the user for the hourly rate and the total number of hours worked in a week then calculates the weekly salary.

//need an input for hourly rate

//need an input for hours worked

//need to multiply and present total salary

public class SalaryCalculator {
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input your hourly rate");
    Double hourlyRate = scan.nextDouble();
    System.out.println("Great! How many hours you put in last week?");
    Double hours = scan.nextDouble();
    scan.close();

    System.out.printf( "You have earned $%f last week", hourlyRate * hours);
  }
}