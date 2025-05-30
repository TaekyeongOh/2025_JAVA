package chap13;

import java.io.IOException;

public class IOStreamDemo {
	public static void main(String[] args) throws IOException {
		int b, len = 0;
		int ba[] = new int[100];
		System.out.println("--입력 스트림--");
		// 즐 바꿈 문자가 나올 떄까지 키보드로 입력한 데이터를 정수 변수에 대입
		// 콘솔에서 들어오는 다음 한 바이트를 읽어와서, 그 바이트 값을 int로 반환함
		while ((b = System.in.read()) != '\n') {
			// int 타입을 char 타입으로 변환해야 함
			// %c : (char)b로 변환된 문자 그 자체를 출력
			// %d : b(정수값, 바이트 코드)를 10진수로 출력
			System.out.printf("%c(%d)", (char) b, b);
			ba[len++] = b;
		}
		System.out.println("\n\n--출력 스트림--");
		// 한 바이트씩 입력된 데이터를 출력한다
		for (int i = 0; i < len; i++)
			System.out.write(ba[i]);

		// 버퍼에 남아있는 데이터를 비워 표준 출력 장치로 전송
		// flush() 대신에 주석 처리된 close()도 무방
		System.out.flush();
	}
}
