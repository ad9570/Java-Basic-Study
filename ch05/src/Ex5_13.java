import java.util.Arrays;	// Ctrl + Shift + o : 자동 import

public class Ex5_13 {

	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};	// 길이가 5인 int배열
		System.out.println(iArr);	// [I@1eb44e46
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);	// 100 95 80 70 60
		}
		
		System.out.println(Arrays.toString(iArr));	// [100, 95, 80, 70, 60]
	}

}
