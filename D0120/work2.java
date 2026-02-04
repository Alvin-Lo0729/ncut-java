package D0120;

import java.util.Scanner;

public class work2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("輸入秒數");
    int totalSecond = scanner.nextInt();

    //算出幾天
    int day = totalSecond / 86400;

    //算出天除完後的餘數
    int day1 = totalSecond % 86400;
    //算出幾小時
    int hour = day1 / 3600;
    //算出小時除完後的餘數
    int hour1 = day1 % 3600;
    //算出幾分
    int m = hour1 / 60;
    //算出幾分之後的餘數就是秒數
    int s = hour1 % 60;

    System.out.print(day + "天");
    System.out.print(hour + "時");
    System.out.print(m + "分");
    System.out.print(s + "秒");
  }
}
