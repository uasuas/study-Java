package VSC.Java.Java_study;

public class Study {
  public static void main(String[] args) {
    // 改行。68p
    // ¥nで改行できずoption+¥の\とnで改行になった。
    String name = "名前：testname\n   (テスト)";
    String name2 = """
        名前：testname2
          (テスト２)
        """;
    System.out.println(name);
    System.out.println(name2);

    // ++aとa++の微妙な違い。78p
    int a1 = 10;
    int a2 = 10;
    System.out.println(a1++ + 50); //出力60
    System.out.println(++a2 + 50); //出力61

    // 文字列を整数に変換。92p
    String age = "30";
    int age2 = Integer.parseInt(age);
    System.out.println(age2 + 1);

    // 乱数を発生。93p
    // nextInt(上限値)
    int random = new java.util.Random().nextInt(50);
    System.out.println(random + "歳？");

  }
}
