package com.c0123;

public class C43SwitchCase1 {

  /**
   * 這裡是switch case表達式
   * switch( expression ){
   * case condition1:
   *  要做的事情
   *  break;
   * case condition2:
   *  要做的事情
   *  break;
   * default:
   *  要做的事情
   *  break;
   * }
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
      default: {
        System.out.println("不等於5或6");
        break;
      }
    }

    // 以下為新寫法
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
      default: {
        yield 50;
      }
    };
    System.out.println(score);
    int score2 = switch (grade) {
      case "A" -> 100;
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
