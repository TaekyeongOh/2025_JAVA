package week07;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + "공이다.");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(pi*radius*radius)이다");
	}

	@Override
	public void findArea() {
		findRadius();
		super.findArea();
		System.out.println("넓이는 4*(pi*radius*radius)이다.");

	}
}