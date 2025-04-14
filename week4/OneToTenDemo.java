package chap04;

public class OneToTenDemo {
	static int sumOneToTen;

	static { // 정적 블록으로 정적 변수를 초기화함
		int sum = 0;
		for (int i = 1; i < 11; i++)
			sum += i;
		sumOneToTen = sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOneToTen);
	}
}
