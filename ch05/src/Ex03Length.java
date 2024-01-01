public class Ex03Length {
	public static void main(String[] args) {
		int[] arr = new int[8];	// 길이가 10인 int배열 arr을 생성, index범위 : 0 ~ 9 -> 길이 8로 수정
		System.out.println("arr.length = " + arr.length);

		for (int i = 0; i < 10; i++) {	// 배열의 index 범위를 벗어난 에러 ArrayIndexOutOfBoundsException
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
