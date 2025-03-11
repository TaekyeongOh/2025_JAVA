package chap2;

public class CastDemo {
	public static void main(String[] args) {
		int i;
		double d;
		byte b;

		i = 7 / 4;
		System.out.println(i);

		// int 값을 double type -> implicit casting
		d = 7 / 4;
		System.out.println(d);

		// explicit casting
		d = 7 / (double) 4;
		System.out.println(d);

//		i=7/(double)4;

//		i = 300;
//		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
//			System.out.println("byte 타입으로 변환할 수 없습니다.");
//		else
//			b = (byte) i;

		i = 300;
		b = (byte) i;
		System.out.println(b);

	}
}
