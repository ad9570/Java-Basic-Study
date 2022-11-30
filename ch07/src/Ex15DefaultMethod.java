class Ex15DefaultMethod {
	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod(); 	// 구현하지 않은 인터페이스의 static메서드 사용 가능
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {	
		System.out.println("method1() in Child3"); // 자손이 오버라이딩
	}			
}

class Parent3 {
	public void method2() {	
		System.out.println("method2() in Parent3");	// 인터페이스보다 부모클래스 메소드가 우선
	}
}

interface MyInterface {
	default void method1() { 
		System.out.println("method1() in MyInterface");
	}

	default void method2() { 
		System.out.println("method2() in MyInterface");
	}

	static void staticMethod() { 
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() { 
		System.out.println("method1() in MyInterface2");
	}

	static void staticMethod() { 
		System.out.println("staticMethod() in MyInterface2");
	}
}