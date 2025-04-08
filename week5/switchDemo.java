package chap05;

public class switchDemo {
	public static void main(String[] args) {
		Gender3 gender = Gender3.여성;

		String s = switch (gender) {
		case 남성 -> " : 병역 의무 있음";
		case 여성 -> " : 병역 의무 없음";
		};

		System.out.println(gender + s);
	}
}

enum Gender3 {
	남성, 여성
}