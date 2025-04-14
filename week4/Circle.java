package chap04;

class Circle4 {
	double radius;
	String color;

	public Circle4(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public Circle4(double radius) {
		this(radius, "파랑"); // 매개변수가 있는 기존 생성자를 호출한다
	}

	public Circle4(String color) {
		this(10.0, color); // 매개변수가 있는 기존 생성자를 호출한다
	}

	public Circle4() {
		this(10.0, "빨강"); // 매개변수가 있는 기존 생성자를 호출한다
	}

}

// 실행 클래스
public class Circle {
	public static void main(String[] args) {
		Circle4 c1 = new Circle4(10.0);
		Circle4 c2 = new Circle4("red");
		Circle4 c3 = new Circle4();
		Circle4 c4 = new Circle4(20.0, "blue");

		System.out.println("c1: 반지름 = " + c1.radius + ", 색상 = " + c1.color);
		System.out.println("c2: 반지름 = " + c2.radius + ", 색상 = " + c2.color);
		System.out.println("c3: 반지름 = " + c3.radius + ", 색상 = " + c3.color);
		System.out.println("c4: 반지름 = " + c4.radius + ", 색상 = " + c4.color);
	}
}