// 부모 : Tv, 멤버 5개
class Tv {
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}
// 자식 : SmartTv, 멤버 7개(자신 2개 + 상속 5개)
class SmartTv extends Tv {  // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;     // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

class Ex01ChildMember {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();	// 7개 멤버(자신 2개 + 상속 5개) 생성
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		// 조상에 없는 멤버 호출시 : cannot be resolved or is not a field
		
		stv.displayCaption("Hello, World");
		stv.caption = true;	// 캡션(자막) 기능을 켠다.	       
		stv.displayCaption("Hello, World");
	}
}