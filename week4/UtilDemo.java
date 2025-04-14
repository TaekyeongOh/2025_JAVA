package chap04;

class Util {
	static int fourTimes(int i) { // 정적 메서드
		return i * 4;
	}
}

public class UtilDemo {
	public static void main(String[] args) {
		System.out.println(Util.fourTimes(5)); // 정적 메서드를 호출
	}
}
