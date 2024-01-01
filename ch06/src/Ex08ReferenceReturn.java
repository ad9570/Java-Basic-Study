class Data3 {
    int x;
}

class Ex08ReferenceReturn {    					// 빈 스택
    public static void main(String[] args) {    // 스택 : main
        Data3 d1 = new Data3();    				// 객체생성, 참조변수 연결
        d1.x = 10;    							// main()에서 생성한 인스턴스 d1의 멤버변수 x에 10을 저장

        Data3 d2 = copy(d1);    				// 참조변수 d1에 담긴 주소값이 copy()의 Data3 d에 복사
        										// 스택 : change-실행/(main-대기)
        										// copy()가 종료됨, 스택 : main-실행
        										// copy()에서 반환된 새로운 주소값이 main()에서 생성한 참조변수 d2에 저장
        										// copy()에서 생성된 저장공간이 main()에서 사용 가능하게 됨
        System.out.println("d1.x = " + d1.x);   // d1.x와 d2.x는 다른 저장공간을 사용하지만,
        System.out.println("d2.x = " + d2.x);   // copy()에서 x값을 복사했기 때문에 d1.x값과 d2.x값이 똑같다.
    }    										// 빈 스택

    static Data3 copy(Data3 d) {	// copy()의 지역변수 d - d1의 주소값이 복사됨
        Data3 tmp = new Data3();    // 새로운 객체 tmp를 생성한다. - 새로운 저장 공간

        tmp.x = d.x;	// d.x의 값을 tmp.x에 복사한다.

        return tmp;   	// x의 값을 복사한 새로운 객체의 주소를 반환한다.
    }
}