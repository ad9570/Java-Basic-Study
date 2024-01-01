public class Ex14GameUnits {
    public static void main(String[] args) {
		Unit[] group1 = {new Marine(), new Tank(), new Dropship()};

		for (Unit unit : group1) {
			int newX = (int) (Math.random() * 255);
			int newY = (int) (Math.random() * 255);
			unit.move(newX, newY); 	// 순서대로 Marine, Tank, Dropship 객체의 move(newX, newY)를 호출(다형성)
									// Unit 클래스의 move(newX, newY)를 호출하는 것이 아님
		}

		// Object 배열로도 Marine, Tank, Dropship 객체를 다룰 경우 Object에 정의되어 있지 않은 메서드 사용 불가능
//		Object[] group2 = {new Marine(), new Tank(), new Dropship()};
//		
//		for (int i = 0; i < group1.length; i++) {
//			group2[i].move(100, 200);
//		}
    }
}

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		System.out.println("멈춥니다.");
	}
}

@SuppressWarnings("unused")
class Marine extends Unit { // 보병
	void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Marine[x = " + super.x + ", y = " + super.y + "]");
	}

	void stimPack() { /* 스팀팩을 사용한다. */ }
}

@SuppressWarnings("unused")
class Tank extends Unit { // 탱크
	void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Tank[x = " + super.x + ", y = " + super.y + "]");
	}

	void changeMode() { /* 공격모드를 변환한다. */ }
}

@SuppressWarnings("unused")
class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Dropship[x = " + super.x + ", y = " + super.y + "]");
	}

	void load() { /* 선택된 대상을 태운다. */ }

	void unload() { /* 선택된 대상을 내린다. */ }
}