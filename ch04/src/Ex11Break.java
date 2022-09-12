class Ex11Break {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) { 	// 무한 반복문 while(true) {}
			if(sum > 100)
				break;
			++i;		// break문이 수행되면 이 부분은 실행되지 않고
			sum += i;	// while문을 완전히 벗어난다
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
		sum = 0;
		i   = 0;

		for(;;) {		// 무한 반복문 for(;;) {}
			if(sum > 100)
				break;
			++i;		// break문이 수행되면 이 부분은 실행되지 않고
			sum += i;	// for문을 완전히 벗어난다
		} // end of for

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}