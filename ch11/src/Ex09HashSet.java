import java.util.*;

@SuppressWarnings("all")
class Ex09HashSet {
    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"};    // 1 -> new Integer(1)
        Set<Object> set1 = new HashSet<>();
        Set<Object> set2 = new HashSet<>();

        // HashSet에 objArr의 요소들을 각각 저장 + 저장 결과 출력(for문 이용)
        for (Object o : objArr) {
            System.out.println(set1.add(o) + " (" + o + ")");
        }

        // HashSet에 objArr의 요소들을 모두 저장(Collections 이용)
        Collections.addAll(set2, objArr);

        // HashSet에 저장된 요소들을 한번에 출력한다.
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        // HashSet에 저장된 요소들을 각각 출력한다.(Iterator 이용)
        Iterator<Object> it = set1.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            printFormat(o);
        }

        System.out.println();

        // HashSet에 저장된 요소들을 각각 출력한다.(for문 이용)
        for (Object o : set2) {
            printFormat(o);
        }
    }

    private static void printFormat(Object o) {
        if (o instanceof String) {
            System.out.printf(" \"%s\" ", o);
        } else if (o instanceof Integer) {
            System.out.printf("  %d  ", o);
        }
    }
}
