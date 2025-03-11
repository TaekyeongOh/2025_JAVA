package chap2;

import java.util.Scanner;

public class LowerToUpper {
	public static void main(String[] args) {
		int diff = (int) 'a' - (int) 'A';
		char character;

		Scanner in = new Scanner(System.in);
		System.out.print("소문자를 입력하세요 : ");
		character = in.next().charAt(0);

		System.out.printf("대문자 : %c\n", (char) ((int) character - diff));
	}
}
