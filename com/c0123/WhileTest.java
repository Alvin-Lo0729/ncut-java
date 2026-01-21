package com.c0123;

public class WhileTest {

  public static void main(String[] args) {
    // 將條件初始化
    int count = 0;
    // 將條件做判斷
    while (count < 10) {
      System.out.println("count:"+count);
      // 條件變更
      count++;
    }
    System.out.println("while結束!");

//		int count = 0;
//		while (count < 10)
//		{
//			System.out.println("count:" + count);
//			count--;
//		}
//		System.out.println("永遠無法達到的地方");

//    int count = 0;
//
//    while (count < 10);
//
//    {
//      System.out.println("------" + count);
//      count++;
//    }

  }
}
