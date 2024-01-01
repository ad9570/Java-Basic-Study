import java.util.*;

class Ex10HashSetSort {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);    // num -> new Integer(num)
        }
        System.out.println(set);

        /* Set은 정렬 불가능 : 정렬엔 순서가 필요
         * set을 담은 List 생성 후 정렬
         */
        List<Integer> list = new LinkedList<>(set);    // LinkedList(Collection c) : set의 모든 요소를 담은 List 생성
        Collections.sort(list);                        // Collections.sort(List list) : list를 정렬
        System.out.println(list);
    }
}
