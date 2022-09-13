class Data { int x; }

class Ex06PrimitiveParam {	// 빈 스택
	public static void main(String[] args) {	// 스택 : main-실행
		Data d = new Data();	// 객체생성, 참조변수 연결
		d.x = 10;	// main()에서 생성한 인스턴스 d의 멤버변수 x에 10을 저장
		System.out.println("main() : x = " + d.x);

		change(d.x);	// d.x값이 change()의 int x에 복사, 스택 : change-대기/(main-실행)
						// change()가 종료되면 change()의 지역변수 x도 사라짐, 스택 : main-실행
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);	// 1000의 저장됐던 change()의 지역변수 x는 사라졌음
													// main()의 d.x값은 원래 10이었고 변한적이 없음
	}	// 빈 스택

	static void change(int x) {  // 기본형 매개변수 : 값을 복사한다
		x = 1000;	// 지역변수 x, main()의 d.x와 다른 저장공간 -> 기본형 매개변수는 읽기만 가능
		System.out.println("change() : x = " + x);
	}
}