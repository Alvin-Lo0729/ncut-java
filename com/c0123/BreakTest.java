package com.c0123;

public class BreakTest {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.println("i的值是" + i);
      if (i == 2) {
        break;
      }
      System.out.println("continue后的输出语句");
    }
//    i的值是0
//        continue后的输出语句
//    i的值是1
//        continue后的输出语句
//    i的值是2
  }
}
