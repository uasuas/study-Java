package VSC.Java.Java_study;

public class Chapter4 {
  public static void main(String[] args) {
    // 配列の作成手順。144p
    // 短縮前
    // int[] scores;
    // intの要素を5つ作成
    // scores = new int[5];
    // 短縮型
    int[] scores = new int[5];
    // 配列の要素数を取得
    int num = scores.length;
    scores[1] = 30; 
    System.out.println(num + scores[1]);

    // 配列の作成と初期値。147p
    int[] scores1 = {10, 20, 30, 40, 50};
    System.out.println(scores1[2]);

    // 平均の算出。148p
    int[] scores2 = {20, 30, 50, 100, 100};
    int sum = scores2[0] + scores2[1] + scores2[2] + scores2[3] + scores2[4];
    int avg = sum / scores2.length;
    System.out.println("平均:" + avg);

    // 配列とfor。150p
    int[] scores3 = {20, 30, 40, 60, 100};
    for (int i = 0; i < scores3.length; i++){
      System.out.println(scores3[i]);
    }

    // DNAの記号をランダムに表示。154p
    int[] random = new int[10];
    for (int i = 0; i < random.length; i++){
      random[i] = new java.util.Random().nextInt(4);
    }
    // cherは''を使う
    // char[] dna = {'A', 'T', 'G', 'C'};
    // Stringは""を使う
    String[] dna = {"A", "T", "G", "C"};
    for (int i = 0; i < random.length; i++){
      // dnaの中から[random[ランダムに生成された整数]]の数値に対応する文字列を取得
      System.out.print(dna[random[i]] + " ");
    }

  }
}
