package com.c0203;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest2 {

  public static void main(String[] args) {
    int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};

    // 對陣列arr1進行多執行緒排序
    Arrays.parallelSort(arr1);
    System.out.println(Arrays.toString(arr1));

    int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
    Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
      public int applyAsInt(int left, int right) {
        System.out.println("left: " + left + ", right: " + right);
        return left * right;
      }
    });
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = new int[5];

    System.out.println(Arrays.toString(arr3));
    Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
      public int applyAsInt(int operand) {
        System.out.println("operand: " + operand);
        return operand * 5;
      }
    });
    System.out.println(Arrays.toString(arr3));
  }
}
