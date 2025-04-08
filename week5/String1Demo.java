package chap05;

public class String1Demo {
	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = "Hi, Java!"; // s1, s2는 같은 내용의 리터럴이므로 동일 객체
		String s3 = new String("Hi, Java!");
		String s4 = new String("Hi, Java!"); // s3, s4는 내용이 같지만 생성자로 생성한 객체 -> 다른 객체

		System.out.println("s1 == s2 -> " + (s1 == s2));
		System.out.println("s1 == s3 -> " + (s1 == s3));
		System.out.println("s3 == s4 -> " + (s3 == s4));

		s1 = s3; // s3이 가리키는 문자열 객체의 참조 값을 s1에 대입함 -> 동일한 string 객체를 가리킴
		System.out.println("s1 == s3 -> " + (s1 == s3));
	}
}
