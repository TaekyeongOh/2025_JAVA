package chap2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요: ");
		int x = in.nextInt();

		System.out.print("두 번째 정수를 입력하세요: ");
		int y = in.nextInt();

		System.out.printf("%d * %d은 %d입니다. \n", x, y, x * y);
	}
}
