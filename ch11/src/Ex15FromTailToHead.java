import java.util.*;

class Ex15FromTailToHead {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int j : score) {
            set.add(j);
        }
        System.out.println("set : " + set);

        System.out.println("50보다 큰 값(from tail) : " + set.tailSet(50));
        System.out.println("50보다 작은 값(to head) : " + set.headSet(50));

        System.out.println("45와 95 사이의 값 : " + set.subSet(45, 95));
    }
}