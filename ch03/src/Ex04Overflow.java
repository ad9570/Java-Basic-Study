class Ex04Overflow {
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만 = 10^6
		int b = 2_000_000;    // 2,000,000   2백만 = 2*10^6

		long c = a * b;       // a * b = 2,000,000,000,000 = 2*10^12 > int의 범위는 10^9 : 오버플로우 발생
		
		long d = (long)a * b; // a, b 중 1개만 long으로 변환해도 산술 변환으로 나머지 하나까지 long으로 변환됨

		System.out.println(c);
		System.out.println(d);
	}
}