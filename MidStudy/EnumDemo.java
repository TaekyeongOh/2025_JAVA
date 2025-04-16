package re05;

public class EnumDemo {
	public static void main(String[] args) {
		Direction2 direction = Direction2.LEFT;

		if (direction == Direction2.LEFT)
			System.out.println(Direction2.LEFT + "은(는) 왼쪽");
		else
			System.out.println(Direction2.RIGHT + "은(는) 오른쪾");

		for (Direction2 d : Direction2.values())
			System.out.println(d.name());

		System.out.println(Direction2.valueOf("LEFT"));
	}
}

enum Direction2 {
	LEFT("왼쪽"), RIGHT("오른쪽");

	private String s;

	// 생성자 추가 필요
	Direction2(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}