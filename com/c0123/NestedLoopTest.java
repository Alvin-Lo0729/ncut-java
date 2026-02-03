package com.c0123;

public class NestedLoopTest {

  public static void main(String[] args) {


    for (int i = 1; i <= 3; i++) {
      System.out.println("外層循環第 " + i + " 次開始");
      for (int j = 1; j <= 2; j++) {

        System.out.println("  内層循環第 " + j + " 次");
      }
      System.out.println("外層循環第 " + i + " 次结束");
    }
    System.out.println("所有循环结束!");
  }
//  外层循环第 1 次开始
//  内层循环第 1 次
//  内层循环第 2 次
//  外层循环第 1 次结束
//  外层循环第 2 次开始
//  内层循环第 1 次
//  内层循环第 2 次
//  外层循环第 2 次结束
//  外层循环第 3 次开始
//  内层循环第 1 次
//  内层循环第 2 次
//  外层循环第 3 次结束
//  所有循环结束!

}
