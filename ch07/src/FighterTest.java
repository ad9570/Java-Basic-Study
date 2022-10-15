//abstract class Unit {
//	int x, y;
//	abstract void move(int x, int y);
//	void stop() {
//		System.out.println("멈춥니다.");
//	}
//}

interface Fightable {
	// 인터페이스 메서드의 접근 제어자는 public
	void move(int x, int y);	// public abstract void move(int x, int y);
	void attack(Fightable f);	// public abstract void attack(Fightable f);
}

class Fighter extends Unit implements Fightable {
	// 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안 된다.
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	Fightable getFightable() {
		return new Fighter();	// Fighter를 생성해서 반환
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
		
		Unit u = new Fighter();
		u.move(100, 200);
//		u.attack(new Fighter());	// Unit에는 attack()이 없어서 호출 불가능
		u.stop();
		
		Fightable fa = new Fighter();
		fa.move(100, 200);
		fa.attack(fa);
//		fa.attack(u);	// Fightable 파라미터에는 Fightable을 구현한 객체만 올 수 있다
//		fa.stop();	// Fightable에는 stop()이 없어서 호출 불가능
		
		Fightable ft = f.getFightable();
		ft.move(100, 200);
		ft.attack(ft);
		ft.attack(f);
	}

}
