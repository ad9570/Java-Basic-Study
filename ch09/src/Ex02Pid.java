class Person {
	long id;

	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;

		return id == ((Person) obj).id;
	}

	Person() {}

	Person(long id) {
		this.id = id;
	}
}

class Ex02Pid {
	public static void main(String[] args) {
		Person p1 = new Person(9009291234567L);
		Person p2 = new Person(9009291234567L);

		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");

		if(p1 == p2)
			System.out.println("p1�� p2�� ���� ��ü�Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ��ü�Դϴ�.");
	}
}