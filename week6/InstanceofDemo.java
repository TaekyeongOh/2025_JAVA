package week07;

public class InstanceofDemo {
	public static void main(String[] args) {
		Student s = new Student(); // s는 Student 객체
		Person p = new Person(); // p는 Person 객체

		System.out.println(s instanceof Person); // s는 Student 타입이지만, Student extends Person이라면 상속 관게 -> true

		System.out.println(s instanceof Student); // s는 당연히 Student 타입이므로 true

		System.out.println(p instanceof Student); // p는 Person 객체인데, Student를 상속받지 않음

		downcast(s);
	}

	static void downcast(Person p) {
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println("ok, 하향 타입 변환");
		}
	}
}
