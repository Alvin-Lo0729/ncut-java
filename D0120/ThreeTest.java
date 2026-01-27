package D0120;

import java.time.LocalDate;

public class ThreeTest {

  //(expression)? if-true-statement:if-false-statement
  public static void main(String[] args) {
    String str = 5 > 3 ? "5不大於3" : "5大於3";
    LocalDate today = LocalDate.now();
    //有效期限
    LocalDate validate = LocalDate.of(2005, 01, 01);

    String isOverValidate = today.isBefore(validate) ? "還未過期" : "已過期";

    System.out.println(str);

    String str2;
    if (5 > 3) {
      str2 = "5大於3";
    } else {
      str2 = "5不大於3";
    }
    System.out.println("str2:" + str2);
    int a = 11;
    int b = 12;
    System.out.println(a > b ? "a大於b" : (a < b ? "a小於b" : "a等於b"));
  }
}
