class Ex01Equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");

		Value2 v3 = new Value2(20);
		Value2 v4 = new Value2(20);

		if (v3.equals(v4))
			System.out.println("v3과 v4는 같습니다.");
		else
			System.out.println("v3과 v4는 다릅니다.");
	}
} 

class Value {
	int value;

	Value() {}

	Value(int value) {
		this.value = value;
	}

//	public boolean equals(Object obj) {	// Object 객체의 equals()
//		return this == obj;	// 주소 비교
//	}
}

class Value2 {
	int value;

	Value2() {}

	Value2(int value) {
		this.value = value;
	}

	public boolean equals(Object obj) {	// 오버라이딩 된 equals()
		if (!(obj instanceof Value2))	// 형변환 가능 여부 먼저 확인
			return false;
		Value2 v = (Value2) obj;	// Object 타입 obj를 Value2 타입으로 형변환
		return this.value == v.value;	// 값 비교
	}
}