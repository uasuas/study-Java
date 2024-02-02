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

    // 拡張for文。157p
    int[] scores4 = {20, 30, 40, 50, 80};
    for (int value : scores4) {
      System.out.println(value);
    }
    
    // 文字列の長さの取得。165p
    String str = "Java開発";
    System.out.println(str.length());

    // 多次元配列。167p
    // [0,0][0,1][0,2]->[40][50][60]
    // [1,0][1,1][1,2]->[80][60][70]
    int[][] scores5 = new int[2][3];
    scores5[0][0] = 40;
    scores5[0][1] = 50;
    scores5[0][2] = 60;
    scores5[1][0] = 80;
    scores5[1][1] = 60;
    scores5[1][2] = 70;
    System.out.println(scores5[1][1]);

    // 練習問題4-1。170p
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];

    // 練習問題4-2。170p
    int[] moneyList = {121902, 8302, 55100};
    for (int i = 0; i < moneyList.length; i++){
      System.out.println(moneyList[i]);
    }
    for (int ans : moneyList){
      System.out.println(ans);
    }

    // 練習問題4-3。171p
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください。");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int i = 0; i < numbers.length; i++){
      if (input == numbers[i]){
        System.out.println("あたり");
        break;
      } else {
        System.out.println("残念");
      }
    }
    for (int answer : numbers){
      if (input == answer){
        System.out.println("あたり");
        break;
      } else {
        System.out.println("残念");
      }
    }
  }
}
