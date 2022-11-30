class Outer2 {
	class InstanceInner {
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
		
		LocalInner li = new LocalInner();
		System.out.println("li.iv : " + li.iv);
	}
}

class Ex18InnerInstances {
	public static void main(String[] args) {
		System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);
        
	    // 스태틱 내부클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : " + si.iv);
		
		// 인스턴스 내부클래스의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야 한다.
//		Outer2.InstanceInner ii = new Outer2.InstanceInner();	// ERROR
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();

		System.out.println("ii.iv : " + ii.iv);
		
		// 지역 내부 클래스는 해당 메서드 밖에서 인스턴스를 생성할 수 없다.
//		Outer2.InstanceInner li = oc.new LocalInner();	// ERROR
		oc.myMethod();
	}
}