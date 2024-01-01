class Ex12ReThrowing {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("main()에서 예외가 처리되었습니다.");
        }
    }

    static void method() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method()에서 예외가 처리되었습니다.");
            throw e;	// 다시 예외를 발생시킨다.
        }
    }
}