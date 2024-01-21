package test1;

import java.util.Scanner;

public class Test1 {
	public int key;
	public void test() {
		Scanner scanner = new Scanner(System.in);
//		thisをつけることでインスタンス変数であることを明示
		this.key = scanner.nextInt();{
		switch (this.key) {
			case 1:
				System.out.println(this.key + "です");
				break;
			default:
				System.out.println(this.key + "1以外です");
			}
		}
	}

}
