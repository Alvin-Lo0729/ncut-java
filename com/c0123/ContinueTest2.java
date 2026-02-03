package com.c0123;

public class ContinueTest2 {

  public static void main(String[] args) {
    outer:
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i的值为:" + i + "  j的值为:" + j);
        if (j == 1) {
          continue outer;
        }
      }
    }
//    i的值为:0  j的值为:0
//    i的值为:0  j的值为:1
//    i的值为:1  j的值为:0
//    i的值为:1  j的值为:1
//    i的值为:2  j的值为:0
//    i的值为:2  j的值为:1
//    i的值为:3  j的值为:0
//    i的值为:3  j的值为:1
//    i的值为:4  j的值为:0
//    i的值为:4  j的值为:1


  }
}
