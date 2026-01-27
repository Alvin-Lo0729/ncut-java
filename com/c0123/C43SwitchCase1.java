package com.c0123;

import java.util.Scanner;

public class C43SwitchCase1 {

  /**
   * 這裡是switch case表達式 switch( expression ){ case condition1: 要做的事情 break; case condition2: 要做的事情
   * break; default: 要做的事情 break; }
   *
   * @param args
   */
  public static void main(String[] args) {

    int a = 10;
    //java 8
    switch (a) {
      case 6:
        System.out.println("他等於6");
        break;
      case 5:
        System.out.println("他等於5");
        break;
      default:
        System.out.println("不等於5或6");
        break;
    }

    //星期一跟星期五穿制服 、 星期二穿便服，星期三、星期四體育服
    String day = new Scanner(System.in).next();
    switch (day) {
      case "星期一":
      case "星期五":
        System.out.println("穿制服");
        break;
      case "星期三":
      case "星期四":
        System.out.println("穿體育服");
        break;
      case "星期二":
        System.out.println("穿便服");
        break;
      default:
        System.out.println("放假隨便穿");
        break;
    }

//
    // 以下為新寫法
    a = 6;
    switch (a) {
      case 6 -> {
        System.out.println("他真的大於5");
        System.out.println("bbc");
      }
      case 5 -> {
        System.out.println("他等於5");
      }
      default -> {
        System.out.println("不等於以上數字");
      }
    }

    String grade = "B";
    int score = switch (grade) {
      case "A": {
        System.out.println("100分");
        yield 100;
      }
      case "B":{
        yield 75;
      }
      default: {
        yield 50;
      }
    };
    System.out.println(score);
    int score2 = switch (grade) {
      case "A" -> 100;
      case "B" -> 75;
      default -> 50;
    };
    System.out.println(score2);

//
//
//    Object obj=new String("abc");
//    String result = switch (obj) {
//      case Integer i -> "It is an integer: " + i;
//      case String s  -> "It is a string: " + s;
//      case null      -> "It is null";
//      default        -> "Unknown object";
//    };
  }
}
