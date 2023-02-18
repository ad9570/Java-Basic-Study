import java.util.*;

class Ex10HashSetSort {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);    // num -> new Integer(num)
		}
		System.out.println(set);

		/* Set�� ���� �Ұ��� : ���Ŀ� ������ �ʿ�
		 * set�� ���� List ���� �� ����
		 */
		List<Integer> list = new LinkedList<>(set);	// LinkedList(Collection c) : set�� ��� ��Ҹ� ���� List ����
		Collections.sort(list);						// Collections.sort(List list) : list�� ����
		System.out.println(list);
	}
}
