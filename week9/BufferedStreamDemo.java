import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
	public static void main(String[] args) {
		long start, end, duration;
		String org = "C\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		String dst = "C:\\Temp\\iexplore1.exe";

		start = System.nanoTime();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(org));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst));) {
			while (bis.available() > 0) {
				int b = bis.read();
				bos.write(b);
			}
			bos.flush();
		} catch (IOException e) {
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용한 경우 : " + duration);
	}
}