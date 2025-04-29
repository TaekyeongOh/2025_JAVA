package week09;

public interface Controllable {
	default void repair() {
		show("장비를 수리함");
	}

	static void reset() {
		System.out.println("장비를 초기화");
	}

	private void show(String s) {
		System.out.println(s);
	}

	void turnOn();

	void turnOff();
}
