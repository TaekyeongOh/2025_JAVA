package chap05;

public class String3Demo {
	public static void main(String[] args) {
		String s1 = new String("Hi,");
		String s2 = new String(" Java");

		System.out.println("문자열 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1)); // s1의 1번 인덱스, 즉 두 번째 문자를 반환함

		s1 = s1.concat(s2); // concat() : 두 문자열을 결함하는 매서드

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!");
		System.out.println(s1.substring(4, 8) + "!");

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-* ";
		System.out.println(s5.repeat(10));

		System.out.println(s2.trim().indexOf("v")); // trim() 메서드 : 문자열의 앞뒤 공백을 제거하는 메서드
	}

}
