class Ex04MultiCatch {
	public static void main(String args[]) {
		System.out.println(1);

		try {
			System.out.println(2);
			System.out.println(args[0]);	// ArrayIndexOutOfBoundsException �߻�
			System.out.println(3);	// ������� �ʴ´�.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException)
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ie) {	// ó��
			if (ie instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){
			System.out.println("Exception");
		}	// try-catch�� ��
		System.out.println(4);

		try {
			System.out.println(5);
			System.out.println(0 / 0);	// ArithmeticException �߻�
			System.out.println(6); 	// ������� �ʴ´�.
		} catch (ArithmeticException ae)	{	// ó��
			if (ae instanceof ArithmeticException) 
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ie) {
			if (ie instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){
			System.out.println("Exception");
		}	// try-catch�� ��
		System.out.println(7);

		try {
			System.out.println(8);
			String s = null;
			System.out.println(s.length());	// NullPointerException �߻�
			System.out.println(9); 	// ������� �ʴ´�.
		} catch (ArithmeticException ae)	{
			if (ae instanceof ArithmeticException)
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ie) {
			if (ie instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){	// ó��, ��� ������ �ְ������� Exception
			System.out.println("Exception");
		}	// try-catch�� ��
		System.out.println(10);
	}	// main�޼����� ��
}