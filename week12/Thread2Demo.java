package week13;

public class Thread2Demo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("잘 가.");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		}).start();

		for (int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
