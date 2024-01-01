class Ex12Arr2DCalc {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        	};                        // new int[5][3]
        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호\t 국어\t 영어\t 수학\t 총점\t 평균");
        System.out.println("==============================================");

        for (int i = 0; i < score.length; i++) {	// score.length : 사람 수 = 5
            int sum = 0;  	// 개인별 총점
            float avg;  	// 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d\t", i + 1);

            for (int j = 0; j < score[i].length; j++) {    // score[i].length : 과목 수 = 3
                sum += score[i][j];
                System.out.printf("%5d\t", score[i][j]);
            }

            avg = sum / (float) score[i].length;  // 평균계산 = 총점 / 과목 수
            System.out.printf("%5d\t %5.1f%n", sum, avg);
        }

        System.out.println("==============================================");
        System.out.printf("합계:\t%5d\t %4d\t %4d%n", korTotal, engTotal, mathTotal);
    }
}