package VSC.Java.Java_study;

public class Chapter5 {
  // メソットの呼び出し。178p
  public static void main(String[] args) {
    hello();
    A();
    add(100, 20);
    add(200, 50);
  }
  public static void hello() {
    System.out.println("こんにちは");
  }
  // mein外からのメソッドの呼び出し。179p
  public static void A() {
    System.out.println("A");
    B("メソッドB");
  }
  // 引数にて内容を変更する。184p
  public static void B(String name) {
    System.out.println(name + "というメソッドです");
  }
  // intの引数利用。186p
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}
