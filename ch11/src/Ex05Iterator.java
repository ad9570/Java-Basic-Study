import java.util.*;

class Ex05Iterator {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();	// � �ݷ��ǿ��� ��� ����
		readElements(c1);

		Collection<String> c2 = new HashSet<>();
		readElements(c2);
	}

	private static void readElements(Collection<String> c) {
		System.out.println("==== BEGIN ====");
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("4");

		System.out.println("-- 1st Read --");
		Iterator<String> it = c.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		System.out.println("-- 2nd Read --");
		while(it.hasNext()) {	// �� �� ���� Iterator�� �ٽ� ������ ���� �� ���� = Iterator�� ��ȸ��
			Object obj = it.next();
			System.out.println(obj);
		}

		System.out.println("-- 3rd Read --");
		it = c.iterator();	// Iterator�� �ٽ� ��� �Ϸ��� ���ο� ��ü�� ��������

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		System.out.println("-- 4th Read --");
		for (String element : c)	// Iterator�� �д� ��� ��� ��ȭ�� for���� Ȱ���� �������� ����
			System.out.println(element);

		System.out.println("==== END ====");
	}
}