package week09;

public class MemberDemo {
	class Eagle extends Bird {
		public void move() {
			System.out.println("독수리 날아감");
		}

		public void sound() {
			System.out.println("휘이");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();
		m.e.sound();
	}
}
