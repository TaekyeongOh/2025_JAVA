package week09;

interface Movable {
	void move(int x);
}

class Car implements Movable {
	private int pos = 0;

	public void move(int x) {
		pos += x;
	}

	public void show() {
		System.out.println(pos + "m 이동했음");
	}
}
