package re06;

public class Car extends Vehicle {
	String name = "자동차";

	void whoami() {
		System.out.println("나는 자동차임");
	}

	static void move() {
		System.out.println("달리다");
	}
}
