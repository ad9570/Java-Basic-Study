class Ex06LiteralNew {
	public static void main(String[] args) {
		String str1 = "abc";	// ���� ������ ���� String �ν��Ͻ� ����
		String str2 = "abc";	// ���� ������ ���� String �ν��Ͻ� ����
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ?  " + (str1 == str2) + "(�ν��Ͻ� �ּ� ��)");
		System.out.println("str1.equals(str2) ? " + str1.equals(str2) + "(����� �� ��)");
		System.out.println();

		String str3 = new String("abc");	// ���� ���Ƶ� ���� �ٸ� String �ν��Ͻ� ���
		String str4 = new String("abc");	// ���� ���Ƶ� ���� �ٸ� String �ν��Ͻ� ���

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4) + "(�ν��Ͻ� �ּ� ��)");
		System.out.println("str3.equals(str4) ? " + str3.equals(str4) + "(����� �� ��)");
	}
}