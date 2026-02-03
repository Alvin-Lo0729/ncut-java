package com.c0123;

public class ContinueTest {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.println("i的值是" + i);
      if (i == 1) {
        continue;
      }
      System.out.println("continue后的输出语句");
    }

//    i的值是0
//        continue后的输出语句
//    i的值是1
//    i的值是2
//      continue后的输出语句
  }
}
