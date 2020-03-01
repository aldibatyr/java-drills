package com.madlib;
import java.util.Scanner;

public class MadLibGenerator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a name: ");
    String name = scanner.next();
    System.out.println("Now enter 5 adjectives, hit enter after each adjective");
    String [] adjectives = new String[5];
    for (int i = 0; i < adjectives.length; i++) {
      adjectives[i] = scanner.next();
    }
    System.out.println("Great! now enter a workplace type");
    String workplaceType = scanner.next();
    System.out.println("Good job! Input personal characteristic");
    String personalCharacteristic = scanner.next();
    System.out.println("Interesting! Please input personality trait");
    String personalityTrait = scanner.next();
    System.out.println("Now input a verb");
    String verb = scanner.next();
    System.out.printf("How may we address %s \n", name);
    String pronoun = scanner.next();

    System.out.printf("%s is a person of an %s disposition and is %s in the %s for his %s and the %s of his %s. This circumstance, added to his well-known %s and %s courage, made me very desirous to %s %s.", name, adjectives[0], adjectives[1], workplaceType, adjectives[2], adjectives[3], personalCharacteristic, personalityTrait, adjectives[4], verb, pronoun);
  }


}