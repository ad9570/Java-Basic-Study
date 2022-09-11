class Ex07Arr2D {
	public static void main(String[] args) {
		int[][] score = {
				  { 100, 100, 100 }
				, { 20 }
				, { 30, 30 }
				, { 40, 40, 40, 40 }
		};							// 4행 3열 -> 크기 변경
		int sum = 0;

		for (int i = 0; i < score.length; i++) {		// score.length = 4
			for (int j = 0; j < score[i].length; j++) {	// score[i].length = 3, 3, 3, 3 -> 3, 1, 2, 4
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);	// 4 * 3 = 12회 반복 -> 10회 반복

				sum += score[i][j];
			}
		}

		System.out.println("sum=" + sum);
	}
}