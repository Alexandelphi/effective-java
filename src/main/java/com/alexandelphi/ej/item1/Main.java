package com.alexandelphi.ej.item1;


/**
 * Item 1: Consider static factory methods instead of constructors
 *
 * examples:
 *     Object newArray = Array.newInstance(classObject, arrayLen);
 *     BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
 *     BufferedReader br = Files.newBufferedReader(path);
 */

public class Main {

  public static Boolean valueOf(boolean value) {
    return value ? Boolean.TRUE : Boolean.FALSE;
  }

  public static void main(String[] args) {
    System.out.println(valueOf(true));
  }
}
