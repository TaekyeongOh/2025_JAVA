package chap04;

class Circle {
	double radius; // 초기화하지 않았으므로 기본값인 0.0이 됨

	double findArea() {
		return 3.14 * radius * radius; // 클래스의 멤버에 접근함. radius 대신에 this.radius를 사용해도 됨
	}

	void show(double x, double y) {
		System.out.printf("반짊 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle myCircle = new Circle(); // 생성자를 호출해 Circle 객체를 생성함
		myCircle.radius = 10.0; // myCircle 객체의 radius 필드를 의미함
		// myCircle.show(myCircle.radius, myCircle.findArea()); // myCircle 객체의 show()와
		// findArea() 메서드를 의미함
		myCircle.show(myCircle.radius, myCircle.findArea());
	}

}
