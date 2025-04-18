package sec03;

public class OverloadDemo {
	public static void main(String[] args) {
		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;

		System.out.printf("max(%d, %d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("max(%d, %d, %d) = %d\n", i1, i2, i3, max(i1, i2, i3));
	}

	public static int max(int n1, int n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}

	public static double max(double n1, double n2) {
		if (n1 > n2)
			return n1;
		else
			return n2;
	}

	public static int max(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3)
			return n1;
		else if (n2 > n1 && n2 > n3)
			return n2;
		else
			return n3;
	}

}
