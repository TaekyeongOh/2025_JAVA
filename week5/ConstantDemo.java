package chap05;

public class ConstantDemo {
	public static void main(String[] args) {
		final int MALE = 0;
		final int FEMALE = 1;
		final int SOUTH = 1;
		int gender = FEMALE;
		if (gender == MALE)
			System.out.println(MALE + "은(는) 병역 의무가 있다.");
		else
			System.out.println(FEMALE + "은(는) 병역 의무 없다.");

		if (gender == SOUTH)
			System.out.println(SOUTH + "은(는) 누구?");
		gender = 5;
	}
}
