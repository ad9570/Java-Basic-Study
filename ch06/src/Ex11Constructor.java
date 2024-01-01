class Data_1 {
    int value;

//	Data_1() {	// 생성자가 하나도 없을 땐, 컴파일러가 기본 생성자 자동 생성
//		value = 0;
//	}
}

class Data_2 {
    int value;

    Data_2(int x) {   // 매개변수가 있는 생성자.
        value = x;
    }

    Data_2() {    // 매개변수가 있는 생성자 사용 시, 기본 생성자를 직접 작성해 주어야 한다.
        value = 2;
    }
}

class Ex11Constructor {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // compile error발생 : The constructor Data_2() is undefined
        Data_2 d3 = new Data_2(5);

        System.out.println(d1.value);
        System.out.println(d2.value);
        System.out.println(d3.value);
    }
}