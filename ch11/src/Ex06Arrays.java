import java.util.*;

@SuppressWarnings("all")
class Ex06Arrays {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.toString(arr2D));
        System.out.println("arr2D(deep) = " + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 1, 8);

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
        System.out.println("arr7(fill) = " + Arrays.toString(arr7));

        Arrays.fill(arr7, 1, 3, 7);  // arr=[9,7,7,9,9]
        System.out.println("arr7(fill from to) = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 5) + 1);    // i -> (int) (Math.random() * 5) + 1 : 람다식
        System.out.println("arr7(setAll) = " + Arrays.toString(arr7));

//		for (int i = 0; i < arr.length; i++) {
        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');                // 현재 배열에 저장된 값 만큼의 길이를 가진 '*'배열 생성
            System.out.println(new String(graph) + i);  // 문자배열 -> 문자열 : String 생성자 / 문자열 -> 문자배열 : toCharArray()
        }

        String[][] str2D1 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println("equals = " + Arrays.equals(str2D1, str2D2));
        System.out.println("deepEquals = " + Arrays.deepEquals(str2D1, str2D2));

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("== Before sorting ==");
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B(binary) = " + Arrays.binarySearch(chArr, 'B'));

        Arrays.sort(chArr);

        System.out.println("== After sorting ==");
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("index of B(binary) = " + Arrays.binarySearch(chArr, 'B'));
    }
}