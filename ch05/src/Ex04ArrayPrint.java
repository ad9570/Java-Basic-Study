import java.util.Arrays;	// Ctrl + Shift + o : 자동 import

@SuppressWarnings("all")
public class Ex04ArrayPrint {
	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};	// 길이가 5인 int배열
		System.out.println(iArr);    		// [I@1eb44e46

        for (int i : iArr) {
            System.out.println(i);    		// 100 95 80 70 60
        }

		System.out.println(Arrays.toString(iArr));    // [100, 95, 80, 70, 60]
	}
}