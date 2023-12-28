public class Ex09Var3 {
	public static void main(String[] args) {
		final int score = 100;
//		score = 200;
		System.out.println("score = " + score);

		boolean power = true;
		System.out.println("power = " + power);

		byte b = 127;
		System.out.println("b = " + b);

		int oct = 010; 	// 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		System.out.println("oct = " + oct);
		System.out.println("hex = " + hex);	// println은 10진수로만 출력 가능

		long l1 = 1_000_000_000;
		long l2 = 10_000_000_000L;
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);

		float f = 3.14f;
		double d1 = 3.14;
		double d2 = 3.14f;
		System.out.println("f = " + f);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);

		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);

		char ch = 'A';
		int i = 'A';

		String str1 = ""; // 빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;

		System.out.println(ch);
		System.out.println(i);
		System.out.println(str4);

		System.out.println(str1 + 7 + 7);
		System.out.println(7 + 7 + str1);
	}
}
