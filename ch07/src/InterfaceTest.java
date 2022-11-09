class A {
	public void method(B b) {
		b.method();
	}
}

class B {
	public void method() {
		System.out.println("method B");
	}
}

class C {
	public void method() {
		System.out.println("method C");
	}
}

class D {
	public void method(I i) {
		i.method();
	}
}

// E 클래스의 선언과 구현을 분리
interface I {
	public void method();
}

class E implements I {
	public void method() {
		System.out.println("method E");
	}
}

class F implements I {
	public void method() {
		System.out.println("method F");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());	// A가 B를 사용(A가 B에 의존)
//		a.method(new C());	// A의 코드를 변경하지 않으면 C 사용 불가능
		
		D d = new D();
		d.method(new E());	// D가 E를 사용(D가 E에 의존)
		d.method(new F());	// D의 코드를 변경하지 않아도 F 사용 가능
	}

}
