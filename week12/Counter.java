package week13;

class Counter extends Thread {
	private int count = 0;

	public Counter(String name) {
		setName(name);
	}

	public void run() {
		while (count++ < 5) {
			System.out.print(getName() + " -> ");
			try {
				sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
