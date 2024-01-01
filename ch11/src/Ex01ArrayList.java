import java.util.*;

@SuppressWarnings({"unchecked", "rawtypes"})
class Ex01ArrayList {
    public static void main(String[] args) {
        // 기본 길이(capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        list1.add(5);   // OK, 오토박싱 -> list1.add(new Integer(5));
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        List sublist = list1.subList(1, 4);
        print(list1, sublist);

        // subList와 기존 리스트는 변경 시 상호 영향
        sublist.add(6);
        print(list1, sublist);

        // 기존 리스트 변경 시 subList 사용 불가능
        list1.remove(4);
        try {
            System.out.println("sublist = " + sublist + "\n");
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException 발생\n");
        }

        // subList와 list1이 상호작용 하지 않도록 subList와 내용이 같은 새로운 ArrayList인 list2 생성
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collections : 컬렉션을 쉽게 다루는 메소드를 모은 유틸 클래스
        Collections.sort(list1);    // list1과 list2를 정렬한다.
        Collections.sort(list2);    // Collections.sort(List l)
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2) + "\n");

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2) + "\n");

        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);

        ArrayList list3 = new ArrayList(10);
        list3.add("1");
        list3.add(0);
        list3.add(1);
        ArrayList list4 = new ArrayList(list3);
        print(list3, list4);

        System.out.println("indexOf(\"1\") = " + list3.indexOf("1"));
        System.out.println("indexOf(1) = " + list3.indexOf(1) + "\n");  // OK, 오토박싱 -> list1.add(new Integer(1));

        list3.remove(1);                // 인덱스 1에 저장된 객체를 삭제
        list4.remove(Integer.valueOf(1));   // 값이 1인 Integer 객체를 삭제
        print(list3, list4);
    }

    static void print(List list1, List list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}