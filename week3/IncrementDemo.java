package sec03;

public class IncrementDemo {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x : " + x);
		increment(x);
		System.out.println("increment() 메서드를 호출한 후의 x : " + x);
	}

	public static void increment(int n) {
		System.out.println("increment() 메서드를 시작할 때의 n : " + n);
		n++;
		System.out.println("increment() 메서드를 끝날 때의 n : " + n);
	}
}
