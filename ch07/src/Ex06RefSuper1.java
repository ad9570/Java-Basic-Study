class Ex06RefSuper1 {
	public static void main(String args[]) {
		Child1 c = new Child1();
		c.method();
	}
}

class Parent1 {
	int x = 10;	// super.x
}

class Child1 extends Parent1 {
	int x = 20;	// this.x

	void method() {
		System.out.println("x = " + x);	// 가까운 쪽을 따름
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}