package com.c0123;

public class BreakTest2 {

  public static void main(String[] args) {

    outer:
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i的值为:" + i + "  j的值为:" + j);
        if (j == 1) {
          break outer;
        }
      }
    }
    System.out.println("end");
  }
}
