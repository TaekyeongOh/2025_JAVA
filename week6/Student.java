package week07;

public class Student extends Person {
	int number = 7;

	@Override
	public void whoami() {
		System.out.println("나는 학생이다.");
	}

	public void work() {
		System.out.println("나는 공부한다.");
	}
}
