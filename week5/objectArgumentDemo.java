package chap05;

public class objectArgumentDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1); // 객체의 참조값을 전달받음
		System.out.println("원(c1)의 반지름 : " + c1.radius);

		zero(c2.radius); // double -> 기본형 / 숫자만 전달
		System.out.println("원(c2)의 반지름 : " + c2.radius);
	}

	public static void zero(Circle c) {
		c.radius = 0.0; // 실제 c1 객체의 radius가 0.0으로 바뀜
	}

	public static void zero(double r) {
		r = 0.0; // 원본 변화 없음
	}

}
