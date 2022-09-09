class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println(Math.round(pi*1000));
		
		System.out.println(Math.round(pi*1000)/1000);
		System.out.println(Math.round(pi*1000)/(double)1000);
		System.out.println(Math.round(pi*1000)/1000.0);
		
		double shortPi = Math.round(pi * 1000) / 1000.0;	// Math.round()는 소수점 첫째 자리에서만 반올림한다.
		System.out.println(shortPi);
		
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000);
		System.out.println((int)(pi*1000)/1000.0);
		
		double lostPi = (int)(pi*1000)/1000.0;
		System.out.println(lostPi);
	}
}