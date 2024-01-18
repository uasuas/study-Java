package sample1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		if文
		System.out.println("Hallo World");
		int item1 = 98 * 3;
		int item2 = 168 * 5;
		int total = (item1 + item2) / 2;
		System.out.println((item1 + item2) / 2);
		if (total % 2 == 0){
			System.out.println("偶数です");
		}else{
			System.out.println("奇数です");
		}
//		switch文1
		int btn = 1;
		switch (btn) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		}
//		switch文2
		int btn1 = 1;
		String btnName = switch (btn1) {
		case 1 -> "A";
		case 2 -> "B";
		default -> "Unknown";
		};
		System.out.println(btnName);
		
//		for文
		for (int i = 0; i < 2; i++) {
			System.out.println(i);
		}
		int sum = 0; 
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);
		
//		while文
		int sum1 = 0;
		int i = 0;
		while (sum1 < 1000) {
			i++;
			sum1 += i;
		}
		System.out.println(i);
		
//		do-while文
		int ii = 11;
		do {
			System.out.println("こんにちは");
			ii++;
		} while (ii < 10);

//		メソット定義
		Video v = new Video();
		v.name = "Java基礎";
		v.playCount = 3;
		System.out.println(v.name);
		v.play();
		int count = v.getPlayCount();
		System.out.println(count);
		
//		問１
		for (int i1 = 1; i1 <= 10; i1++) {
			if (i1 % 2 == 0) {
				System.out.println(i1);
			}
		}
//		問2
		int count2 = 0;
		int total2 = 0;
		for (int i2 = 1; i2 <= 10; i2++) {
			if (i2 % 2 == 0) {
				count2 += 1;
				total2 = total2 + i2;
			}
		}
		System.out.println(count2);
		System.out.println(total2);
//		問3
		for (int i3 = 1; i3 <= 10; i3++) {
			String test = String.valueOf(i3);
			if (i3 != 10) {
				System.out.print(test + ",");
			}else{
				System.out.print(test);
			}
		}
//		問4
		int n[] = new int[20];
		for (int i4 = 0; i4 < 20; i4++) {
			n[i4] = i4 * 5;
			if (i4 <= 10 && i4 % 2 != 0) {
				System.out.println(n[i4] + ",");
			}else if(i4 >= 11 && i4 <= 19 && i4 % 2 == 0){
				System.out.println(n[i4] + ",");
			}else{
				System.out.println(n[i4]);
			}
			
		}
		
	}

}
