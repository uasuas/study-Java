package VSC.Java.Java_study;

public class Chapter5 {
  // メソットの呼び出し。178p
  public static void main(String[] args) {
    hello();
    A();
    add(100, 20);
    add(200, 50);
    int ans2 = add2(100, 30);
    System.out.println("100 + 30 = " + ans2);
    // 戻り値をそのまま使う。194p
    // ans=(x+y)+(x+y)
    // ans=(x+y)
    // ans=(1+2)+(2+5)
    // 10=(3+7)結果10が出力される。
    System.out.println(add2(add2(1, 2), add2(2, 5)));
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
  // 戻り値を利用したメソッド呼び出し。192p
  // int add2()になっている点に注意。
  public static int add2(int x, int y) {
    int ans = x + y;
    return ans;
  }
}
