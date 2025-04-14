package chap04;

class Circle2 { // 생성자를 선언했기 때문에 디폴트 생성자를 자동으로 추가하지 않음
	double radius;
	String color;

	public Circle2(double r, String c) { // 생성자1 : 임의의 반지름과 색상을 가진 객체 생성자
		radius = r;
		color = c;
	}

	public Circle2(double r) { // 생성자2 : 파랑 객체 생성자임
		radius = r;
		color = "파랑";
	}

	public Circle2(String c) { // 생성자3 : 반지름이 10.0인 객체 생성자
		radius = 10.0;
		color = c;
	}

	public Circle2() { // 생성자4 : 반지름이 10.0인 빨강 객체를 생성하는 디폴트 생성자
		radius = 10.0;
		color = "빨강";
	}
}

public class CircleDemo1 {
	public static void main(String[] args) {
		Circle2 c1 = new Circle2(10.0, "빨강"); // 생성자1을 호출
		Circle2 c2 = new Circle2(5.0); // 생성자2를 호출
		Circle2 c3 = new Circle2("노랑"); // 생성자3을 호풀
		Circle2 c4 = new Circle2(); // 생성자4 호출

		System.out.println("c1: 반지름 = " + c1.radius + ", 색상 = " + c1.color);
		System.out.println("c2: 반지름 = " + c2.radius + ", 색상 = " + c2.color);
		System.out.println("c3: 반지름 = " + c3.radius + ", 색상 = " + c3.color);
		System.out.println("c4: 반지름 = " + c4.radius + ", 색상 = " + c4.color);
	}
}