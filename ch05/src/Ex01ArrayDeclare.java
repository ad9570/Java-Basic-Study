
class Ex01ArrayDeclare {
	public static void main(String[] args) {
//		int[] score;		// 배열 score를 선언(참조변수)
//		score = new int[5];	// 배열의 생성(int 저장공간 * 5)
		
		int[] score = new int[5];	// 길이가 5인 int배열의 선언과 생성을 동시에
		
		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		System.out.println("score[3] = " + score[3]);
		System.out.println("score[4] = " + score[4]);

		score[3] = 100;	// 배열 score의 4번째 요소에 100을 저장
		
		int value = score[3];
		System.out.println("value = " + value);
	}
}