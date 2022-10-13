abstract class Player {	// 추상 클래스(미완성 클래스)
	
	abstract void play(int position);	// 추상 메서드(미완성 메서드)
	abstract void stop();				// 선언부만 있고 구현부{}가 없는 메서드
	
}

class AudioPlayer extends Player {	// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
	
	void play(int position) {
		System.out.println(position + " 위치부터 재생합니다.");
	}
	
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	
}

abstract class BackgroundPlayer extends Player {	// 추상메서드 중 일부만 구현한 자손클래스도 추상클래스
	
	void play(int position) {
		System.out.println(position + " 위치부터 재생합니다.");
	}
	// 실제로는 abstract void stop();이 포함되어 있음
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();	// ERROR, 추상 클래스의 객체 생성 불가
		AudioPlayer ap1 = new AudioPlayer();
		Player ap2 = new AudioPlayer();	// OK, 다형성
		
		ap1.play(100);
		ap2.stop();
	}

}
