import java.util.Arrays;

public class Ex15Arrays {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 0 };				// 1차원 배열 arr
		int[][] arr2D = { { 11, 12 }, { 21, 22 } };	// 2차원 배열 arr2D
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr2D));	// 참조변수 값 출력 - [[I@1eb44e46, [I@6504e3b2]
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = { { "aaa", "bbb" }, { "AAA", "BBB" } };
		
		System.out.println(str2D == str2D2);					// 참조변수 값 비교
		System.out.println(Arrays.equals(str2D, str2D2));		// 참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));	// 배열의 값 비교
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr5));
	}

}
