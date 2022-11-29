class X {
	int i = 100;
	Y y = new Y();
	W w = new W();
	
	class W {
		void method() {
			System.out.println(i);	// 객체생성 없이 외부 클래스의 멤버 접근 가능
		}
	}
}

class Y {
	void method() {
		X x = new X();
		System.out.println(x.i);
	}
}

class Z {
	Y y = new Y();
//	W w = new W();	// 내부 클래스를 외부 클래스가 아닌 다른 클래스에서 접근하려면 다른 방법을 사용해야함
}

public class InnerTest {

	public static void main(String[] args) {
		Y y = new Y();
		y.method();
		
		X x = new X();
		x.w.method();
	}
	
}
