import java.util.*;

class Ex12MathematicsSet {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();
        HashSet<String> interSet = new HashSet<>();
        HashSet<String> differSet = new HashSet<>();
        HashSet<String> unionSet = new HashSet<>();

        Collections.addAll(setA, "1", "2", "3", "4", "5");
        System.out.println("A = " + setA);

        Collections.addAll(setB, "4", "5", "6", "7", "8");
        System.out.println("B = " + setB);

        Iterator<String> it = setB.iterator();
        while (it.hasNext()) {
            String tmp = it.next();
            if (setA.contains(tmp)) {
				interSet.add(tmp);
			}
        }

        it = setA.iterator();
        while (it.hasNext()) {
            String tmp = it.next();
            if (!setB.contains(tmp)) {
                differSet.add(tmp);
            }
        }

        it = setA.iterator();
        while (it.hasNext()) {
            unionSet.add(it.next());
        }

        it = setB.iterator();
        while (it.hasNext()) {
            unionSet.add(it.next());
        }

        System.out.println("== Iterator ==");
        System.out.println("A ∩ B = " + interSet);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = " + differSet);
        System.out.println("A U B = " + unionSet);  // 한글 ㄷ을 누르고 한자키

        interSet = new HashSet<>(setA);
        interSet.retainAll(setB);

        differSet = new HashSet<>(setA);
        differSet.removeAll(setB);

        unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);

        System.out.println("== retainAll, removeAll, addAll ==");
        System.out.println("A ∩ B = " + interSet);
        System.out.println("A - B = " + differSet);
        System.out.println("A U B = " + unionSet);
    }
}