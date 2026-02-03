package com.c0123;

/**
 * 判斷閏年
 * <p>
 * 閏年的條件: 1. 西元年份能被4整除但不能被100整除 2. 西元年份能被400整除 印出輸入的年份是否為閏年
 */
public class LeapYear2 {

  /**
   * 請使用for迴圈印出西元0年至2024年之間的 所有閏年
   *
   * @param args
   */
  public static void main(String[] args) {

    int fifthLeapYear=0;

    for (int i = 0,count=0; i <= 2024; i++) {
      if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
        System.out.println("今年" + i + "是閏年");
        count++;
        if(count==5){
          fifthLeapYear=i;
         break;
        }
      }
    }
    System.out.println("第5個閏年是:"+fifthLeapYear);

  }
}
