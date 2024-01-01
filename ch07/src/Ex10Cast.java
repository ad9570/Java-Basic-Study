@SuppressWarnings("all")
class Ex10Cast {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
//		Ambulance am = new Ambulance();

        fe.water();

        car = fe;    	// 조상타입 ← 자손타입. car = (Car)fe;에서 형변환이 생략됨
//		car.water();	// ERROR, 조상타입 참조변수로 자손타입만 가진 멤버 사용 불가능
        car.drive();

        fe2 = (FireEngine) car; // 자손타입 ← 조상타입. 형변환 생략 불가
        fe2.water();

//		fe = (FireEngine) am;	// ERROR, 조상-자손 관계가 아닌 클래스 타입 간 형변환 불가
    }
}

@SuppressWarnings("unused")
class Car {
    String color;
    int door;

    void drive() {    // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {    // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {    // 소방차
    void water() {    // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}

@SuppressWarnings("unused")
class Ambulance extends Car {
    void siren() {
        System.out.println("zzz");
    }
}