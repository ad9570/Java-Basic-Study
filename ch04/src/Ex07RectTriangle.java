class Ex07RectTriangle {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
        System.out.println();

//		System.out.println("**********");

        for (int i = 1; i <= 10; i++) {
            System.out.println("**********");
        }
        System.out.println();

//		for (int j = 1; j <= 10; j++) {
//			System.out.print("*");
//		}
//		System.out.println();

        for (int i = 1; i <= 10; i++) {        	// i : 행
            for (int j = 1; j <= 10; j++) {    	// j : 열, 열의 갯수(10)가 리터럴
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {        	// i : 행
            for (int j = 1; j <= i; j++) {    	// j : 열, 열의 갯수(i)가 변수
                System.out.print("*");
            }
            System.out.println();
        }
    }
}