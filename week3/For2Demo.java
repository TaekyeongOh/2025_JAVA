package sec03;

public class For2Demo {
	public static void main(String[] args) {
		for (int column = 2; column < 10; column++) {
			for (int row = 1; row < 10; row++) {
				System.out.printf("%4d", row * column);
			}
			System.out.println();
		}
	}
}
