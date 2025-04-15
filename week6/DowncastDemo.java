package week07;

public class DowncastDemo {
	public static void main(String[] args) {
//		Student2 s1 = new Student2();
//		Person2 p = s1;
//		Student2 s2 = (Student2) p;
		Person2 p = new Student2();
		Student2 s2 = (Student2) p;
		s2.work();
	}
}
