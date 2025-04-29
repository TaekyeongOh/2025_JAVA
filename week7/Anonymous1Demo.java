package week09;

public class Anonymous1Demo {
	Bird e = new Bird() {
		public void move() {
			System.out.println("독수리 날아.");
		}

		void sound() {
			System.out.println("휘이");
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move();
	}
}
