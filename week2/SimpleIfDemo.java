package week3;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		// 숫자 입력
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		// number 정의
		int number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("짝수!");
		if (number % 2 == 1)
			System.out.println("홀수!");
		System.out.println("종료");
	}
}
