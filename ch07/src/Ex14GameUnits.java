public class Ex14GameUnits {
	public static void main(String[] args) {
		Unit[] group1 = { new Marine(), new Tank(), new Dropship() };

		for (int i = 0; i < group1.length; i++)
			group1[i].move(100, 200);	// 순서대로 Marine, Tank, Dropship 객체의 move(100, 200)를 호출(다형성)
										// Unit 클래스의 move(100, 200)를 호출하는 것이 아님
		
		// Object 배열로도 Marine, Tank, Dropship 객체를 다룰 경우 Object에 정의되어 있지 않은 메서드 사용 불가능
//		Object[] group2 = { new Marine(), new Tank(), new Dropship() };
//		
//		for (int i = 0; i < group1.length; i++)
//			group2[i].move(100, 200);	
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}