package chap2;

public class PrintfDemo {
	public static void main(String[] args) {
		int i = 97;
		String s = "Java";
		double f = 3.14f;

		System.out.printf("%d\n", i); // 97 (10진수)
		System.out.printf("%o\n", i); // 141 (8진수)
		System.out.printf("%x\n", i); // 61 (16진수)
		System.out.printf("%c\n", i); // 'a' (ASCII 문자)

		System.out.printf("%5d\n", i); // " 97" (5자리 확보, 오른쪽 정렬)
		System.out.printf("%05d\n", i); // "00097" (5자리 확보, 빈 자리 0으로 채움)

		System.out.printf("%s\n", s); // "Java"
		System.out.printf("%5s\n", s); // " Java" (5자리 확보, 오른쪽 정렬)
		System.out.printf("%-5s\n", s); // "Java " (5자리 확보, 왼쪽 정렬)

		System.out.printf("%f\n", f); // "3.140000" (기본 소수점 6자리)
		System.out.printf("%e\n", f); // "3.140000e+00" (지수 표현)
		System.out.printf("%4.1f\n", f);// " 3.1" (4자리 확보, 소수점 1자리)
		System.out.printf("%0.4f\n", f);// "3.1400" (소수점 4자리)
		System.out.printf("%-4.1f\n", f);// "3.1 " (4자리 확보, 왼쪽 정렬)
	}
}
