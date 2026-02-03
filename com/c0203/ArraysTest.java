package com.c0203;

import java.util.Arrays;

public class ArraysTest {

  public static void main(String[] args) {

    int[] a = new int[]{3, 4, 5, 6};

    int[] a2 = new int[]{3, 4, 5, 6};

    System.out.println("a陣列和a2陣列是否相等：" + Arrays.equals(a, a2));

    int[] b = Arrays.copyOf(a, 4);
    System.out.println(a == b);
    System.out.println("a陣列和b陣列是否相等：" + Arrays.equals(a, b));

    System.out.println("b陣列的元素为：" + Arrays.toString(b));
//    b陣列的元素为：[3, 4, 1, 1]
    Arrays.fill(b, 2, 4, 1);

    System.out.println("b陣列的元素为：" + Arrays.toString(b));
//    b陣列的元素为：[1, 1, 3, 4]
    Arrays.sort(b);

    System.out.println("b陣列的元素为：" + Arrays.toString(b));
  }
}
