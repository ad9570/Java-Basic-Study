class Ex11Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

		long s = System.currentTimeMillis();
        while (true) {    	// 무한 반복문 while(true) {}
			long e = System.currentTimeMillis();
            if (e - s > 1000L) {
				break;
			}
            ++i;        	// break문이 수행되면 이 부분은 실행되지 않고
            sum += i;
        }					// -> while문을 완전히 벗어난다

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);

        sum = 0;
        i = 0;

		s = System.currentTimeMillis();
        for (;;) {        	// 무한 반복문 for(;;) {}
			long e = System.currentTimeMillis();
            if (e - s > 1000L) {
				break;
			}
            ++i;        	// break문이 수행되면 이 부분은 실행되지 않고
            sum += i;
        }					// -> for문을 완전히 벗어난다

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}