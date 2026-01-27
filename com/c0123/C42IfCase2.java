package com.c0123;

public class C42IfCase2 {

  public static void main(String[] args) {
    int a=5;

    if (a>4)
      System.out.println("aaa");
    else
      System.out.println("Hi");

    if(a>4)
      System.out.println("a>6"); //屬於if的範圍
    else if (a == 4)
      System.out.println("a==4");
    else
      System.out.println("a<6"); //屬於else的範圍
      System.out.println("a小於6"); //屬於一定會做的範圍
//    int c=5;
//    if(c>4)
//      c--;
//      System.out.println("a>6");
//    else
//      System.out.println("a<6");
//    System.out.println("a小於6");
  }
}
