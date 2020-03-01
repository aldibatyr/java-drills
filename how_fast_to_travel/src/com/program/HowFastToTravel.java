package com.program;

import java.util.Scanner;

/**
 * HowFastToTravel
 */
public class HowFastToTravel {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("How far is the destination in miles?");
    double distance = s.nextInt();
    
    System.out.print("How long you do you want to travel in hours?");
    double time = s.nextInt();
    s.close();

    double requiredSpeed = distance / time;

    System.out.printf("You'd have to go on an average %f mph", requiredSpeed);
  }
}