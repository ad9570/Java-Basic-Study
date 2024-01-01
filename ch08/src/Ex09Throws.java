class Ex09Throws {
    public static void main(String[] args) throws Exception {
        method1();	// 같은 클래스 내의 static 멤버이므로 객체 생성 없이 직접 호출 가능.
        			// 메서드가 마지막까지 직접 처리되지 않아, 프로그램 비정상 종료
    }

    static void method1() throws Exception {
        method2();	// method1() 비정상 종료 후 선언된 예외를 main()에 넘김
    }

    static void method2() throws Exception {
        throw new Exception();	// method2() 비정상 종료 후 선언된 예외를 method1()에 넘김
    }
}