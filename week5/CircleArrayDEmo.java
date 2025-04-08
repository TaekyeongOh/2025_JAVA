package chap05;

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}
}

public class CircleArrayDEmo {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5]; // Circle 객체 5개 담을 배열 생성

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1.0);
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());
		}
	}
}
