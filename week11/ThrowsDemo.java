package chap13;

import java.util.Scanner;

public class ThrowsDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}
	}

	private static void square(String s) throws NumberFormatException {
		// Integer.parseInt()는 입력 문자열이 숫자형식이 아니라 NumberFormatException을 던짐
		int n = Integer.parseInt(s);
		// 정상적으로 정수로 변환되었다면 제곱값을 출력
		System.out.println(n * n);
	}
}
