package com.c0123;

/**
 * FizzBuzz
 * <p>
 * 用for從0計數到100 遇到可以被3整除的印出 Fizz 遇到可以被5整除的印出 Buzz 遇到可以被3跟5整除的印出 FizzBuzz
 */
public class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("Fizz Buzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      }
    }
  }
}
