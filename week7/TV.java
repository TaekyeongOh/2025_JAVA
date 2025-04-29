package week09;

public class TV implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("TV 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끔");
	}
}
