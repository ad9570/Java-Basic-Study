import java.util.*;

class Ex14SubSet {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();	// TreeSet : ���� �˻��� ����

		String from = "b";	// ����
		String to	= "d";	// ������

		Collections.addAll(set, "abc", "alien", "bat", "car", "Car",
				"disc", "dance", "dZZZZ", "dzzzz", "elephant", "elevator", "fan", "flower");

		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}