import java.util.Arrays;

class Ex08Shuffle {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            int n = 0;
            while (n == i) {
                n = (int) (Math.random() * 10);	// 0~9 중의 한 값을 임의로 얻는다. (바꿀 index로 쓸 값)
            }
            int tmp = numArr[i];	// 임의로 얻은 index값(n)의 요소와 i번째 요소(i)의 위치를 바꾼다.
            numArr[i] = numArr[n];
            numArr[n] = tmp;
            System.out.println(Arrays.toString(numArr));
        }
    }
}