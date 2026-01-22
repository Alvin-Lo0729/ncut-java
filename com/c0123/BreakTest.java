package com.c0123;

public class BreakTest {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.println("i的值是" + i);
      if (i == 2) {
        break;
      }
    }
  }
}
