package VSC.Java.Java_study;

public class Study {
  public static void main(String[] args) {
    // ¥nで改行できずoption+¥の\とnで改行になった。
    String name = "名前：testname\n   (テスト)";
    String name2 = """
        名前：testname2
          (テスト２)
        """;
    System.out.println(name);
    System.out.println(name2);

    // ++aとa++の微妙な違い。
    int a1 = 10;
    int a2 = 10;
    System.out.println(a1++ + 50); //出力60
    System.out.println(++a2 + 50); //出力61
  }
}
