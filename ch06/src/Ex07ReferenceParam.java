class Data2 { int x; }

class Ex07ReferenceParam {	// 빈 스택
	public static void main(String[] args) {	// 스택 : main
		Data2 d = new Data2();	// 객체생성, 참조변수 연결
		d.x = 10;	// main()에서 생성한 인스턴스 d의 멤버변수 x에 10을 저장
		System.out.println("main() : x = " + d.x);

		change(d);	// 참조변수 d에 담긴 주소값이 change()의 Data2 d에 복사, 스택 : change-실행/(main-대기)
					// change()가 종료, 스택 : main-실행
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);	// main()의 d와 change()의 d가 같은 저장공간을 가리킴
													// change()에서 변경한 d.x의 값이 main()의 d.x에도 적용
	}	// 빈 스택

	static void change(Data2 d) { // 참조형 매개변수 : 가리키는 주소를 복사한다
		d.x = 1000;	// 지역변수 d, main()의 d와 같은 저장공간을 가리킴 -> 참조형 매개변수는 읽기&쓰기 모두 가능
		System.out.println("change() : x = " + d.x);
	}
}