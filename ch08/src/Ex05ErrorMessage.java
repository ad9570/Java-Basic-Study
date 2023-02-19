class Ex05ErrorMessage {
	public static void main(String args[]) {
		System.out.println(1);

		try {
			System.out.println(2);
			System.out.println(0 / 0); // 예외발생!!!
			System.out.println(3);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();	// java.lang.ArithmeticException: / by zero at Ex8_5.main(Ex8_5.java:8)
			System.out.println("메시지 : " + ae.getMessage());	// "/ by zero"
		}

		System.out.println(4);
	}
}