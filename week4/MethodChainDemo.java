package chap04;

class Person {
	String name;
	int age;

	public Person setName(String name) { // 반환 타입도 동일한 클래스이다.
		this.name = name;
		return this; // 생성된 객체 자신을 반환한다.
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야.");
	}
}

public class MethodChainDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("민국").setAge(21).sayHello(); // 연속 호출
	}
}
