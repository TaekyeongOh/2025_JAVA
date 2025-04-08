package chap05;

public class MainArgumentDemo {
	public static void main(String[] args) {
		if (args.length == 2) { // 인자 2개를 받으면 숫자 저장
			int i = Integer.parseInt(args[1]);
			nPrintln(args[0], i);
		} else // 인자 2개 못 받으면 '어이쿠!' 실행
			System.out.println("어이쿠!");
	}

	public static void nPrintln(String s, int n) {
		for (int i = 0; i < n; i++)
			System.out.println(s); // 문자열 s를 n번 반복해서 출력
	}
}
