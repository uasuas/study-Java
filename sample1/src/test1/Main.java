package test1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 15; i >= 1; i -= 1) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		int count = 0;
		int total = 0;
		for (int i2 = 1; i2 <= 20; i2++) {
			if (i2 % 2 != 0) {
				count += 1;
				total = total + i2;
			}
		}
		System.out.println(count);
		System.out.println(total);
		
		for (int i3 = 1; i3 <= 15; i3++) {
			System.out.print(i3 + " ");
			if (i3 == 15) {
				System.out.print(i3);
			}
		}
		int n[] = new int[25];
		for (int i4 = 0; i4 < 25; i4++) {
			n[i4] = i4 * 8;
			if (i4 <= 12 && i4 % 2 == 0) {
				System.out.println(n[i4] + " ");
			}else if (i4 >=13 && i4 <= 24 && i4 % 2 != 0){
				System.out.println(n[i4] + " ");
			}else{
				System.out.println(n[i4]);
			}
		}
//		Test1クラスの新スタンスの作成
		Test1 t = new Test1();
//		testメソッドを呼び出し
		t.test();
//		testNb にTest1のインスタンス変数keyを代入
		int testNb = t.key;
		if (testNb % 2 == 0) {
			System.out.println(testNb + "(偶数です)");
		}else{
			System.out.println(testNb + "(奇数です)");
		}
		
	}
}
