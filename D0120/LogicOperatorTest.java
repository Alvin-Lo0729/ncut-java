package D0120;

public class LogicOperatorTest {

  public static void main(String[] args) {
    int money = 50;
    int productPrice = 100;
    if (money > productPrice) {
      System.out.println("飲料機要調飲料出來");
    } else {
      System.out.println("金額不足");
    }

    System.out.println(!false);
    System.out.println(fun2ReturnFalse() && fun1ReturnTrue());
    System.out.println("===================");
    System.out.println(fun2ReturnFalse() || fun1ReturnTrue());
    System.out.println("===================");
    System.out.println(5 < 3 && '6' > 10);
    System.out.println(4 >= 5 || 'c' > 'a');
    System.out.println(4 >= 5 ^ 'c' > 'a');

    int a = 5;
    int b = 10;
    if (a > 4 | b++ > 10) {
      System.out.println("a的值是:" + a + "，b的值是:" + b);
    }

//    int c = 5;
//    int d = 10;
//    if (c > 4 || d++ > 10) {
//      System.out.println("c的值是:" + c + "，d的值是:" + d);
//    }

  }

  public static boolean fun1ReturnTrue() {
    System.out.println("fun1 有執行");
    //這個方法只是單純判斷
    return true;
  }

  public static boolean fun2ReturnFalse() {
    System.out.println("fun2 有執行");
    //將資料塞進資料庫
    return false;
  }
}
