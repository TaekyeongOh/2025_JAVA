package week13;

public class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print("잘 가.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}