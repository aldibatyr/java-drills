package com.program;

import java.util.Scanner;

/**
 * MoonWalker
 */
public class MoonWalker {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input your weight in pounds");
    double weightOnEarth = s.nextDouble();
    s.close();

    double weightInKgs = weightOnEarth / 2.2;
    double moonGravityConst = 6.67408E-11;
    double moonMass = 7.35E22;
    double moonRadius = 1735.5E3;
    double earthGravityConst = 9.81;

  }
}