package chap2;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		double w, h, area;
		Scanner in = new Scanner(System.in);

		System.out.print("너비를 입력하세요 : ");
		w = in.nextDouble();

		System.out.print("높이를 입력하세요 : ");
		h = in.nextDouble();

		area = w * h;
		System.out.printf("직사각형의 넓이 : %f", area);
	}
}
