package re05;

public class ConstantDemo {
	public static void main(String[] args) {
//		final int left =0;
//		final int right=1;
//		final int south=0;
//		
//		int direction = left;
//		if(direction == left)
//			System.out.println(left+"은(는) 왼쪽");
//		else
//			System.out.println(right+"은(는) 오른쪽");
//		if(direction==south)
//			System.out.println(south + "은(는) 어느 쪽?");
//		direction=5;

		// enumDemo
		Direction direction = Direction.LEFT;
		if (direction == Direction.LEFT)
			System.out.println(Direction.LEFT + "은(는) 왼쪽");
		else
			System.out.println(Direction.RIGHT + "은(는) 오른쪽");

		FourDirection Fdirection = FourDirection.EAST;
		if (Fdirection == FourDirection.SOUTH)
			System.out.println(Fdirection.SOUTH + "은(는) 남쪽");
		else if (Fdirection == FourDirection.NORTH)
			System.out.println(Fdirection.NORTH + "은(는) 북쪽");
		else if (Fdirection == FourDirection.WEST)
			System.out.println(Fdirection.WEST + "은(는) 서쪽");
		else
			System.out.println(Fdirection.EAST + "은(는) 동쪽");
	}
}

enum Direction {
	LEFT, RIGHT
}

enum FourDirection {
	EAST, WEST, SOUTH, NORTH
}
