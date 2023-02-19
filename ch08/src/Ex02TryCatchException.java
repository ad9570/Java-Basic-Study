class Ex02TryCatchException {
	public static void main(String args[]) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(0 / 0);// 예외 발생
			System.out.println(3); 	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			System.out.println(4);
		}	// try-catch의 끝
		System.out.println(5);
	}
}
