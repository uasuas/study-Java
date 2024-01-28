package VSC.Java.Java_study;

public class Study {
  public static void main(String[] args) {
    // 改行。68p
    // ¥nで改行できずoption+¥の\とnで改行になった。
    String name = "名前:testname\n   (テスト)";
    String name2 = """
        名前:testname2
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

    // 入力受付。94p
    // 文字列の入力受付
    // String inputString = new java.util.Scanner(System.in).nextLine();
    // System.out.println("入力値は：" + inputString);
    // // 整数の入力受付
    // int inputInt = new java.util.Scanner(System.in).nextInt();
    // System.out.println("入力値は：" + inputInt);

    // 練習問題2-3。98p
    String text1 = """
        ようこそ占いの館へ
        ↓あなたの名前を入力してください
        """;
    System.out.print(text1);
    String inputname = new java.util.Scanner(System.in).nextLine();
    String text2 = "あなたの年齢を入力してください＞";
    System.out.print(text2);
    String inputage = new java.util.Scanner(System.in).nextLine();
    int conversionage = Integer.parseInt(inputage);
    int fortune = new java.util.Random().nextInt(3);
    fortune++;
    String text3 = "占いの結果が出ました。\n"
     + conversionage + "歳の" + inputname + "さん、あなたのラッキーナンバーは" + fortune + "です。";
    System.out.print(text3);
  }
}
