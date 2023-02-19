import java.util.*;

class Ex11SetEquals {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David",25));
		set.add(new Person("David",25));	// equals()�� hashCode()�� �������̵� ���� ���� Ŭ����
		set.add(new Room("9", 7));
		set.add(new Room("9", 7));		// equals()�� hashCode()�� �������̵� �� Ŭ����

		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}

class Room {
	String floor;
	int number;

	Room(String floor, int number) {
		this.floor = floor;
		this.number = number;
	}
	Room() {
		this("Lobby", 0);
	}

	@Override
	public String toString() {
		return floor + (number < 10 ? "0" : "") + number;
	}

	@Override
	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
		if (!(o instanceof Room)) return false;

		Room room = (Room) o;
		return number == room.number && Objects.equals(floor, room.floor);
		// Objects.equals(a, b) : a != null && a.equals(b)
	}

	@Override
	public int hashCode() {
		return Objects.hash(floor, number);	// public static int hash(Object... values) : ��������
	}
}