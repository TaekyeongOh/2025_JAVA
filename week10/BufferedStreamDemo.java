package chap13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
	public static void main(String[] args) {
		// start, end, duration은 복사에 걸리는 시간을 나노초 단위로 측정하기 위한 변수
		long start, end, duration;
		String org = "C\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		String dst = "C:\\Temp\\iexplore1.exe";

		// 시작 시각 기록
		start = System.nanoTime();
		// FileInputStream과 BufferedInputStream을 연결한 입력 스트림을 생성
		// FileOutputStream과 BufferedOutputStream을 연결한 출력 스트림을 생성
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(org));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst));) {
			while (bis.available() > 0) {
				// 버퍼에서 한 바이트 읽기
				int b = bis.read();
				// 버퍼에 한 바이트 기록
				bos.write(b);
			}
			bos.flush(); // 버퍼 지우기
		} catch (IOException e) {
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용한 경우 : " + duration);

		// 버퍼 미사용 복사

		start = System.nanoTime();
		// FileInputStream을 생성함
		// FileOutputStream을 생성함
		try (FileInputStream fis = new FileInputStream(org); FileOutputStream fos = new FileOutputStream(dst);) {
			while (fis.available() > 0) { // 버퍼가 없기 때문에, read()와 write()가 매번 OS를 호출해 훨씬 많은 오버헤드가 발생
				int b = fis.read();
				fos.write(b);
			}
			fos.flush();
		} catch (IOException e) {
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용하지 않은 경우 : " + duration);
	}
}