package re06;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " 공임");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*pi*r*r 이다");
	}

	public void findArea() {
		System.out.println("넓이는 ~~ 임");
	}
}
