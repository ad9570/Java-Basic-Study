class Ex01Equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");

		Value2 v3 = new Value2(20);
		Value2 v4 = new Value2(20);

		if (v3.equals(v4))
			System.out.println("v3�� v4�� �����ϴ�.");
		else
			System.out.println("v3�� v4�� �ٸ��ϴ�.");
	}
} 

class Value {
	int value;

	Value() {}

	Value(int value) {
		this.value = value;
	}

//	public boolean equals(Object obj) {	// Object ��ü�� equals()
//		return this == obj;	// �ּ� ��
//	}
}

class Value2 {
	int value;

	Value2() {}

	Value2(int value) {
		this.value = value;
	}

	public boolean equals(Object obj) {	// �������̵� �� equals()
		if (!(obj instanceof Value2))	// ����ȯ ���� ���� ���� Ȯ��
			return false;
		Value2 v = (Value2) obj;	// Object Ÿ�� obj�� Value2 Ÿ������ ����ȯ
		return this.value == v.value;	// �� ��
	}
}