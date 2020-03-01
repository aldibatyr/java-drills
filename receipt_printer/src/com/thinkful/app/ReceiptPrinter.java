package com.thinkful.app;

public class ReceiptPrinter {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();

    sb.append("Bill");
    sb.append(System.lineSeparator());
    sb.append("-----------------");
    sb.append(System.lineSeparator());
    sb.append("Pizza     $12.99");
    sb.append(System.lineSeparator());
    sb.append("Soda      $1.25");
    sb.append(System.lineSeparator());
    sb.append("Cookies   $2.50");
    sb.append(System.lineSeparator());
    sb.append("SubTotal: $16.74");
    sb.append(System.lineSeparator());
    sb.append("Tax(10%): $1.67");
    sb.append(System.lineSeparator());
    sb.append("Service(15%) $2.51");
    sb.append(System.lineSeparator());
    sb.append("-----------------");
    sb.append(System.lineSeparator());
    sb.append("Total:     $20.92");
    sb.append(System.lineSeparator());
    sb.append("-----------------");


    System.out.println(sb);
  }

}