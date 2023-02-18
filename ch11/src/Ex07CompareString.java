import java.util.*;

class Ex07CompareString {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};

		Arrays.sort(strArr); // String�� Comparable(�⺻ ���� ���)������ ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� ���� ���ϴ� ���� ���
		System.out.println("strArr = " + Arrays.toString(strArr));

		Arrays.sort(strArr, new DescStr<>()); // ���� ���� ���
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}

class DescStr<String> implements Comparator<String> {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;	// o1�� �⺻ ���Ĺ��
			Comparable c2 = (Comparable) o2;	// o2�� �⺻ ���Ĺ��
//			return c1.compareTo(c2) * -1 ;	// -1�� ���ؼ� �⺻ ���Ĺ���� ������ �����Ѵ�.
			return c2.compareTo(c1);		// ���� ������ �ǹ�
		}
		return -1;
	} 
}