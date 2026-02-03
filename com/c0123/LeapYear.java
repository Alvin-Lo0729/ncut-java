package com.c0123;

import java.util.Scanner;

/**
 * 判斷閏年
 * <p>
 * 閏年的條件:
 * 1. 西元年份能被4整除但不能被100整除
 * 2. 西元年份能被400整除 印出輸入的年份是否為閏年
 */
public class LeapYear {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("幫判斷是不是閏年");
    System.out.print("請輸入西元年份");
    int year = scanner.nextInt();

    if ((year % 400 == 0) ||
        (year % 4 == 0 && year % 100 != 0)) {
      System.out.println(year + "是閏年");
    } else {
      System.out.println(year + "不是閏年");
    }


  }

}
