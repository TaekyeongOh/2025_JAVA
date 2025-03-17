package week3;

import java.util.Scanner;

public class MultiDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();

		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else
			grade = "F";
		System.out.println("당신의 학점 : " + grade);

	}
}
