package com.program;

import java.util.Scanner;

/**
 * AsTheCrowFlies
 */
public class AsTheCrowFlies {

  public static void main(String[] args) {
    System.out.println(Math.toRadians(34.061489));
    Scanner s = new Scanner(System.in);
    System.out.println("Input first point latitude");
    double latitudeOne = s.nextDouble();
    System.out.println("Input first point longitude");
    double longitudeOne = s.nextDouble();
    System.out.println("Input second point latitude");
    double latitudeTwo = s.nextDouble();
    System.out.println("Input second point longitude");
    double longitudeTwo = s.nextDouble();
    s.close();
    double earthRadius = 6371000;
    double latOneInRad = Math.toRadians(latitudeOne);
    double latTwoInRad = Math.toRadians(latitudeTwo);
    double latDifference = Math.toRadians(latitudeTwo-latitudeOne);
    double lonDifference = Math.toRadians(longitudeTwo - longitudeOne);

    double a = Math.pow(Math.sin(latDifference / 2), 2) + Math.cos(latOneInRad) * Math.cos(latTwoInRad) * Math.pow(Math.sin(lonDifference / 2), 2);
    System.out.println(a);

    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

    System.out.println(c);

    double d = earthRadius * c;

    double distanceInKM = d / 1000;

    System.out.printf("The distance between 2 points is %fkm", distanceInKM);

  }
}