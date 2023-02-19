import java.util.*;

class Ex17Entry {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("KIM", 90);
        map.put("KIM", 100);
        map.put("LEE", 100);
        map.put("KANG", 80);
        map.put("AHN", 90);

        /*
        * Map 인터페이스 -> 내부 인터페이스 Entry
        * 인터페이스의 내부 클래스 / 내부 인터페이스는 모두 static(접근제어자 생략 가능)
        * static이기 때문에 Map.Entry와 같이 표현 가능
        */
        Set<Map.Entry<String, Integer>> eSet = map.entrySet();

        for (Map.Entry<String, Integer> e : eSet)
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());

        Set<String> kSet = map.keySet();
        System.out.println("참가자 명단 : " + kSet);

        Collection<Integer> values = map.values();
        Iterator<Integer> it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / eSet.size());
        // 컬렉션 안의 객체가 Comparable / Comparator를 구현했을 경우 사용 가능 : 최대값, 최소값
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
