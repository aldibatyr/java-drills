package com.thinkful.app;

import java.math.RoundingMode;

public class DeclaringAndPrintingVars {
  public static void main(final String[] args) {
    Integer temp = 79;
    String first = "highest temperature in June in New York is %d F \n";
    System.out.printf(first, temp);


    String second = "the name of this course is “Java/Spring programming” \n";
    System.out.println(second);

    String third = "the phone number of the bus service is 555-5555";
    System.out.println(third + '\n');

    Double price = 39.98;
    String fourth = "the price of the shoe is $%f \n";
    System.out.printf(fourth, price);

    Double mass = 1.89813E27;
    String fifth = "the mass of the planet Jupiter is %f \n";
    System.out.printf(fifth, mass);


    //  <a href=\"https://www.codecogs.com/eqnedit.php?latex=1.89813&space;\times&space;10^{27}\" target=\"_blank\"><img src=\"https://latex.codecogs.com/gif.latex?1.89813&space;\times&space;10^{27}\" title=\"1.89813 \\times 10^{27}\" /></a> kilograms";

    
    // 
    // System.out.println(third + '\n');
    // System.out.println(fourth + '\n');
    // System.out.println(fifth + '\n');
  }
}