import java.util.*;

import static java.util.Collections.*;    // static 임포트로 메서드 호출 시 Collections 생략 가능

class Ex19Collections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        System.out.println(list1);

        addAll(list1, 1, 2, 3, 4, 5);    // 가변 인자 : 나열된 요소 혹은 배열 혹은 컬렉션을 추가
        System.out.println("addAll : " + list1);

        rotate(list1, 2);    // 오른쪽으로 두 칸씩 이동, 맨 뒤의 요소는 맨 앞으로(순환)
        System.out.println("rotate : " + list1);

        swap(list1, 0, 2);    // i 번째와 j 번째를 교환(swap)
        System.out.println("swap : " + list1);

        shuffle(list1);    // 저장된 요소의 위치를 임의로 변경(섞기)
        System.out.println("shuffle : " + list1);

        sort(list1, reverseOrder());    // 역순 정렬 reverse(list1);와 동일
        System.out.println("sort(reverseOrder) : " + list1);

		reverse(list1);
		System.out.println("reverse : " + list1);

		shuffle(list1);
		System.out.println("shuffle : " + list1);

        sort(list1);    // 정렬
        System.out.println("sort : " + list1);

        int idx = binarySearch(list1, 3);  // 3이 저장된 위치(index)를 반환
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list1));
        System.out.println("min = " + min(list1));
        System.out.println("max(reverseOrder) = " + max(list1, reverseOrder()));

        fill(list1, 9); // list를 9로 채운다.
        System.out.println("fill(9) = " + list1);

        // list와 같은 크기의 새로운 list를 생성하고 7로 채운다. 단, 결과는 변경불가
        List<Integer> list2 = nCopies(list1.size(), 7);
        System.out.println("nCopies(copy + fill + unmodifiable) = " + list2);

		boolean disjoint = disjoint(list1, list2);
		System.out.println("disjoint = " + disjoint);	// 두 컬렉션 간에 공통요소가 없으면 true

        copy(list1, list2);
        System.out.println("copy from = " + list2);
        System.out.println("copy to = " + list1);

        replaceAll(list1, 7, 5);
        System.out.println("replaceAll(7 to 5) = " + list1);

        Enumeration<Integer> e = enumeration(list1);
        ArrayList<Integer> list3 = list(e);

        System.out.println("list3 = " + list3);
    }
}
