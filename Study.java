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
  }
}
