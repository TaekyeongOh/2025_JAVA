package week13;

public class JoinDemo {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();
		System.out.println("종합 : " + t.total);
	}
}
