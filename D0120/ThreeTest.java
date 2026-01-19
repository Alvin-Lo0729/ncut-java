package D0120;

public class ThreeTest {
  public static void main(String[] args) {
    String str = 5 > 3 ? "5大於3" : "5不大於3";
    System.out.println(str);
    String str2 = null;
    if (5 > 3) {
      str2 = "5大於3";
    } else {
      str2 = "5不大於3";
    }
    int a = 11;
    int b = 12;
    System.out.println(a > b ? "a大於b" : (a < b ? "a小於b" : "a等於b"));
  }
}
