package VSC.Java.Java_study;

public class Chapter5 {
  // メソットの呼び出し。178p
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
  // returnはメソッドの終了も行う点に注意。
  public static int add2(int x, int y) {
    int ans = x + y;
    return ans;
  }
  // オーバーロード。198p
  public static int add3(int x, int y) {
    return x + y;
  }
  public static double add3(double x, double y) {
    return x + y;
  }
  public static String add3(String x, String y) {
    return x + y;
  }
  // オーバーロードの引数の数が違う場合。198p
  public static int add3(int x, int y, int z) {
    return x + y + z;
  }
  // 配列を引数で渡す。200p
  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }
  public static void array() {
    int[] array = {1, 2, 3};
    printArray(array);
  }
  // 参照渡し。202p
  // 仕様：変数の置いてある場所を渡す。
  // 特徴：変数の中身を書き換えると呼び出し元の変数の中身も書き変わる。
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void array2() {
    int[] array = {1, 2, 3};
    incArray(array);
    // 書き換わっていることの確認。
    printArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
  // 戻り値が配列。204p
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
  public static void array3() {
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(array[i]);
    }
  }
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
    // オーバーロード
    System.out.println(add3(1, 2));
    // 結果が3.3000000000000003となるのは、浮動小数点数の丸め誤差によるもので、
    // Javaのdouble型は、浮動小数点数を近似して表現している。
    // そのため、計算結果が完全に正確な値になることは稀で、小数点以下の桁数が正確でない場合がある。
    System.out.println(add3(1.1, 2.2));
    System.out.println(add3("Hallo", "World"));
    // オーバーロードの引数の数が違う場合。198p
    System.out.println(add3(100, 20, 30));
    // 配列を引数で渡す。200p
    array();
    // 参照渡し。202p
    array2();
    // 戻り値が配列。204p
    array3();
  }
}
