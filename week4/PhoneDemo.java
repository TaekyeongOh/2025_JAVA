package chap04;

class Phone {
	String model;
	int value;

	void print() {
		System.out.println(value + "만 원짜리 " + model + "스마트폰");
	}
}
// model과 value라는 필드와 print() 메서드를 가진 클래스

public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		// Phone 타입의 객체를 생성한 후 myPhone이라는 참조 변수에 대입
		myPhone.model = "iPhone 15pro";
		myPhone.value = 100;
		// 객체 필드에 값을 대입한다.
		myPhone.print();
		// 객체의 메서드를 호출한다.

		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
	}
}
