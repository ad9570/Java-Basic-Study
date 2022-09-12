class Ex04RandomNumber {
	public static void main(String args[]) {
		int num = 0;

		// 1~10 사이의 난수 20개를 출력
		for (int i = 1; i <= 20; i++) {
//			System.out.println(Math.random());
//			System.out.println(Math.random()*10);
//			System.out.println((int)(Math.random()*10));
			num = (int)(Math.random() * 10) + 1;
			System.out.println(num);
		}
		System.out.println();
		
		// -5~5 사이의 난수 20개를 출력
		for (int i = 1; i <= 20; i++) {
			num = (int)(Math.random() * 11) - 5;
			System.out.println(num);
		}
	}
}