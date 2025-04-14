package chap04;

class Circle5 {
	double radius; // 개별 객체가 가지는 반지름
	static int numOfCircles = 0; // 정적 변수 (모든 객체가 공유)
	int numCircles = 0; // 각 객체별로 개별적으로 존재하는 변수

	public Circle5(double radius) {
		this.radius = radius;
		numOfCircles++; // 객체를 생성할 때마다 하나씩 증가한다. (모든 객체가 공유하는 변수)
		numCircles++; // 객체를 생성할 때 하나씩 증가하지만, 객체마다 별도의 기억 공간을 사용하기 때문에 항상 0에서 증가한다.
	}
}

public class CircleDemo3 {
	public static void main(String[] args) {
		Circle5 myCircle = new Circle5(10.0);
		Circle5 yourCircle = new Circle5(5.0);

		// print(); // main() 메서드는 정적 메서드이므로 인스턴스 메서드를 호출할 수 없다
		System.out.println("원의 개수 : " + Circle5.numOfCircles); // 정적변수는 클래스명으로 접근 가능
		System.out.println("원의 개수 : " + yourCircle.numCircles); // 개별 객체의 인스턴스 변수 값
	}

	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}
}
