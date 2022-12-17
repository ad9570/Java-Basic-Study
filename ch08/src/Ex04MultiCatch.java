class Ex04MultiCatch {
	public static void main(String args[]) {
		System.out.println(1);

		try {
			System.out.println(2);
			System.out.println(args[0]);	// ArrayIndexOutOfBoundsException 발생
			System.out.println(3);	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException)
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ie) {	// 처리
			if (ie instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(4);

		try {
			System.out.println(5);
			System.out.println(0 / 0);	// ArithmeticException 발생
			System.out.println(6); 	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{	// 처리
			if (ae instanceof ArithmeticException) 
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ie) {
			if (ie instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(7);

		try {
			System.out.println(8);
			String s = null;
			System.out.println(s.length());	// NullPointerException 발생
			System.out.println(9); 	// 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException)
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ie) {
			if (ie instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){	// 처리, 모든 예외의 최고조상인 Exception
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(10);
	}	// main메서드의 끝
}