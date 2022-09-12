class Ex03CharAndInt {
	public static void main(String args[]) {
		String str = "3";

		System.out.println(str.charAt(0));	// "3" -> '3'
		System.out.println(str.charAt(0) - '0');	// '3' -> 3
		
		System.out.println('3' - '0' + 1);	// 3+1
		System.out.println('3' + 1);	// '3'+1
		
		System.out.println(Integer.parseInt("3") + 1);	// 3+1
		System.out.println("3" + 1);	// "3"+1 = "31"
		
		System.out.println(3 + '0');	// '0'은 숫자로 48
		System.out.println((char)(3+'0'));	// 계산 후 문자로 형변환('3')
	}
}