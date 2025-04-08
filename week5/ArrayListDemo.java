package chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>(); // integer 타입의 ArrayList 객체를 생성
		int data;
		int sum = 0;

		while ((data = in.nextInt()) >= 0) // 키보드에서 입력된 값이 음수가 아닐 때까지 반복
			scores.add(data); // 데이터를 동적 배열에 추가함

		for (int i = 0; i < scores.size(); i++)
			sum += scores.get(i); // 동적 배열의 i번째 원소를 가져옴

		System.out.println("평균 = " + (double) sum / scores.size()); // score.size()는 동적 배열의 크기 가져옴
	}
}
