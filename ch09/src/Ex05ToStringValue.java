import java.util.Objects;

class Card2 {
	String kind;
	String number;

	Card2() {
		this("DIAMOND", "7");  // Card(String kind, int number)�� ȣ��
	}

	Card2(String kind, String number) {
		this.kind = kind;
		this.number = number;
	}

	// Object Ŭ������ toString()�� �������̵�
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}

	// Object Ŭ������ equals()�� �������̵�
	public boolean equals(Object obj) {
		if (!(obj instanceof Card2))
			return false;
		Card2 c = (Card2) obj;
		return this.kind.equals(c.kind) && this.number.equals(c.number);
	}

	// equals()�� �������̵� �ϸ� hashCode()�� �������̵� �ؾ� ��
	// Objects : ��ü ���� �޼��带 �����ϴ� ��ƿ Ŭ����
	// Objects.hash() : �Ű������� ��������(Object...) -> ���⿡ ���ϰ���� iv�� ���� ��� ���� ��� ������ ��
	public int hashCode() {
		return Objects.hash(kind, number);
	}
}

class Ex05ToStringValue {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", "Q");

		Card2 c3 = new Card2("DIAMOND", "7");
		System.out.println(c1.equals(c3));
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}