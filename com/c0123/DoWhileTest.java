package com.c0123;

public class DoWhileTest {

  public static void main(String[] args) {
    int count = 1;
    do {
      System.out.println(count);
      count++;
    } while (count < 10);
    System.out.println("do while结束!");

    int count2 = 20;
    do
      System.out.println(count2++);
    while (count2 < 10);
    System.out.println("do while结束!");
  }
}
