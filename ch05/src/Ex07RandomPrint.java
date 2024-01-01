import java.util.Arrays;

public class Ex07RandomPrint {
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};    	// index : 0~2
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);	// 0~2 임의의 값
            System.out.println(strArr[tmp]);
        }
    }
}