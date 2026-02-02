package com.c0203;


import java.util.Arrays;

public class Arrays3 {

  public static void main(String[] args) {
    String[] strings = new String[]{"你", "好", "阿"};
    for (int i = 0; i < strings.length; i++) {
      System.out.println("strings[" + i + "]:" + strings[i]);
    }
    for (String s : strings) {
      System.out.println("s:" + s);
    }

  }

}
