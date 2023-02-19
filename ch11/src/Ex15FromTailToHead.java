import java.util.*;

class Ex15FromTailToHead {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for (int j : score) set.add(j);
		System.out.println("set : " + set);

		System.out.println("50���� ū ��(from tail) : "  + set.tailSet(50));
		System.out.println("50���� ���� ��(to head) : " + set.headSet(50));

		System.out.println("45�� 95 ������ �� : " + set.subSet(45, 95));
	}
}