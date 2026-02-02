package com.c0203;

import java.util.Arrays;

public class Num2Ntd {

  private final String[] hanArr = {"零", "壹", "貳", "參", "肆", "伍", "陸", "柒", "捌", "玖"};
  private final String[] unitArr = {"十", "佰", "仟"};

  /**
   *
   *
   * @param num
   * @return
   */
  private String[] divide(double num) {
    long zheng = (long) num;

    long xiao = Math.round((num - zheng) * 100);
    return new String[]{zheng + "", String.valueOf(xiao)};
  }

  /**
   *
   *
   * @param numStr
   * @return
   */
  private String toHanStr(String numStr) {
    String result = "";
    int numLen = numStr.length();
    for (int i = 0; i < numLen; i++) {
      int num = numStr.charAt(i) - 48;
      if (i != numLen - 1 && num != 0) {
        result += hanArr[num] + unitArr[numLen - 2 - i];
      }
      // 否则不要添加单位
      else {
        result += hanArr[num];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Num2Ntd nr = new Num2Ntd();
    // 测试把一个浮点数分解成整数部分和小数部分
    System.out.println(Arrays.toString(nr.divide(236711125.123)));
    // 测试把一个四位的数字字符串变成汉字字符串
    System.out.println(nr.toHanStr("609"));
  }
}
