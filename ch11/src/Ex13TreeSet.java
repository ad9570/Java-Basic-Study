import java.util.*;

class Ex13TreeSet {
	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();	// �ڵ� ����
		while (set1.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			set1.add(num);  // num -> new Integer(num), Integer�� Comparable�� ������ ����
		}
		System.out.println(set1);

		Set<Object> set2 = new TreeSet<>();
		try {
			while (set2.size() < 6)
				set2.add(new TestNoComp());
			System.out.println(set2);
		} catch (ClassCastException e) {
			System.out.println("ClassCastException �߻�(TreeSet�� �񱳱����� �ʿ�)");
		}

		Set<TestComp1> set3 = new TreeSet<>(new TestComp1());	// TestComp1�� Comparator�� �񱳱������� ���
		while (set3.size() < 6)
			set3.add(new TestComp1());
		System.out.println(set3);

		Set<TestComp2> set4 = new TreeSet<>();	// �⺻������ TestComp2�� Comparable�� �񱳱������� ���
		while (set4.size() < 6)
			set4.add(new TestComp2());
		System.out.println(set4);

		Set<TestNoComp> set5 = new TreeSet<>(new TestComp1());	// �ش� ��ü �ܺ��� �񱳱��� ��� ����
		while (set5.size() < 6)
			set5.add(new TestNoComp());
		System.out.println(set5);
	}
}

class TestNoComp {}

class TestComp1 implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		return Objects.hash(o1, o2);
	}
}

class TestComp2 implements Comparable<Object> {
	@Override
	public int compareTo(Object o) {
		return Objects.hash(this, o);
	}
}