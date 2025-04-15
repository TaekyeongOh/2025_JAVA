package week07;

public class Car extends Vehicle {
	String name = "자동차";

	void whoami() {
		System.out.println("나는 자동차");
	}

	static void move() {
		System.out.println("달림");
	}
}
