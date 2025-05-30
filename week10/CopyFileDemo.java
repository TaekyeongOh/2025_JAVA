package chap13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) {
		String input = "C:\\Temp\\org.txt";
		String output = "C:\\Temp\\dup.txt";

		// org.txt와 dup.txt 파일에 연결된 파일 입출력 스트림을 생성함
		try (FileInputStream fis = new FileInputStream(input); FileOutputStream fos = new FileOutputStream(output)) {
			int c;

			// read() 메서드를 호출해 한 바이트씩 읽고, write() 메서드를 호출해 한 바이트씩 쓴다.
			while ((c = fis.read()) != -1)
				fos.write(c);
		} catch (IOException e) {

		} // try ~ while ~ resource 문이다. 따라서 try()의 괄호 안에 선언된 자원은 try ~ catch문이 끝날 때 자동으로
			// close() 메서드를 호출함
	}
}
