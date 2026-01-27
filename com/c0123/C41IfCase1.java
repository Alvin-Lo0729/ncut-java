package com.c0123;

import java.util.Scanner;

public class C41IfCase1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("請輸入你的華語課程成績");
    int mandarinScore = scanner.nextInt();

    if (mandarinScore>60) {
      //這裡可以輸入要做的事情
    }

    if (mandarinScore > 90) {
      System.out.println("你真棒");
    }else{
      System.out.println("你是不是被當掉了?");
    }


    if( mandarinScore >=90){
      System.out.println("你真棒");
    }else if( mandarinScore>=80){
      System.out.println("讚喔");
    }else if( mandarinScore>=70){
      System.out.println("還可以");
    }else if( mandarinScore>=60){
      System.out.println("低空飛過");
    }else{
      System.out.println("洗洗睡?");
    }

    if( mandarinScore >=90){
      System.out.println("你真棒");
    }else if( mandarinScore>=80){
      System.out.println("讚喔");
    }else if( mandarinScore>=70){
      System.out.println("還可以");
    }else if( mandarinScore>=60){
      System.out.println("低空飛過");
    }

  }

}
