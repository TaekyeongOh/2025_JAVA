package week07;

public class One {
	private int secret = 1; // 같은 클래스에서만 접근 가능
	int roommate = 2; // 같은 패키지
	protected int child = 3; // 같은 패키지 또는 자식 클래스에서만
	public int anybody = 4; // 어디서나 접근 가능

	public void show() {
	}
}