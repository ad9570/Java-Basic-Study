class Ex08CharArray {
	public static void main(String[] args) {
		// ���̰� 0�� char�迭�� �����Ѵ�.
		char[] cArr = new char[0];    // char[] cArr = {};�� ����.
		String s1 = new String(cArr);  // String s = new String("");�� ����.
		String s2 = new String("");

		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s1 + "@@@");
		System.out.println("@@@" + s2 + "@@@");
	}
}