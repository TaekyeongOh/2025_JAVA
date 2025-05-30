package chap13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		// DataOutputStream을 생성한다. data.dat 파일이 없으면 생성
		// DataInputStream을 생성
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Temp\\data.dat"));
				DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Temp\\data.dat"));) {

			// double 데이터, int 데이터, 문자열을 DataOutputStream에 씀
			dos.writeDouble(1.0);
			dos.writeInt(1);
			dos.writeUTF("one");

			dos.flush();

			// double 데이터, int 데이터, 문자열을 DataInputStream에서 읽어서 화면에 출력함
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
		}
	}
}
