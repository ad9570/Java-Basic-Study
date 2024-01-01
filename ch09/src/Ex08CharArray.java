class Ex08CharArray {
	public static void main(String[] args) {
		// 길이가 0인 char배열을 생성한다.
		char[] cArr = new char[0];    	// char[] cArr = {};와 같다.
		String s1 = new String(cArr);	// String s = new String("");와 같다.
		String s2 = "";

		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s1 + "@@@");
		System.out.println("@@@" + s2 + "@@@");
		System.out.println(s1.equals(s2));
	}
}