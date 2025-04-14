package chap04;

class Circle3 {
	private double radius; // 필드를 외부로부터 은닉함

	public double getRadius() { // 접근자
		return radius;
	}

	public void setRadius(double r) { // 설정자
		this.radius = r;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

public class CircleDemo2 {
	public static void main(String[] args) {
		Circle3 myCircle = new Circle3();

		myCircle.setRadius(12.0);

		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}
}
