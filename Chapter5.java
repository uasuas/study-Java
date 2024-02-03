package VSC.Java.Java_study;

public class Chapter5 {
  // メソットの呼び出し。178p
  public static void main(String[] args) {
    hello();
    A();
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
}
