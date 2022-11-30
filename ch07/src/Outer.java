class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;

	class InstanceInner {
		int iv1 = outerIv;  // 외부 클래스의 private멤버도 접근가능하다.
		int iv2 = outerCv;
	}

	static class StaticInner {
// 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int iv = outerIv;
		static int cv = outerCv;
	}

	void myMethod() {
		int lv1 = 0;
		final int LV = 0;  // JDK1.8부터 final 생략 가능(값이 변하지 않은 변수는 상수로 간주)
		
		int lv2 = 0;
		lv2 = 1;

		class LocalInner {
			int iv1 = outerIv;
			int iv2 = outerCv;
//	외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int iv3 = lv1;	// 에러!!!(JDK1.8부터 에러 아님 : 값이 변하지 않은 변수는 상수로 간주)
			int iv4 = LV;	// OK
			
//			int iv5 = lv2;	// 에러, 값이 변한 변수는 final 생략 불가능
		}
		
		System.out.println(lv2);
		
		LocalInner li = new LocalInner();
		System.out.println(li.iv1);
		System.out.println(li.iv2);
		System.out.println(li.iv3);
		System.out.println(li.iv4);
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.myMethod();
	}
}
