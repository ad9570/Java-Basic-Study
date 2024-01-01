class Ex05For {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { 		// 괄호{}안의 문장을 5번 반복(i = 1, 2, 3, 4, 5)
			System.out.println("Hello " + i);
		}
		System.out.println();
		for (int i = 14; i <= 18; i++) { 	// 괄호{}안의 문장을 5번 반복(i = 14, 15, 16, 17, 18)
			System.out.println("Hello " + i);
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=2) { 	// 괄호{}안의 문장을 5번 반복(i = 1, 3, 5, 7, 9)
			System.out.println("Hello " + i);
		}
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.println("Hello " + i);
		}
		System.out.println();
		for (int i = 1, j = 10; i <= 10; i++, j--) { 	// 같은 타입인 두 개 이상의 제어 변수를 사용 가능하다.
			System.out.println("Hello " + i + " " + j);
		}
//		System.out.println(i);	// for문 안에서 선언된 제어 변수는 for문 밖에서 사용할 수 없다.
		System.out.println();
		
		int i;	// 변수의 scope(범위) - 선언위치부터 선언된 블럭의 끝까지, 좁을수록 좋다.
		for (i = 1; i <= 10; i++) {			// 같은 타입인 두 개 이상의 제어 변수를 사용 가능하다.
			System.out.println("Hello " + i);
		}
		System.out.println(i);
		
		int j = 1;
		long s = System.currentTimeMillis();
		for (;;) { // 초기화, 조건식, 증감식은 쓰지 않을 수 있다.
			System.out.println("Hello " + j); // 조건식을 쓰지 않을 경우 true로 간주되어 무한 반복문이 된다.
			j += 7;

			// 무한 반복문엔 적당한 탈출 조건을 직접 만들어놓아야 함
			long e = System.currentTimeMillis();
			if (e - s > 2000L) {
				break;
			}
		}
	}
}