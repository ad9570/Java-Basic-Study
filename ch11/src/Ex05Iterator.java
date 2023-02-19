import java.util.*;

class Ex05Iterator {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();	// 어떤 콜렉션에든 사용 가능
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
		while(it.hasNext()) {	// 한 번 읽은 Iterator는 다시 앞으로 감을 수 없음 = Iterator는 일회용
			Object obj = it.next();
			System.out.println(obj);
		}

		System.out.println("-- 3rd Read --");
		it = c.iterator();	// Iterator를 다시 사용 하려면 새로운 객체를 만들어야함

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		System.out.println("-- 4th Read --");
		for (String element : c)	// Iterator로 읽는 방법 대신 강화된 for문을 활용해 읽을수도 있음
			System.out.println(element);

		System.out.println("==== END ====");
	}
}