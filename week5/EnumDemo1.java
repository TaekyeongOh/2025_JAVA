package chap05;

public class EnumDemo1 {
	public static void main(String[] args) {
		Gender gender = Gender.FEMALE; // gender라는 변수에 Gender.FEMALE이라는 값을 저장함
		if (gender == Gender.MALE)
			System.out.println(Gender.MALE + "는 병역 의무가 있음");
		else
			System.out.println(Gender.FEMALE + "는 병역 의무 없음");
	}
}

enum Gender {
	MALE, FEMALE
}

enum Direction {
	EAST, WEST, SOUTH, NORTH
}

// enum : 열거형(enumeration) : 미리 정해진 값들의 집합을 만들 떄 사용 -> 타입 안정성 높임, 코드 읽기 쉬움, 실수 줄임