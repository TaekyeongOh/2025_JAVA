package chap05;

public class String5Demo {
	public static void main(String[] args) {
		String version = String.format("%s %d", "JDK", 14); // s는 string, d는 decimal
		System.out.println(version);

		String fruits = String.join(", ", "apple", "banana", "cherry", "durian"); // String.join() : 여러 문자열들을 하나로 합치면서
																					// 중간에 구분자(separator) 를 넣어주는 메서드
		System.out.println(fruits);

		String pi = String.valueOf(3.14); // String.valueOf() : 어떤 값이든 문자열로 바꿔주는 메서드
		System.out.println(pi);
	}
}
