package chap13;

public class TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			// catch ArrayIndexOutOfBoundsException
			System.out.println("마지막 원소 => " + array[3]);
			// does not have error, but unreachable due to upper error case
			System.out.println("첫 번째 원소 => " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		}
		System.out.println("어이쿠!!");
	}
}
