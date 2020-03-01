package com.thinkful.app;

public class ChristmasTreePrinter {
  public static void main(final String[] args) {
    final StringBuffer tree = new StringBuffer();
    tree.append("       *       ");
    tree.append(System.lineSeparator());
    tree.append("      ***      ");
    tree.append(System.lineSeparator());
    tree.append("     *****     ");
    tree.append(System.lineSeparator());
    tree.append("      ***      ");
    tree.append(System.lineSeparator());
    tree.append("     *****     ");
    tree.append(System.lineSeparator());
    tree.append("    *******    ");
    tree.append(System.lineSeparator());
    tree.append("   *********   ");
    tree.append(System.lineSeparator());
    tree.append("      ***      ");
    
    
    System.out.println(tree);
  }
}