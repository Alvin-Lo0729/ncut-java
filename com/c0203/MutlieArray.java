package com.c0203;

public class MutlieArray {

  public static void main(String[] args) {
    int[][] arr11 = {{11, 12}, {21, 22, 23}, {31, 32}};
    for (int i = 0; i < arr11.length; i++) {
      for (int j = 0; j < arr11[i].length; j++) {
        System.out.print(arr11[i][j]+",");
      }
      System.out.println();
    }
  }
//    11,12,
//    21,22,23,
//    31,32,
}
